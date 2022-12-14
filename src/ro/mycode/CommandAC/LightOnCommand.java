package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
    @Override
    public void undo() {
        light.off();
    }
}
