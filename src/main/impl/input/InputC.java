package main.impl.input;

import main.abs.input.AbstractInput;
import main.enums.input.InputStatus;
import main.enums.input.InputType;

public class InputC extends AbstractInput {
    public InputC(final InputStatus inputStatus){
        super(inputStatus);

    }
    @Override
    public InputType getInputType() {
        return InputType.C;
    }
}
