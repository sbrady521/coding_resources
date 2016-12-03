term1 = 1
term2 = 2
sum = 3
runningtotal = 2
while term2 < 4000000 and term1 < 4000000 and sum < 4000000:
    term1 = sum + term2
    print(term1)
    if term1 % 2 == 0:
        runningtotal += term1
    term2 = sum + term1
    if term2 % 2 == 0:
        runningtotal += term2
    print(term2)
    sum = term1 + term2
    if sum % 2 == 0:
        runningtotal += sum
    print(sum)
print
print
print(runningtotal)
        
