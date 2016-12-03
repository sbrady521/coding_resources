#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

void printCross(int crossSize){
    assert(crossSize % 2 == 1);
    int startLeft = 0;
    int startRight = crossSize - 1;
    int i;
    while(startLeft <= startRight){
        i = 0;
        while(i < crossSize){
            if(i == startLeft || i == startRight){
                printf("*");
            } else{
                printf(" ");
            }
            i++;
        }
        startLeft++;
        startRight--;
        printf("\n");
    }

    startLeft -= 2;
    startRight += 2;
    while(startRight != crossSize){
        i = 0;
        while(i < crossSize){
            if(i == startLeft || i == startRight){
                printf("*");
            } else{
                printf(" ");
            }
            i++;
        }
        startLeft--;
        startRight++;
        printf("\n");
    }
}

int main(int argc, char* argv[]){
    printCross(3);
    printf("\n");
    printCross(5);
    printf("\n");
    printCross(7);
    printf("\n");
    printCross(9);
    printf("\n");
    return EXIT_SUCCESS;
}
