N = int(input())

numList = []
for _ in range(N):
    num = int(input())
    numList.append(num)

numList.sort()

for l in numList:
    print(l)
    