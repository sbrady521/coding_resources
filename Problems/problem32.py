sum = 0
def generate(n, array):
    global sum
    if n == 1:
        #look for pandigital cases
        multLeftLen = 1
        multRightLen = 1
        productLen = len(array) - (multLeftLen + multRightLen)
        while multLeftLen <= len(array) - 2:
            multRightLen = 1
            productLen = len(array) - (multLeftLen + multRightLen)
            while productLen > 1 or (productLen == 1 and (multLeftLen == len(array) - 2) and (multRightLen != 2)):
                productLen = len(array) - (multLeftLen + multRightLen)
                counter1 = 0
                multLeft = 0
                powerten = multLeftLen - 1
                while counter1 < multLeftLen:
                    multLeft = multLeft + (array[counter1] * (10**powerten))
                    counter1 += 1
                    powerten -= 1
                counter2 = counter1
                counter1 = 0
                multRight = 0
                powerten = multRightLen - 1
                while counter1 < multRightLen:
                    multRight = multRight + (array[counter2] * (10**powerten))
                    counter2 += 1
                    counter1 += 1
                    powerten -= 1
                product = multRight * multLeft
                panProduct = 0
                counter1 = counter2
                counter2 = 0
                powerten = productLen - 1
                while counter2 < productLen:
                    panProduct = panProduct + (array[counter1] * (10**powerten))
                    counter1 += 1
                    counter2 += 1
                    powerten -= 1
                if product == panProduct:
                    print(str(multLeft) + ' x ' + str(multRight) + ' = ' + str(product) + ' is a pandigital product')
                    sum = sum + product
                #else:
                    #print(str(multRight) + ' x ' + str(multLeft) + ' = ' + str(product) + ' is not a pandigital product')
                multRightLen += 1
            multLeftLen += 1
        
    else:
        i = 0
        while i < (n - 1):
            generate(n-1, array)
            if n % 2 == 0:
                j = i
            else:
                j = 0
            temp = array[j]
            array[j] = array[n-1]
            array[n-1] = temp
            i += 1
        generate(n-1, array)
array = [1,2,3,4,5,6,7,8,9]
n = len(array)
generate(n, array)
print(str(sum))
