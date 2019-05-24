N = int(input())
nums = []

for _ in range(N):
    nums.append(int(input()))

#making into 2 arrays

def mergeSorting(container):
    mid = int(len(container)/2)
    nums1_sorted = mergeSorting(container[:mid])
    nums2_sorted = mergeSorting(contianer[mid:])

    index1 = 0
    index2 = 0
    new = []
    while len(nums1_sorted)>index1 and len(nums2_sorted)>index2:
        if nums1_sorted[index1]<=nums2_sorted[index2]:
            new.append(nums1_sorted[index1])
            index1+=1

        else:
            new.append(nums2_sorted[index2])
            index2+=1

    if index1>index2:
        new+=nums2_sorted[index2:]
    elif index2>index1:
        new+=nums1_sorted[index1:]

    return new

newContainer = mergeSorting(nums)

for i in newContainer:
    print(i)
