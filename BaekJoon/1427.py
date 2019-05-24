nums = [int(i) for i in input()]
result = [str(j) for j in sorted(nums, reverse = True)]
print(''.join(result))