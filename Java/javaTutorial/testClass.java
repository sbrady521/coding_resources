//Full on object oriented programming
/*
Classes have attributes and methods
All attributes should be of type 'private' meaning only the methods in that class can access them
*/

/*
Notice none of these classes are static, unlike the main class
this is because they need to be used by the main class, and static functions
are cannot be accessed outside the class they were written in.
*/

class testClass{
    private String girlName;
    //This is a constructor class, by passing in name when the object is created
    //This method is automatically run
    //Constructor classes must have the same name as the class
    public testClass(String name){
        girlName = name;
    }
    public void printTest(){
        System.out.println("This line being printed was written in a seperate class file");
    }
    public void setGirlName(String name){
        girlName = name;
    }

    //or

    public void otherSetGirlName(String girlName){
        this.girlName = girlName;
    }
    public String getGirlName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your girlfriends name is %s\n", girlName);
    }
}
