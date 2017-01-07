import java.lang.*;
import java.util.*;

class Cluster{
    private Firefly[] fireFlies;
    private double[] center;

    Cluster(Firefly[] newFireFlies){ //CONSTRUCTOR
        fireFlies = newFireFlies;
        center = this.findCenter();
    }

    private double[] findCenter(){
        List<Firefly> tempFlies = new ArrayList<Firefly>();
        for(Firefly f: fireFlies){
            tempFlies.add(f);
        }
        int counter = tempFlies.size() - 1;

        //Loop until only one point is left
        while(counter > 0){
            double squareMinDist = 99999999; //smallest distance between two points
            double[][] minPoints = new double[2][3]; //The two points which have the smallest distance
            for(Firefly fly1: tempFlies){
                for(Firefly fly2: tempFlies){
                    double[] point1 = fly1.getCoords();
                    double[] point2 = fly2.getCoords();
                    if(Arrays.equals(point1, point2)){ //Ensure we aren't comparing the same points
                        continue;
                    }

                    //Calculate distance and check if its the smallest
                    double squareDistance = Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1],2) + Math.pow(point2[2] - point1[2], 2);
                    if(squareDistance < squareMinDist){
                        squareMinDist = squareDistance;
                        minPoints[0] = point1;
                        minPoints[1] = point2;
                    }
                }
            }
            //Merge to two closest point
            double[] midPoint = {(minPoints[0][0] + minPoints[1][0])/2 ,(minPoints[0][1] + minPoints[1][1])/2, (minPoints[0][2] + minPoints[1][2])/2};
            tempFlies.remove(minPoints[0]);
            tempFlies.remove(minPoints[1]);
            double[] tempData = {midPoint[0], midPoint[1], midPoint[2], 0, 0, 0};
            Firefly tempFly = new Firefly(tempData);
            tempFlies.add(tempFly);
            counter--;
        }
        return tempFlies.get(0).getCoords(); //Return the last remaining point (the midPoint)
    }

    public void updateCluster(){
        center = this.findCenter();
    }

    public double distFromCenter(){
        double distance = Math.pow(center[0] - 0, 2) + Math.pow(center[1] - 0,2) + Math.pow(center[2] - 0, 2);
        distance = Math.sqrt(distance);
        return distance;
    }

    public void moveFlies(double timeToFly){
        for(Firefly f : fireFlies){
            f.fly(timeToFly);
        }
        this.updateCluster();
    }

    public Firefly[] getFlies(){
        return fireFlies;
    }

    public double[] getCenter(){
        return center;
    }
}
