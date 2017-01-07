import java.util.*;
import java.io.File;
import java.lang.*;
import java.io.*;
import java.lang.Object;


class RopeIntranet{
    public static void main(String[] args){
        String filePath = args[0];
        String line = null;
        List<String> fileContents = new ArrayList<String>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                new FileReader(filePath);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                fileContents.add(line);
            }

            // Always close files.
            bufferedReader.close();

        } catch(Exception ex) {
            System.out.println("Unable to open file " + filePath);
        }

        int metaCounter = 1;
        int windowCounter = metaCounter;
        List<Integer> leftWindows = new ArrayList<Integer>();
        List<Integer> rightWindows = new ArrayList<Integer>();
        int caseCounter = 1;

        while(windowCounter < fileContents.size()){
            leftWindows.clear();
            rightWindows.clear();
            int numConnections = Integer.valueOf(fileContents.get(metaCounter));
            for(windowCounter = metaCounter + 1 ;
             windowCounter < numConnections + metaCounter + 1;
              windowCounter++){
                  String[] windowConnection = fileContents.get(windowCounter).split(" ");
                  leftWindows.add(Integer.valueOf(windowConnection[0]));
                  rightWindows.add(Integer.valueOf(windowConnection[1]));
            }

            int intersections = 0;
            for(int i = 0 ; i < leftWindows.size() ; i++){
                int currentWindowLeft = leftWindows.get(i);
                int currentWindowRight = rightWindows.get(i);

                for(int i2 = 0 ; i2 < leftWindows.size() ; i2++){
                    if(i2 == i){
                        continue;
                    }
                    int currentLeft = leftWindows.get(i2);
                    int currentRight = rightWindows.get(i2);

                    //System.out.printf("checking %d - %d for intersection with %d - %d\n",
                    //currentLeft, currentRight, currentWindowLeft, currentWindowRight);

                    if(currentRight > currentWindowRight && currentLeft < currentWindowLeft){
                        //System.out.println("intersection");
                        intersections++;
                    }else if(currentRight < currentWindowRight && currentLeft > currentWindowLeft){
                        //System.out.println("intersection");
                        intersections++;
                    }
                }
            }
            if(intersections != 0){
                intersections /= 2;
            }

            metaCounter += numConnections + 1;
            System.out.printf("Case #%d: %d\n", caseCounter, intersections);
            caseCounter++;
        }

    }


}
