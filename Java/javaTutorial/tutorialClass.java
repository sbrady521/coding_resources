import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;
import java.io.File;
import java.util.*;
import java.lang.*;

//Any basic functions not outlined in this tutorial are most likely the exact same as in C
//e.g:
/*
If statments
While loops
*/

class tutorialClass{
    public static void main(String[] args){
        //System.out.println("Hello World");

        /*
        int test1 = 3;
        int test2 = 5;
        int test3;
        test3 = addTwoNumbers(3, 5);
        //print will print out the variable/string without a new line character at the end
        //println adds it automatically
        System.out.print(test3);
        System.out.println(test3);
        */

        //echo();

        /*
        double result = addCalculator();
        System.out.println(result);
        */


        //the testClass class is defined in the file testClass.java
        //By creating an object from this class using the below command
        //we can run the methods within this seperate class
        /*
        testClass testObject = new testClass();
        testObject.printTest();
        */

        //Outlines the use of objects and there attributes/methods
        //Notice the printf function in this segment of code
        //We use printf when we want to insert variables into strings
        //printf, like in C, does not include the new line character at the end
        /*
        testClass girlFriend = new testClass();
        System.out.print("What is the name of your girlfriend: ");
        Scanner userInput = new Scanner(System.in);
        String temp = userInput.nextLine();
        girlFriend.setGirlName(temp);
        girlFriend.saying();
        System.out.printf("\nGirlfriends name set to %s\n", girlFriend.getGirlName());
        */

        //This section demonstates the use of the constructor class
        //In this situation, you pass in girlName when the object is created,
        //and this will automatically set girlName.
        /*
        testClass newGirlfriend = new testClass("Bessy");
        newGirlfriend.saying();
        */

        //A way of compactly including if statements
        //format: [condition] ? [true case] : [false case]
        //This function returns the relevant value
        /*
        int age = 21;
        System.out.println(age > 50 ? "you are old" : "you are young");
        */

        //For loops
        /*
        int i;
        for(i = 0; i < 20 ; i++){
            System.out.println(i);
        }
        */

        //Post-test loop, do While
        //this loop will execture atleast once
        /*
        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
        }while(counter < 10);
        */

        //mathFunctionDemonstrator();

        //Demonstates the random class, requires imporing the random file seen at the top
        //[Random class].nextInt(num) will give you a random number from 0 to num, not including num
        /*
        Random dice = new Random();
        int num;
        for(int counter = 1; counter < 10; counter++){
            num = dice.nextInt(6) + 1;
            System.out.println(num);
        }
        */

        /*
        //Arrays
        //Predefining an array
        int numArray[] = new int[3];
        numArray[0] = 1;
        numArray[1] = 2;
        numArray[2] = 3;
        System.out.println(numArray[1]);

        //or

        //initialising an array straight away
        int numArray2[] = {1, 2, 3};
        System.out.println(numArray[1]);
        */

        //Demonstrates the .length method, which returns the lenth of an array
        //In java, a list is by default filled with zeroes, so in the below circumstance
        //the length of the array is still 10, even though I only filled 4 elements
        /*
        int numArray[] = new int[10];
        numArray[0] = 3;
        numArray[1] = 6;
        numArray[2] = 232;
        numArray[3] = 1;
        System.out.println(numArray.length);
        for(int i = 0; i < 10 ; i++){
            System.out.println(numArray[i]);
        }
        */

        //Enhanced for loops
        //Similar to for loops in python
        //A variable is assigned to each value in an array
        //The follow would print the sum of all elements in the array
        /*
        int numArray[] = {1,4,3,5,3,5};
        int total = 0;
        for(int x: numArray){
            //so x is set to 1, then 4, then 3 and so on....
            total += x;
        }
        System.out.println(total);
        */

        //This function demonstrates how to pass an array into a function
        //Arrays, when passed into a function are passed in by reference
        //However regular variables are not
        /*
        int numArray[] = {1,4,3,5,3,5};
        addFive(numArray);
        for(int x: numArray){
            System.out.println(x);
        }
        */

        //Multi-demensional Arrays
        //int numArray[][] = {{1,2,4,56}, {2,43,5,3}, {2,4,5,23}};

        //Demonstrates the use of variable length arguments, represented through and elipse '...'
        //This tells the compiler you dont know how many arguments of that type will be passed in
        //System.out.println(average(2,4,6,2,4,5));

        //This functions further demonstrates the condensed if statements
        //Aswell as the String.format function
        //System.out.println(MilitaryToNormalTime(23, 50, 12));

        //This section demonstates the use of the 'this' statement
        /*
        testClass girlFriendClass = new testClass("Jennifer");
        girlFriendClass.saying();
        girlFriendClass.otherSetGirlName("Jenny");
        girlFriendClass.saying();
        */


        //demonstates the use of multiple constructors
        /*
        timeClass clock1 = new timeClass(2);
        clock1.displayTime();
        timeClass clock2 = new timeClass(20,50);
        clock2.displayTime();
        timeClass clock3 = new timeClass(20, 50, 2);
        clock3.displayTime();
        */

        //Demonstrates the use of a composite class, which is a class which uses another class
        /*
        timeClass t = new timeClass(20,55,11);
        compositeClass c = new compositeClass("sean", t);
        System.out.println(c);
        */

        //Demonstrates the use of an enumerator class in the .values method
        //An enumerator class is basically one with a bunch of constant objects
        //.values returns an array of those constant objects
        /*
        for(enumeration enumObject: enumeration.values()){
            System.out.printf("%s\t%s\t%s\n", enumObject, enumObject.getDesc(), enumObject.getYear());
        }
        */

        //~~~~~//

        //This on the other hand demonstrates the use of the EnumSet.range function
        //This allows your to create an array which is only made up of a section of
        //the constants from the enum class
        //it comes in the format EnumSet.range(from, to);
        //in this situation it prints out the objects from kelsey to candy
        /*
        System.out.println("\nand now for the range of constants!!!\n");
        for(enumeration people: EnumSet.range(enumeration.kelsey, enumeration.candy)){
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        */

        //This class demonstrate the use of static variables
        //these are constant throught all objects of the same class,
        //if one object increments a static variable called members per say,
        //it edits the variable members in every object
        /*
        girlToDate member1 = new girlToDate("Anna", "Kendrick");
        girlToDate member2 = new girlToDate("Megan", "Fox");
        girlToDate member3 = new girlToDate("Emma", "Watson");

        //Because this class contains a static variable which is object independent
        //we can call the static variable straight from the class
        System.out.println(girlToDate.getMembers());
        */

        //Demonstrates the use of a final attribute
        /*
        demoFinalClass constant = new demoFinalClass(10);
        for(int i = 0; i < 5 ; i++){
            constant.add();
            System.out.printf("%s\n", constant);
        }
        */

        //Demonstrates inheritance, both child classes inherit from parentClass
        /*
        childClass1 child1 = new childClass1();
        childClass2 child2 = new childClass2();
        child1.childPrint1();
        child1.superPrint();
        child2.childPrint2();
        child2.superPrint();
        */

        //Demonstrates the use of a polymorphic array, an array of different objects
        //Can be created if the object inherit from the same super class as seen below
        //polymorphism is when the same method does different things in different objects
        //In conclusion, subclass can be treated as though it is of the same type as the
        //parent class
        /*
        childClass1 child1 = new childClass1();
        childClass2 child2 = new childClass2();
        parentClass objectArray[] = new parentClass[2];
        objectArray[0] = child1;
        objectArray[1] = child2;
        int x;
        for(x = 0; x < objectArray.length ; x++){
            objectArray[x].message();
        }
        */

        //Demonstrate the use of the File class, which can give you information
        //about a file, such as whether or not it exists, and its name
        /*
        File file1 = new File("beans.txt");

        if(file1.exists()){
            System.out.println(file1.getName() + " exists!");
        } else{
            System.out.println("file not found");
        }*/

        //Demonstrates the Formatter class for creating files and manipulating them
        //Demonstrates the use of the try function
        /*
        final Formatter x;

        //If the code inside the try throws an error, it moves to the catch code
        try{
            //This creates a new file if one does not exist or uses an existing file
            x = new Formatter("fred.txt");
            System.out.println("you created a file");
        } catch(Exception e){
            System.out.println("you got an error")
        }
        */

        //Writing to files
        //Refer to createFile.java
        /*
        createFile f = new createFile();
        f.openFile("test.txt");
        f.addRecords("the beans are cool");
        f.closeFile();
        */

        //Reading from files
        //Refer to ReadFile.java
        /*
        ReadFile f = new ReadFile();
        f.openFile("test.txt");
        f.readLines();
        f.closeFile();
        */


        //COMMON STRING METHODS
        //startsWith
        /*
        String s = "Hello";
        String t = "Beans";
        s.startsWith("He"); // returns true
        t.startsWith("He"); // returns false

        //endsWith
        s.endsWith("llo"); // returns true
        t.endsWith("He"); // returns false

        //indexOf - returns the first occurence of a string or char
        //We can also specify the minimum index in the second argument
        s = "thebeansarecoolthebeansarecool";
        int i = s.indexOf('b'); //This sets i to 3
        int i2 = s.indexOf('b', 4); //This sets i2 to 18
        int sub = s.indexOf("beans"); //returns the index of the start of the word - 3
        */

        //Concatenating strings
        /*
        String a = "Bacon ";
        String b = "monster";

        String concat1 = a + b;
        String concat2 = a.concat(b);

        System.out.println(concat1);
        System.out.println(concat1);
        */

        //manipulating strings
        /*
        String a = "Baconb";
        String b = "      monster     \n";

        String upperA = a.toUpperCase();
        String replacedA = a.replace("B", "F"); //Replaces first occurence
        String lowerA = a.toLowerCase();
        String trimmedB = b.trim(); //removes new lines and white space
        System.out.println(a);
        System.out.println(upperA);
        System.out.println(replacedA);
        System.out.println(lowerA);
        System.out.println(trimmedB);
        */

        //Collections(Lists)
        List<String> list1 = new ArrayList<String>();
        list1.add("beans");
        list1.add("pizza");
        list1.add("cats");
        for(int i = 0 ; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }

        List<String> list2 = new ArrayList<String>();
        list2.add("beans");
        list2.add("cats");
        subtractList(list1, list2);

        System.out.println("--------------------");


        for(int i = 0 ; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }











    }
    public static int addTwoNumbers(int x, int y){
        return (x + y);
    }

