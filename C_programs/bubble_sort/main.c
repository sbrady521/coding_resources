#include <stdio.h>
#include <stdlib.h>

int main()
{

}
int bubblesort(array, lenlist)
{
    int i = 0;
    int swap = 1;
    int temp;
    printf("initial list:");
    for(i = 0; i < lenlist; i++){
        printf(" %i ", numarray[i]);
        }

    while (swap == 1){
        swap = 0;
        i = 0;
        while(i < (lenlist - 1)){
            if (numarray[i] > numarray[i + 1]){
                temp = numarray[i];
                numarray[i] = numarray[i+1];
                numarray[i + 1] = temp;
                swap = 1;
            }
            i++;
        }
    }
    printf("\nSorted list:");
    for(i = 0; i < lenlist; i++){
        printf(" %i ", numarray[i]);
    }

    return array;
}

