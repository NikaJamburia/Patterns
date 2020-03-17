package nika.command;

import nika.command.commands.Command;

public class RemoteControl { //Invoker. Control with arrow buttons and special button
    private Command leftArrowButton;
    private Command rightArrowButton;
    private Command upArrowButton;
    private Command downArrowButton;
    private Command specialButton;

    public RemoteControl(Command leftArrowButton, Command rightArrowButton, Command upArrowButton, Command downArrowButton, Command specialButton) {
        this.leftArrowButton = leftArrowButton;
        this.rightArrowButton = rightArrowButton;
        this.upArrowButton = upArrowButton;
        this.downArrowButton = downArrowButton;
        this.specialButton = specialButton;
    }

    public void pressLeftArrowButton () {
        System.out.println(this.getClass().getSimpleName() + " -> Left arrow pressed (");
        leftArrowButton.execute();
        System.out.println(")");
        System.out.println();
    }

    public void pressRightArrowButton () {
        System.out.println(this.getClass().getSimpleName() + " -> Right arrow pressed (");
        rightArrowButton.execute();
        System.out.println(")");
        System.out.println();
    }

    public void pressUpArrowButton () {
        System.out.println(this.getClass().getSimpleName() + " -> Up arrow pressed (");
        upArrowButton.execute();
        System.out.println(")");
        System.out.println();
    }

    public void pressDownArrowButton () {
        System.out.println(this.getClass().getSimpleName() + " -> Down arrow pressed (");
        downArrowButton.execute();
        System.out.println(")");
        System.out.println();
    }

    public void pressSpecialButton () {
        System.out.println(this.getClass().getSimpleName() + " -> Special button pressed (");
        specialButton.execute();
        System.out.println(")");
        System.out.println();
    }
}
