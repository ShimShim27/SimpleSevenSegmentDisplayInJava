package main.impl.output;

import main.abs.output.AbstractOutput;
import main.base.input.Input;

import java.util.List;

public class OutputA extends AbstractOutput {
    public OutputA(final List<Input> inputs){
      super(inputs);
    }
    @Override
    protected boolean doOnProcessing(boolean isA, boolean isB, boolean isC, boolean isD) {
        return isA || isC || (isB && isD) || (!isB && !isD);
    }


}
