public class girlToDate{
    private String first;
    private String last;
    private static int members = 0;

    public girlToDate(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("New girl added: %s %s, member count is now %d\n", first, last, members);
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    //Since members is a static int this must be defined in the return statement
    public static int getMembers(){
        return members;
    }


}
