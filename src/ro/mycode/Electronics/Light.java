package ro.mycode.Electronics;

public class Light extends Electronics {


    public Light() {
    }

    public Light(String location) {
        super(location);
    }

    public void on(){
        System.out.println("Light on");
    }
    public void off(){
        System.out.println("Light off");
    }
}
