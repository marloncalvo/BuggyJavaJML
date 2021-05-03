from pathlib import Path
from subprocess import STDOUT, run
from os.path import join
import concurrent.futures

def run_process(path):
    f = open(join(path.parent.absolute(), 'counterexamples.txt'), "w")
    print(f'running: {path.absolute()}')
    run(
        ['openjml', '-esc', str(path.absolute()), '-subexpressions'],
        stdout=f,
        stderr=STDOUT
    )
    print(f'finished: {path.absolute()}')

with concurrent.futures.ThreadPoolExecutor(max_workers=4) as executor:
    regex = join('Repaired','*.java')
    futures = []
    for path in Path('./').rglob(regex):
        futures.append(executor.submit(run_process, path))