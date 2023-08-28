package org.example;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @return vector's module
     * @apiNote A method that returns vector's module
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2 Vector by which multiplication is done
     * @return Scalar product
     * @apiNote Method that computes a scalar product
     */

    public double scal(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }


    /**
     * @apiNote Method that computes a vector product
     * @param vector2 Vector by which multiplication is done
     * @return Vector product
     */
    public Vector vprod(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }


    /**
     * @apiNote Method used to find cosine of the angle between two vectors
     * @param vector1 is accepted as a variable
     * @return cosine of the angle between two vectors
     */
    public double vangle(Vector vector1) {
        return scal(vector1) / (length() * vector1.length());
    }
}
