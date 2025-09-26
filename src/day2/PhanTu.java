package day2;

public class PhanTu {
    double x;
    double i;

    public PhanTu(double x, double i) {
        this.x = x;
        this.i = i;
    }

    public double getX() {
        return x;
    }

    public double getValue() {
        return Math.pow(x, i);  // tính x^i
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "PhanTu{" +
                "x=" + x +
                ", i=" + i +
                '}';
    }
}
