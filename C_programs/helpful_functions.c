#include <stdlib.h>
#include <stdio.h>

int main(int argc, char * argv[]){
    char c;
    int stringLen = 0;
    //this sets all values to 0, only works for 0
    int charCounter[255] = {0};

    while((c = getchar()) != EOF){
	printf("%c", c);
	stringLen++;
	charCounter[(int)c]++;

    }

    return EXIT_SUCCESS;
}
