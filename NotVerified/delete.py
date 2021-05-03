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

        with open(path, "w") as file:
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

        #     new_lines = "\n".join(lines)
        #     match = throws_regex.search(new_lines)
        #     while match:
        #         print(new_lines)
        #         repl = match.group(1)
        #         new_lines = new_lines[:match.start()] + repl + new_lines[match.end()+1:]
        #         match = throws_regex.search(new_lines, match.start() + len(repl))
        #     print(new_lines)

            file.writelines(lines)

        # complete = False
        # while not complete:
        # path = Path(path)
        # res = subprocess.run(["javac.exe", "-cp", "C:\\Users\\marloncalvo\\Downloads\\junit-4.13.2.jar;C:\\Users\\marloncalvo\\Downloads\\hamcrest-core-1.3.jar", "*.java"], capture_output=True, text=True, cwd=str(path.parent))
            # if res.returncode != 0:
            #     print()
            #     print(f"Failed to compile: {path}")
            #     print(res.stderr)
            #     input("Press enter when done: ")
            # else:
            #     complete = True            