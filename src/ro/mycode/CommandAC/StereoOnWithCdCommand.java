package ro.mycode.CommandAC;

import ro.mycode.Command;
import ro.mycode.Electronics.Stereo;

public class StereoOnWithCdCommand implements Command {

    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("DMX");
        System.out.println("The CD is: " + stereo.getCd());
        stereo.setVolume(11);
        System.out.println("Volume: " + stereo.getVolume());
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