    public static void echo(){
        //A bit about scanner variables
        /*
        Scanner variables can be continuously reused by using the .next... method
        Whenever userIn.nextLine() is encountered by the compiler, the program
        Prompts the user to enter the next line.
        This doesnt only work for strings
        nextLine = strings
        newDouble = doubles
        and so on...
        */
        //A scanner variable is a special kind of variable
        //It is required to take in user input
        Scanner userIn = new Scanner(System.in);

        //Scanner type variables cannot be printed normally
        System.out.println(userIn.nextLine());
    }

    public static double addCalculator(){
        Scanner userNum = new Scanner(System.in);
        double sum = 0;
        System.out.print("First num: ");
        sum = sum + userNum.nextDouble();
        System.out.print("Second num: ");
        sum = sum + userNum.nextDouble();
        return sum;
    }

    public static String gradeResponse(char grade){
        //Demonstrating the switch statment, and alternative to if's
        String response;
        switch(grade){
            case 'A':
                response = "Yeah you're pretty good I guess";
                break;
            case 'B':
                response = "Man you really need to step up your game";
                break;
            case 'C':
                response = "Don't bother coming home";
                break;
            case 'D':
                response = "Just give up on life mate";
                break;
            case 'F':
                response = "I'm almost impressed at how bad you are";
                break;
            default:
                response = "I don't think that's even a grade. I'm not even mad that's impressive";
            break;
        }
        return response;
    }

    public static void mathFunctionDemonstrator(){
        int num1 = 4;
        double num2 = 25.8;
        double num3 = -345.4;
        int num4 = 500;
        int num5 = 234;

        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.ceil(num2));
        System.out.println(Math.floor(num2));
        System.out.println(Math.abs(num3));

        //min and max takes to values and returns the largest/smallest
        System.out.println(Math.max(num2, num3));
        System.out.println(Math.min(num2, num3));
    }

    public static void addFive(int[] numArray){
        for(int i = 0 ; i < numArray.length ; i++){
            numArray[i]+=5;
        }
    }

    public static void doubleNum(int x){
        x = x*2;
    }

    public static int average(int...numbers){
        int total = 0;
        for(int x:numbers){
            total += x;
        }
        return total/(numbers.length);
    }

    public static String MilitaryToNormalTime(int h, int m, int s){
        return String.format("%d:%02d:%02d %s", ((h > 12) ? h - 12 : h),m ,s, ((h > 12) ? "pm" : "am"));
    }

    public static void subtractList(Collection<String> list1, Collection<String> list2){
        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            if(list2.contains(it.next())){
                it.remove();
            }
        }
    }
}
