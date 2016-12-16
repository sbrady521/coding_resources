import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;
import java.io.File;
import java.util.*;
import java.lang.*;

class createFile{
    private Formatter x;

    public void openFile(String filename){
        try{
            x = new Formatter(filename);
        }
        catch(Exception e){
            System.out.println("could not open file");
        }
    }

    public void addRecords(String record){
        x.format("%s", record);
    }

    public void closeFile(){
        x.close();
    }

}
