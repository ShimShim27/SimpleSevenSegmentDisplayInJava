package main.abs.output;

import main.base.input.Input;
import main.base.output.Output;
import main.enums.input.InputType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractOutput implements Output {
    abstract protected boolean doOnProcessing(final boolean isA, final boolean isB, final boolean isC, final boolean isD);
    private final Map<InputType,Input> inputMap = new HashMap<>();

    protected AbstractOutput(final List<Input> inputs){
        inputs.forEach(input -> inputMap.put(input.getInputType(),input));
    }
    @Override
    public boolean isOn() {
        final boolean isA = isInputTypeOn(InputType.A);
        final boolean isB = isInputTypeOn(InputType.B);
        final boolean isC = isInputTypeOn(InputType.C);
        final boolean isD= isInputTypeOn(InputType.D);
        return doOnProcessing(isA, isB, isC, isD);
    }



    private boolean isInputTypeOn(final InputType inputType){
        boolean isOn = false;
        try{
            isOn =  inputMap.get(inputType).isOn();
        } catch (NullPointerException npe){
            System.out.printf("Missing input %s, using default of 0%n", inputType.getName());
        }
        return isOn;

    }
}
