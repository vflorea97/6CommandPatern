package ro.mycode.Electronics;

public class GarageDoor extends Electronics {

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        super(location);
    }

    public void up(){
        System.out.println("The door is open");
    }
    public void down(){
        System.out.println("the door is close");
    }
    public void stop(){
        System.out.println("The door has been stopped");
    }
    public void lightOn(){
        System.out.println("The light is on");
    }
    public void lightOff(){
        System.out.println("The light is off");
    }
}
