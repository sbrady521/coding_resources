def generate(n, array):
    if n == 1:
        x = array
        print(x)
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
