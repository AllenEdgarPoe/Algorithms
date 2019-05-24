N = int(input())
nums = []

for _ in range(N):
    nums.append(int(input()))

#making into 2 arrays
nums1 = nums[:int(len(nums)/2)]
nums2 = nums[int(len(nums)/2):]

def sorting(container):
    newContainer = []
    for _ in range(len(container)):
        index = container.index(max(container))
        newContainer = [max(container)] + newContainer
        container.pop(index)
    return newContainer

nums1_sorted = sorting(nums1)
nums2_sorted = sorting(nums2)


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

for i in new:
    print(i)