M = int(input())
N = int(input())

primeList = []
for i in range(M,N+1):
    if i == 1:
        continue
    elif i ==2:
        primeList.append(i)
        
    for j in range(2,i):
        if i%j == 0:
            break
        elif j == i-1:
            primeList.append(i)


if len(primeList) == 0:
    print(-1)
else:
    print(sum(primeList))
    print(primeList[0])

