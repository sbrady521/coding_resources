class Firefly{
    private double x, y, z, vx, vy, vz;

    Firefly(double[] init){
        x = init[0];
        y = init[1];
        z = init[2];
        vx = init[3];
        vy = init[4];
        vz = init[5];
    }

    public void fly(double timeToFly){
        x += timeToFly*vx;
        y += timeToFly*vy;
        z += timeToFly*vz;
    }

    public double[] getCoords(){
        double[] coords = new double[3];
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
        return coords;
    }
}
