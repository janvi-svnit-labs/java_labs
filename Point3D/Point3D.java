package Point3D;

public class Point3D {
    int x; int y; int z;
    public Point3D(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void display()
    {
        System.out.println(x+", "+y+", "+z);
    }
    public double distanceCalculate(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        double X=(x1-x2)*(x1-x2);
        double Y=(y1-y2)*(y1-y2);
        double Z=(z1-z2)*(z1-z2);
        return (Math.sqrt(X+Y+Z));
    }
}
