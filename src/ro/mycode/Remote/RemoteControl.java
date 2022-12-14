package ro.mycode.Remote;

import ro.mycode.Command;
import ro.mycode.CommandAC.NoCommand;

public class RemoteControl {
    private Command[] commandsOn;
    private Command [] commandsOff;

    public RemoteControl(){
        commandsOff = new Command[7];
        commandsOn = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            commandsOn[i] = noCommand;
            commandsOff[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command commandOn, Command commandOff){
        this.commandsOff[slot] = commandOff;
        this.commandsOn[slot] = commandOn;
    }

    public void onButtonWasPushed(int slot){
        if (commandsOn[slot] != null) {
            commandsOn[slot].execute();
        }
    }
    public void offButtonWasPushed(int slot){
        commandsOff[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---------Remote Control---------\n");
        for (int i = 0; i < commandsOn.length; i++){
            stringBuff.append("[slot " + i + " ]" + commandsOn.getClass().getName() + "   " + commandsOff.getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
