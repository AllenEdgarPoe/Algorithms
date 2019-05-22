num_dict = {2:['A','B','C'],3:['D','E','F'],4:['G','H','I'],5:['J','K','L'],6:['M','N','O'],
7:['P','Q','R','S'],8:['T','U','V'],9:['W','X','Y','Z']}
words = input()
time = 0
for word in words:
    for num in num_dict:
        if word in num_dict[num]:
            time+=num+1
print(time)


