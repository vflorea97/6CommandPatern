package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
    @Override
    public void undo() {
        light.on();
    }
}
