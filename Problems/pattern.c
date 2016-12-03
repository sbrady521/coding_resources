#include <stdlib.h>
#include <stdio.h>

#define ALPHSTART 65

void partP1(int size){
    int i = ALPHSTART;
    int mainCounter = 0;
    int x = 0;
    int rowCounter = 0;
    while(mainCounter <= size * 2){
        i = ALPHSTART;
        while(i < size + ALPHSTART - rowCounter){
            printf("%c", i);
            i++;
        }
        i--;
        x = 0;
        if(rowCounter != size){
            while(x < rowCounter * 2){
                printf(" ");
                x++;
            }
        }
        while(i >= ALPHSTART){
            printf("%c", i);
            i--;
        }
        if(rowCounter != size){
            printf("\n");
        }
        mainCounter++;
        if(mainCounter <= size){
            rowCounter++;
        }else{
            rowCounter--;
        }
    }
}

int main(int argc, char * argv[]){
    partP1(26);
    return EXIT_SUCCESS;
}
