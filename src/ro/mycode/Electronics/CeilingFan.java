package ro.mycode.Electronics;

public class CeilingFan extends Electronics{

    public static final int high = 3;
    public static final int medium = 2;
    public static final int low = 1;
    public static final int off = 0;
    public String location;
    private int speed;

    public CeilingFan() {
    }

    public CeilingFan(String location) {
        this.location = location;
        speed = off;
    }

    public void off(){
        speed = off;
        System.out.println("Fan is off");
    }
    public void low(){
        speed = low;
        System.out.println("Low speed");
    }
    public void medium(){
        speed = medium;
        System.out.println("Medium speed");
    }
    public void high(){
        speed = high;
        System.out.println("High speed");
    }

    public int getSpeed() {
        return speed;
    }
}
