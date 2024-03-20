package main.impl.input;

import main.abs.input.AbstractInput;
import main.enums.input.InputStatus;
import main.enums.input.InputType;

public class InputD extends AbstractInput {
    public InputD(final InputStatus inputStatus){
        super(inputStatus);

    }
    @Override
    public InputType getInputType() {
        return InputType.D;
    }
}
