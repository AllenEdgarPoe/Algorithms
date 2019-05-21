import re
word = input()
croatia = ['c=','c-','dz=','d-','lj','nj','s=','z=']
for w in croatia:
    if re.findall(w,word):
        word = re.sub(w,'1',word)

print(len(word))