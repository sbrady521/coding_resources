import java.io.*;
import java.util.*;

public class ReadFile {
    private Scanner x;

    public void openFile(String file_name){
        try{
            x = new Scanner(new File(file_name));
        }
        catch(Exception e){
            System.out.println("could not open file");
        }
    }

    public void readLines(){
        while(x.hasNext()){
            String line = x.nextLine();
            System.out.println(line);
        }
    }

    public void closeFile(){
        x.close();
    }
}
