public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = this.getX();
        array[1] = this.getY();
        array[2] = this.getZ();
        return array;
    }

    @Override
    public String toString() {
        return "x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.getZ();
    }
}
