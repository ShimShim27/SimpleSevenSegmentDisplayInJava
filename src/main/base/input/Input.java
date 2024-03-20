package main.base.input;

import main.enums.input.InputType;

public interface Input {
    InputType getInputType();
    boolean isOn();

}
