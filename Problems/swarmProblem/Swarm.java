import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.*;

class Swarm{
    public static void main(String[] args){
        String filePath = args[0];
        List<String> fileContents = readFile(filePath);
        int i = 1;
        int caseCounter = 0;

        //Loop through file contents and extract metaData
        while(i < fileContents.size()){
            int numFlies = Integer.valueOf(fileContents.get(i));
            Firefly[] flies = new Firefly[numFlies];
            int pos = 0;
            for(int x = i + 1 ; x <= numFlies + i ; x++){
                String line = fileContents.get(x);
                String[] lineSegs = line.split(" ");
                double[] metaData = new double[lineSegs.length];
                for(int y = 0 ; y < lineSegs.length ; y++){
                    int val = Integer.valueOf(lineSegs[y]);
                    metaData[y] = val;
                }
                Firefly f = new Firefly(metaData);
                flies[pos] = f;
                pos++;
            }
            Cluster flyClust = new Cluster(flies);
            double currDist = flyClust.distFromCenter();
            double preDist = currDist + 1;
            double timer = 1;
            while(preDist >= currDist){
                Firefly[] currFlies = flyClust.getFlies();
                System.out.printf("second %f firefly positions are:\n", timer - 1);
                for(Firefly f : currFlies){
                    System.out.printf(Arrays.toString(f.getCoords()) + "\n");
                }
                System.out.printf("distance from center is %f\n", currDist);
                flyClust.moveFlies(timer);
                preDist = currDist;
                currDist = flyClust.distFromCenter();
                timer++;
            }
            double minTimer = timer - 1;
            double minDist = preDist;
            System.out.printf("Case #%d: %f %f\n", caseCounter, minDist, minTimer);
            caseCounter++;
            i += numFlies + 1;
        }
    }


    private static List<String> readFile(String filePath){
        String line = null;
        List<String> fileContents = new ArrayList<String>();

        //Open file specified in argument and read contents into List
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                fileContents.add(line);
            }
        }catch(Exception ex){
            System.err.println("Unable to open file " + filePath);
        }
        return fileContents;
    }
}
