#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int numplayers;
    puts("Player count(max 10): ");
    scanf("%d", &numplayers);

    while(numplayers > 10){
        if (numplayers > 10){
            puts("The number of players cannot exceed 10");
        }
        scanf("%d", &numplayers);

    }
    int playerscores[numplayers];
    char * playernames[numplayers];
    int i;
    for(i = 0 ; i < numplayers ; i++){
        printf("Enter the initials and score of player %d:\n",(i + 1) );
        printf("INITIALS: ");
        playernames[i] = (char*)(malloc(20));
        scanf("%s", playernames[i]);
        printf("SCORE: ");
        playerscores[i] = (char*)(malloc(5));
        scanf("%d", &playerscores[i]);
    }
    printf("Name \t Score");
    for(i = 0; i < numplayers ; i++){
        printf("\n%s \t %d", playernames[i], playerscores[i]);
    }



    FILE * fpointer;
    char * highscorenames[10];
    int highscores[10];
    fpointer = fopen("highscores.txt", "r");
    for(i=0;i<10;i++){
        highscorenames[i] = (char*)(malloc(20));
        //fgets(highscorenames[i], 20, fpointer);
        fscanf(fpointer, "%s", highscorenames[i]);
    }
    for(i=0;i<10;i++){
        highscores[i] = (int*)(malloc(10));
        //fgets(&highscores[i], 10, fpointer);
        fscanf(fpointer, "%i", &highscores[i]);
    }
    fclose(fpointer);
    printf("\nName \t Score");
    for(i = 0; i < 10 ; i++){
        printf("\n%s \t %i", highscorenames[i], highscores[i]);
    }

    int x;
    for(x=0;x<numplayers;x++){
        if (playerscores[x] > highscores[9]){
            highscores[9] = playerscores[x];
            highscorenames[9] = playernames[x];
        }

        int swap = 1;
        int tempint;
        char * tempstring;
        int strsize;
        while (swap == 1){
            swap = 0;
            i = 0;
            while(i < 9){
                if (highscores[i] < highscores[i + 1]){
                    tempint = highscores[i];
                    highscores[i] = highscores[i+1];
                    highscores[i + 1] = tempint;
                    swap = 1;
                    strsize = sizeof(highscorenames[i]) + 1;
                    tempstring = (char*)(malloc(strsize));
                    tempstring = highscorenames[i];
                    highscorenames[i] = highscorenames[i + 1];
                    highscorenames[i + 1] = tempstring;
                }
                i++;
            }
        }
    }
    printf("\nName \t Score");
    char tempholderstr[5] = "  ";

    for(i = 0; i < 10 ; i++){
        printf("\n%s \t %d", highscorenames[i], highscores[i]);
    }

    fpointer = fopen("highscores.txt", "w");
    for(i=0; i<10; i++){
        strcpy(tempholderstr, highscorenames[i]);
        strcat(tempholderstr, "\n");
        fputs(tempholderstr, fpointer);

    }
    for(i=0; i<10 ; i++){
        fprintf(fpointer, "%d\n", highscores[i]);
    }



    return 0;
}
