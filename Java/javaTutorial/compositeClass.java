public class compositeClass {
    private String name;
    private timeClass time;

    public compositeClass(String theName, timeClass t){
        name = theName;
        time = t;
    }

    public String toString(){
        return String.format("My name is %s, my docked time is %s", name, time);
    }
}
