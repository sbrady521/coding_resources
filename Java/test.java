import java.lang.Object;

class arrayClass{
    public static void main(String[] args){
        String[] testArray = new String[10];
        testArray[0] = "beans1";
        testArray[1] = "beans2";
        testArray[2] = "beans3";
        int i = 0;
        System.out.println(testArray.length);
        while(testArray[i] != null){
            System.out.println(testArray[i]);
            i++;
        }
    }
}
