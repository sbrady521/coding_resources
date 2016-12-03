#include <stdio.h>
#include <stdlib.h>

int main()
{
    int invalid = 1;
    while(invalid == 1){
        int upperchar, digit, dollar = 0;
        char password[11];
        printf("Please enter a password(maximum 10 characters): ");
        scanf(" %s", password);
        int counter = 0;
        while(counter < 9){
            if(isalpha(password[counter])){
               if(isupper(password[counter])){
                    upperchar = 1;}
            }
            if(isdigit(password[counter])){
                digit = 1;
               }
            if(password[counter] == '$'){
                dollar = 1;
               }
            counter++;
        }
        if(dollar == 1 && digit == 1 && upperchar == 1){
            printf("\nThis password is valid\n");
            invalid = 0;
        }
        else{
            printf("\nThis password is invalid\n");
        }
    }
    return 0;
}
