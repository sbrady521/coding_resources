import java.util.*;

class test{
    public static void main(String[] args){
        int x[] = new int[5];
        x[0] = 5;
        x[1] = 30;
        x[2] = 40;
        x[3] = 25;
        x[4] = 12;
        System.out.println(average(x));
    }

    public static int average(int...numbers){
        int total = 0;
        for(int x:numbers){
            total += x;
            System.out.println(x);
        }
        return total/(numbers.length);
    }
}
