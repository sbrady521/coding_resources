public class demoFinalClass{
    private int sum;
    private final int NUMBER;

    public demoFinalClass(int x){
        NUMBER = x;
        sum = 0;
    }

    public void add(){
        sum += NUMBER;
    }

    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
