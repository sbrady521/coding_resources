#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void help();

int main()
{
    float coronaSD = 1.3;
    float summersSD = 1.2;
    float pureSD = 1.2;
    float strongbowSD = 1.4;
    float wildturkeyPC = 43.4;
    float jimbeanPC = 37.0;
    float avgginPC = 39.0;
    float avgvodPC = 38.0;
    float shottotal = 45.0;
    float standards;
    float absinthPC = 70.0;
    float amount;
    int userdrink;
    float userSD;
    int keepgoing = 1;
    while(keepgoing == 1){
        printf("\n\nEnter the corresponding number of your drink followed by the amount you drunk: \n\n");
        printf("\n\n(1) Beers\n(2) Ciders\n(3) Spirits\n(4) Finish\n");
        printf("Enter 1, 2, 3 or 4: ");
        scanf("%d", &userdrink);
        switch(userdrink){
            case 1 : printf("\n(1) Corona\n(2) Pure Blonde\n");
            printf("Enter 1 or 2: ");
            scanf("%d", &userdrink);
            printf("\nQuantity: ");
            scanf("%f", &amount);
            switch(userdrink){
                case 1 : userSD += coronaSD*amount;
                printf("\nadding %.1f standards drinks to your total", (coronaSD*amount));
                break;

                case 2 : userSD += pureSD*amount;
                printf("\nadding %.1f standards drinks to your total", (pureSD*amount));
                break;
            }
            break;

            case 2 : printf("\n(1) Summersbee\n(2) Strongbow\n");
            printf("Enter 1 or 2: ");
            scanf("%d", &userdrink);
            printf("\nQuantity: ");
            scanf("%f", &amount);
            switch(userdrink){
                case 1 : userSD += summersSD*amount;
                printf("\nadding %.1f standards drinks to your total", (summersSD*amount));
                break;

                case 2 : userSD += strongbowSD*amount;
                printf("\nadding %.1f standards drinks to your total", (strongbowSD*amount));
                break;
            }
            break;

            case 3 : printf("\n(1) Wild Turkey\n(2) Jim Bean\n(3) Vodka\n(4) Gin\n(5) Absinth\n\n");
            printf("enter 1, 2, 3, 4 or 5: ");
            scanf("%d", &userdrink);
            printf("\nQuantity: ");
            scanf("%f", &amount);
            switch(userdrink){
                case 1 : standards = (shottotal*(wildturkeyPC/100))/12.5;
                userSD += amount*standards;
                printf("adding %.1f standard drinks to your total",amount*standards );
                break;

                case 2 : standards = (shottotal*(jimbeanPC/100))/12.5;
                userSD += amount*standards;
                printf("adding %.1f standard drinks to your total",amount*standards );
                break;

                case 3 : standards = (shottotal*(avgvodPC/100))/12.5;
                userSD += amount*standards;
                printf("adding %.1f standard drinks to your total",amount*standards );
                break;

                case 4 : standards = (shottotal*(avgginPC/100))/12.5;
                userSD += amount*standards;
                printf("adding %.1f standard drinks to your total",amount*standards );
                break;

                case 5 : standards = (shottotal*(absinthPC/100))/12.5;
                userSD += amount*standards;
                printf("adding %.1f standard drinks to your total",amount*standards );
                break;
            }
            break;

            case 4 : keepgoing = 0;
            break;
        }
    }
    printf("\n\n\nYour total drinks tonight amounted to:\n\n\t\t %.1f standards\n\n\n\n", userSD);

    return 0;
}
