package ro.mycode;

import org.junit.jupiter.api.Test;
import ro.mycode.CommandAC.*;
import ro.mycode.Electronics.CeilingFan;
import ro.mycode.Electronics.GarageDoor;
import ro.mycode.Electronics.Light;
import ro.mycode.Electronics.Stereo;
import ro.mycode.Remote.RemoteControl;
import ro.mycode.Remote.SimpleRemoteControl;

class SimpleRemoteControlTest {

    @Test
    public void test1() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }

    @Test
    public void remoteLoader(){
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilinfFanOffCommand ceilinfFanOffCommand = new CeilinfFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommands(0,livingLightOn,livingLightOff);
        remoteControl.setCommands(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommands(2,ceilingFanOnCommand,ceilinfFanOffCommand);
        remoteControl.setCommands(3,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommands(4,stereoOnWithCdCommand,stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);




    }

}