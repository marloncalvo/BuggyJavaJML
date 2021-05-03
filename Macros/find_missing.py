from pathlib import Path

def find_missing(path: Path):
    if not path.is_dir(): return

    if not "Repaired" in path.name:
        for file in path.iterdir():
            if file.is_dir:
                find_missing(file)

    if "Repaired" in path.name:
        found = False
        for file in path.iterdir():
            if "Test.java" in file.name and file.stat().st_size > 0:
                found = True
                break

        if not found:
            print(f"Missing: {path}")

find_missing(Path("./"))

# regex = join('*/Repaired')
# for path in Path('./').rglob(regex):
#     found = False
#     for file in path.iterdir():
#         if "Test.java" in file.name:
#             found = True
#             break

#     if not found:
#         print("")