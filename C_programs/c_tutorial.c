#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

//this line imports the defines constants in the header file 'Seans_info'
#include "Seans_info.h"

//This is called prototyping your function, and it effectively defines a function so that the mainline knows that its a function when you call it
void printsomething();
void AUDtoUSD(float AUDamount);
int calculatebonus(int yearsworked);
void PassByValue(int i);
void PassByReference(int * i);


int main()
{

    //This section demonstrates the use of variables
    char name[] = "beans";
    printf("hello my name is %s \n", name);

    char favourite_food[] = "nachos";
    printf("my favourite food is %s \n", favourite_food);

    int age;
    age = 18;
    printf("i am %d years old \n", age);

    strcpy(favourite_food, "chocolate");
    printf("actually, my favourite food is %s \n", favourite_food);
    //--------------------------------------------------------------

    //This section demonstrates the use of predefined constants
    int girlsAge = (AGE / 2) + 7;
    printf("%s can date girls who are older than %i \n", MYNAME, girlsAge);
    //--------------------------------------------------------------

    //This section demonstrates the scanf function, which recieves user input
    char username[20];
    printf("what is your name? \n");
    //A scanf string that is input must not have spaces, as C registers this as the end of a string
    scanf("%s", username);
    printf("Thanks, %s, i'll keep that in mind\n" , username);

    int userage;
    printf("And how old are you? \n");
    //All non-array variables must be referred to with a '&' symbol in front of it when it is used in the scanf function
    scanf("%i", &userage);
    printf("Alright %s, so you're %i years old\n", username, userage);
    //--------------------------------------------------------------

    //This section demonstrates how to temporarily change the data type of a variable
    float averageage;
    int age1 = 30;
    int age2 = 30;
    int age3 = 30;
    averageage = ((float)age1 + (float)age2 + (float)age3)/3;
    printf("the average age is %.2f\n", averageage);
    //--------------------------------------------------------------

    //This section demonstrates the syntax of an if statement
    if(averageage > 18){
        printf("the average test participent is an adult\n");
    }
    if(averageage == 20){
        printf("the average test participent is 20 exactly\n");
    }
    else if(averageage == 30){
        printf("the average test participent is 30 exactly\n");
    }
    else{
        printf("the average test participent is not exactly 20 or 30\n");
    }
    //--------------------------------------------------------------

    //This section demonstrates the syntax of an if statement
    char likeschocolate = 'n';
    char likesmilk = 'y';
    char likeschocolatemilk = 'y';
    if((likeschocolate == 'y' && likesmilk == 'y') || likeschocolatemilk == 'y'){
        printf("You like chocolate milk\n");
    }
    //--------------------------------------------------------------

    //This is another way of implementing a kind of if statement
    //(question) ? TrueCode : FalseCode
    (likeschocolatemilk = 'y') ? printf("you like chocolate milk 2\n") : printf("you don't like chocolate milk 2\n");
    //--------------------------------------------------------------

    //This section demonstates the syntax of an increment and a while loop
    int counter = 0;
    counter = 0;
    char test[] = "testing";
    while(counter < 7){
        printf(" %c\n", test[counter]);
        counter++;
    }
    //--------------------------------------------------------------

    //(PRE-TEST loop)this section demonstrates the difference in incremement operators, the top one adds one to 'a' before the instruction is run, and the bottom one adds one to 'a' after it is run
    int a = 5, b = 10, answer = 0;
    //add one to a here
    answer = ++a *b;
    printf("Answer: %d \n", answer);

    a = 5, b = 10, answer = 0;
    answer = a++ *b;
    //add one to a here
    printf("Answer: %d \n", answer);
    //--------------------------------------------------------------

    //syntax of a POST-TEST do while loop
    counter = 0;
    do{
        printf(" %i", counter);
        counter++;
    }while(counter < 10);
    //--------------------------------------------------------------

    //demonstrates the syntax of a for loop, or COUNTED LOOP, three expressions (starting number; ending number; step by value)
    counter = 0;
    for(counter = 0; counter <= 100; counter+=8){
        printf(" %i\n", counter);
    }
    //--------------------------------------------------------------

    //demonstrates the continue function, which brings the processing of the loop back up to the top of the loop
    int num = 1;
    do{
        if(num==6 || num==8){
            num++;
            continue;
        }
        printf(" %d is available \n", num);
        num++;
    }while(num <= 10);
    //--------------------------------------------------------------

    //Demonstrates the switch function, similar to the pseudocode 'case where'
    char grade = 'C';
    switch(grade){
        case 'A' : printf("Well done!\n");
        break;

        case 'B' : printf("good job.\n");
        break;

        case 'C' : printf("satisfactory\n");
        break;

        case 'D' : printf("Try harder\n");
        break;

        case 'F' : printf("You're a failure\n");
        break;

        default : printf("that's not even a grade\n");
        }
    //--------------------------------------------------------------

    //demonstrates the 'isalpha' and 'isdigit' functions, which return true if the character is a letter or a digit respectively
    int beans = '1';
    //int and char can be used interchangably in situations such as this

    if(isalpha(beans)){
        printf("%c is a part of the alphabet", beans);
    }
    else if(isdigit(beans)){
        printf("%c is a digit", beans);
    }
    else{
        printf("%c not even sure what that is", beans);
    }
    //--------------------------------------------------------------

    //Demonstrates the toupper function, which turns a character into upper case if it is lower case, or does nothing if it isn't lower case
    char a = 'a';
    char b = 'F';
    char c = '7';
    printf(" %c \n", toupper(a));
    printf(" %c \n", toupper(b));
    printf(" %c \n", toupper(c));
    //--------------------------------------------------------------

    //Demonstrates the strcat function, which concatonates to strings(part of the string library)
    char tuna[100] = "Hey ";
    strcat(tuna, "Sean")
    printf("%s \n", ham)
    //--------------------------------------------------------------

    //Demonstrates the use of the Puts and Gets statement, much more conventient then scanf and printf
    //the puts function automatically puts a new line character on the end of a statement, additionally, it does not accept conversion characters
    //The gets function accepts strings with spaces, unlike scanf
    char catsname[50];
    char catsfavfood[25];
    char sentence[75] = "";
    puts("whats the cats name? ");
    gets(catsname);
    puts("And what does it like to eat? ");
    gets(catsfavfood);
    strcat(sentence, catsname);
    strcat(sentence, " likes to eat ");
    strcat(sentence, catsfavfood);
    puts(sentence);
    //--------------------------------------------------------------


    //demonstrates some math operators for rounding(part of the math library), floor will round down and ceil will round up
    float beansnum = 5.34534;
    printf("beansnum is %f \n", floor(beansnum));
    printf("beansnum is %f \n", ceil(beansnum));
    //--------------------------------------------------------------

    //demonstrates the rand function, which generates a random number between 0 and 32000, by using modulas and addition we can create integers in a certain range
    int i;
    int diceroll;
    for(i = 0; i < 5; i++){
        diceroll = (rand()%6) + 1;
        printf(" %i\n", diceroll);
        }
    //--------------------------------------------------------------

    //demonstrates an array of integers and how to populate it
    int integerarray[4] = {2,4,2,7};
    int i;
    integerarray[4] = 10;
    for(i = 0; i < 5; i++){
        printf("%d ", integerarray[i]);
    }
    //--------------------------------------------------------------


    //demonstrates the use of pointers, which hold the value of a memory location, obtained by placing an Ampersand before a variable name
    int beans = 19;
    printf("Address \t Name \t Value \n ");
    printf("%p \t %s \t %i \n ", &beans, "beans", beans);
    int * pBeans = &beans;
    printf("%p \t %s \t %p \n ", &pBeans, "pBeans", pBeans);
    //This is called dereferencing a pointer, as pBeans hold an address, it finds the value at that address and prints it
    //'*pBeans' is the exact same as 'beans'
    printf("*pBeans: %d", *pBeans);
    //--------------------------------------------------------------

    //This section highlights how the name of an array actually stores the pointer to the first element in the array
    int meatballs[5] = {1,452,3455,23,4};
    int i = 0;
    printf("Identifier \t Address \t Value\n");
    for(i = 0; i < 5 ; i++){
            printf("meatballs[%d] \t %p \t %d\n", i, &meatballs[i], meatballs[i]);

    }
    printf("\nmeatballs: %p", meatballs);

    //By dereferencing the array name we can get the value of the first element
    printf("\n*meatballs: %d", *meatballs);

    //By adding numbers to the name of the array we can target other elements of the array aswell, in this situation we target the third element
    printf("\n*(meatballs + 2): %d\n\n", *(meatballs+2));
    //--------------------------------------------------------------

    //demonstrates how by using pointer variable we can create string variable which are easy to change
    char * movie1 = "The beans have returned";
    char movie2[] = "The beans have returned";
    movie1 = "New movie title";
    puts(movie1);
    //movie2 = "beans"; , we cannot run this line as stated before, movie2 is a pointer constant, and as such cannot be changed
    //movie1 on the other hand is a pointer VARIABLE and as such can be changed easier
    //--------------------------------------------------------------

    //demostrates the fgets function, which only takes in a specified number of characters, the rest is cut off, this prevents run-time errors
    char movie[21];
    puts("Please enter your movie title(20 characters or less): ");
    fgets(movie, 21, stdin);
    puts(movie);
    //--------------------------------------------------------------

    //Demonstrates the use of the heaps, which borrows the computers excess ram to store data
    //This function takes in a specified amount of numbers, allocates that amount of data for integers in the heap and find the average of the numbers
    int i = 0;
    float average = 0.0;
    int * pointsarray;
    int howmany;
    printf("How many numbers do you want to add? ");
    scanf("%d", &howmany);

    //This is the important function, it allocates the amount of storage required for an integer on the computer, times the number of integers specified, in the heap
    //It must be a pointer integer type, hence the (int *)
    //the malloc function takes in an argument which is the size of the reserved space required in the heap
    pointsarray = (int *) malloc(howmany * sizeof(int));

    for(i = 0; i < howmany; i++){
        scanf(" %d", &pointsarray[i]);
        average += pointsarray[i];
    }
    average = average/((float)howmany);
    printf("%.2f", average);
    //--------------------------------------------------------------

    //Demonstrates the syntax of structures, which is defined in the seansinfo.h header file. Similar to an array of records
    struct studentinfo sean;
    struct studentinfo ben;
    struct studentinfo jack;

    sean.age = 18;
    ben.age = 16;
    jack.age = 10;
    puts("enter the name of user1");
    gets(sean.firstname);
    puts(sean.firstname);
    //--------------------------------------------------------------

    //Demonstrates how to create a new sequential file and append new data onto it
    FILE * fpointer;
    fpointer = fopen("testfile.txt", "w");
    fprintf(fpointer, "This is a test string to load into a file\n");
    fclose(fpointer);
    fpointer = fopen("testfile.txt", "a");
    fprintf(fpointer, "This is the second line which is appended onto the text file\n");
    //--------------------------------------------------------------

    //Demonstrates reading from a file and the feof function
    //This feof function stands for File End of File, and returns true is the file is at its end, as such, in this while loop, the exclamation mark means loop while feof is not true
    FILE * fPointer;
    fPointer = fopen("testfile.txt", "r");
    char singleline[150];

    while(!feof(fPointer)){
        fgets(singleline, 150, fPointer);
        puts(singleline)
    }
    fclose(fPointer);
    //--------------------------------------------------------------


    //This demonstrates how to access a file randomly instead of sequentially
    //The fseek statement effectively moves the cursor to a point specified, starting from the end or begining
    FILE * fpointer1;
    fpointer1 = fopen("testfile.txt","w+");
    fputs("I ate 3 pumpkins today",fpointer1);
    fseek(fpointer1, 8, SEEK_SET);
    fputs("munchkins on saturday", fpointer1);
    fseek(fpointer1, -11, SEEK_END);
    fputs("on top of a mountain", fpointer1);
    //--------------------------------------------------------------


    //calls the function printsomething()
    printsomething();
    //--------------------------------------------------------------

    float AUDamount1 = 23.54;
    AUDtoUSD(AUDamount1);
    AUDtoUSD(1);
    //--------------------------------------------------------------

    //Demonstrates the return function
    int seansbonus = calculatebonus(14);
    printf("Seans bonus is %i", seansbonus);
    //--------------------------------------------------------------

    //this output ibeans = 20 and ibeans = 50, as the passbyvalue function did not change ibeans in the mainline, only locally
    int ibeans = 20;

    PassByValue(ibeans);
    printf("passed by value, ibeans is now %i\n", ibeans);

    PassByReference(&ibeans);
    printf("passed by value, ibeans is now %i\n", ibeans);
    //--------------------------------------------------------------

    return 0;
}



//this is the sytanx of a function, the first argument is the datatype of the returned value, but as this is a simple function which does not return anything, the datatype is void
void printsomething(){

    printf("printing within a function");PassByReference(&ibeans);

return;
}
//--------------------------------------------------------------

//This demonstrates the syntax for passing arguments to functions
void AUDtoUSD(float AUDamount){

    float USDamount = AUDamount * 0.7237;
    printf("%.2f AUD = %.2f USD\n", AUDamount, USDamount);

return;
}
//--------------------------------------------------------------

//demonstrates the return function
int calculatebonus(int yearsworked){
    int bonus = yearsworked * 250;

    if (yearsworked > 10){
        bonus += 1000;
    }
    return bonus;
}
//--------------------------------------------------------------


//demonstrates the difference of passing by value and passing by reference, passing by reference means we can change the value of the variable and it will stay changed even in the mainline
void PassByValue(int i){
    i = 40;
    return;
}

void PassByReference(int * i){
    *i = 50;
    return;
}
//--------------------------------------------------------------

//RANDOM HELPFUL FUNCTIONS

//checks to see if there are any occurences of string2 in the string 1
strstr(string1, string2);

//checks to see if there are any occurences of the character char in string
strchr(string, char);




