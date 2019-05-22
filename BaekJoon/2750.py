N = int(input())
container = []


for _ in range(N):
    num = int(input())
    
    if len(container)==0:
        container.append(num)
    
    elif len(container)==1:
        if num >= container[0]:
            container.append(num)
        else:
            container = [num]+container

    else:
        temp1 = container
        temp2 = []
        isboolean = True
        while isboolean:
            if len(temp1)==0:
                isboolean = False
            elif num<temp1[-1]:
                temp = temp1[-1]
                temp1 = temp1[:-1]
                temp2 = [temp] + temp2
            else:
                isboolean = False
        
        container = temp1+[num]+temp2
for i in container:
    print(i)