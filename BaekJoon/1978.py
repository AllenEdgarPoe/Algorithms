int(input())
nums = [int(i) for i in input().split()]
count = 0
for num in nums:
    if num == 1:
        continue
    isPrime = True
    for i in range(2,int(num**0.5)+1):
        if num%i == 0:
            isPrime = False
            break
    if isPrime:
        count+=1
print(count)