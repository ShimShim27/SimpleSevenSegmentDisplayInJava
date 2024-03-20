package main.base.display;

import main.base.input.Input;

import java.util.List;

public interface Display {
    void display();
    void setInputs(final List<Input> inputs);

}
