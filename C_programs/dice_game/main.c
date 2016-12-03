#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i;
    int dicerollsump;
    int dicerollsuma;
    int diceroll;
    int keepgoing = 1;
    char userguess;
    char answer;
    while(keepgoing = 1){
        dicerollsump = 0;
        for(i = 0; i < 3; i++){
            diceroll = (rand()%6) + 1;
            dicerollsump = dicerollsump + diceroll;
            }
        printf("The sum is %i\n", dicerollsump);
        puts("will the next roll be higher or lower('H' for higher or 'L' for lower)? ");
        scanf(" %c", &userguess);
        dicerollsuma = 0;
        for(i = 0; i < 3; i++){
            diceroll = (rand()%6) + 1;
            dicerollsuma = dicerollsuma + diceroll;
            }
        printf("The second sum is %i\n", dicerollsuma);
        if(dicerollsuma > dicerollsump){
            answer = 'H';
        }
        else if(dicerollsuma == dicerollsump){
            puts("they were the same, but you were still wrong...");
        }
        else{
            answer = 'L';
        }
        if(userguess == answer){
            printf("Good job, you were right!\n");
        }
        else{
            printf("Incorrect... Nice try though. idiot\n");
        }

    }
    return 0;
}
