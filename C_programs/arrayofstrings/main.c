#include <stdio.h>
#include <stdlib.h>

int main()
{
    char * beanslist[5];
    int i;
    for(i=0;i<5;i++){
        beanslist[i] = (char*)(malloc(20));
        scanf("%s", beanslist[i]);
    }
    for(i=0;i<5;i++){
        printf("%s\n", beanslist[i]);
    }
    return 0;
}
