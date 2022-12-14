package ro.mycode.Remote;

import org.junit.jupiter.api.Test;
import ro.mycode.CommandAC.LightOffCommand;
import ro.mycode.CommandAC.LightOnCommand;
import ro.mycode.Electronics.Light;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlWithUndoTest {

    @Test
    public void undoRemoteLoader(){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light lightLivingRoom = new Light("Living Room");
        LightOnCommand livingOnCommand = new LightOnCommand(lightLivingRoom);
        LightOffCommand livingOffCommand = new LightOffCommand(lightLivingRoom);

        remoteControlWithUndo.setCommands(0,livingOnCommand,livingOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtoWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtoWasPushed();

    }

}