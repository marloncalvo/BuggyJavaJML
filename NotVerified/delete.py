import os
import subprocess
from pathlib import Path
import re

throws_regex = r"assertDoesNotThrow\(\s*\(\)\s+->\s+\{([\S\s]+?)\}\);"
throws_regex = re.compile(throws_regex)


with open("files") as lines:
    for line in lines:
        path = line[:line.index(":")]
        n = int(line[line.index(":")+1:line.index(":")+2]) - 1

        with open(path, "r") as file:
            lines = file.readlines()
            # pass

        with open(path, "w") as file:
            print(path)
            changed = False
            for i, line in enumerate(lines):
                if "org.junit.jupiter.api" in line:
                    changed = True
                    lines[i] = line.replace("org.junit.jupiter.api", "org.junit")
                    line = lines[i]
                if "BeforeEach" in line:
                    lines[i] = line.replace("BeforeEach", "Before")
                    changed = True
                if "org.junit.Assertions.assertThrows" in line:
                    lines[i] = ""
                
                if "Repaired" in line:
                    lines[i] = ""
                sline = line.strip()
                if sline.startswith("Queue "):
                    print("HM: " + sline)
                    lines[i] = line.replace("Queue", "StackQueue.Queue", 1)
                elif sline.startswith("Stack "):
                    print("HMM: " + sline)
                    lines[i] = line.replace("Stack", "StackQueue.Stack", 1)
            for i, line in enumerate(lines[:20]):
                line = line.strip()
                if "package" in line:
                    lines[i] = ""
                elif line.startswith("class"):
                    lines[i] = "public " + line[line.index("class"):]
                elif "import static org.junit.jupiter.api.Assertions.*;" in line:
                    lines[i] = "import static org.junit.Assert.*;"
                elif "import org.junit.jupiter.api.Test;" in line:
                    lines[i] = "import org.junit.Test;"

            lines = f"{os.linesep}".join(lines)
            match = throws_regex.search(lines)
            changed = False
            while match:
                repl = match.group(1)
                lines = lines[:match.start()] + repl + lines[match.end()+1:]
                match = throws_regex.search(lines, match.start() + len(repl))
                changed = True

            lines = lines.split(os.linesep)
            file.writelines(lines)

        # if changed:
        complete = False
        while not complete:
            path = Path(path)
            res = subprocess.run(["javac.exe", "-cp", "C:\\Users\\marloncalvo\\Downloads\\junit-4.13.2.jar;C:\\Users\\marloncalvo\\Downloads\\hamcrest-core-1.3.jar", "*.java"], capture_output=True, text=True, cwd=str(path.parent))
            if res.returncode != 0:
                print()
                print(f"Failed to compile: {path}")
                print(res.stderr)
                input("Press enter when done: ")
            else:
                complete = True