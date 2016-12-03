#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int anagram(char str1[], char str2[]){
    int i = 0;
    int x;
    int str1len = strlen(str1);
    int str2len = strlen(str2);
    int returnValue = 0;
    int found[str2len];
    int tempFound = 0;
    if(str1len == str2len){
        while(i < str1len){
            x = 0;
            while(x < str2len){
                if(str1[i] == str2[i]){
                    printf("%d\n",str2[i]);
                }
                x++;
            }
            if(tempFound == 1){
                 found[i] = 1;
            } else{
                found[i] = 0;
            }
            i++;

        }
        int i = 0;
        returnValue = 1;
        while(i < str2len){
            if(found[i] != 1){
                returnValue = 0;
            }
        }
    }
    return returnValue;
}

int main(int argc, char * argv[]){
    int result = anagram("beans", "seanb");
    printf("result = %d\n", result);
}
