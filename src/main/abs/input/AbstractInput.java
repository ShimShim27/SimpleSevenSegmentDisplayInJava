package main.abs.input;

import main.base.input.Input;
import main.enums.input.InputStatus;

public abstract class AbstractInput implements Input {
    private final InputStatus inputStatus;
    protected AbstractInput(final InputStatus inputStatus){
        this.inputStatus = inputStatus;
    }
    @Override
    public boolean isOn() {
        return inputStatus == InputStatus.ON;
    }
}
