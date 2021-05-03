from pathlib import Path
from subprocess import STDOUT, run
from os.path import join
import concurrent.futures

regex = join('*/Repaired','*.java')
futures = []
for path in Path('./').rglob(regex):
        lines = open(path, "r").readlines()
        print(path)
        package = ".".join(str(path).split("\\")[1:-1]);
        package = f'package {package};\n\n'
        print(package);
        open(path, "w").writelines([package] + lines)
