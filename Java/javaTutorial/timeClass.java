class timeClass{
    private int second;
    private int minute;
    private int hour;


    /*
    This class demonstrates the use of the this function, which can be used
    to recursively call the object creation function

    In this circumstance, the this function is being used to always call the third
    constructor

    This also demonstrates the use of multiple constructors, the program chooses
    which one to call depeneding on the number of parameters passed in to the
    object creation statement, but it will always redirect to the third constructor
    in this circumstance due to the this(1, 2 ,3) statments
    */
    public timeClass(){
        this(0, 0, 0);
    }

    public timeClass(int second){
        this(second, 0 ,0);
    }

    public timeClass(int second, int minute){
        this(second, minute, 0);
    }

    public timeClass(int second, int minute, int hour){
        setTime(second, minute, hour);
    }

    public void setTime(int s, int m, int h){
        setSecond(s);
        setMinute(m);
        setHour(h);
    }


    //When you call an object in place of the string, it looks automatically to
    //the built in function toString
    //We overided the toString function down the bottom to convert it to a string how we wanted it
    public void displayTime(){
        System.out.println(System.out.printf("The time is %s\n", this));
    }

    public void setSecond(int s){
        second = ((s >= 0 && s < 60)?s:0);
    }

    public void setMinute(int m){
        minute = ((m >= 0 && m <= 60)?m:0);
    }

    public void setHour(int h){
        hour = ((h > 0 && h <= 12)?h:0);
    }

    public String toString(){
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
