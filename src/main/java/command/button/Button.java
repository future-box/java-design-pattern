package command.button;

public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Button() {
    }

    public Button(Command command) {
        this.command = command;
    }

    public void pressed() {
        this.command.execute();
    }

}
