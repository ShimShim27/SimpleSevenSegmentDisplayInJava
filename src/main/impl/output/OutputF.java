package main.impl.output;

import main.abs.output.AbstractOutput;
import main.base.input.Input;

import java.util.List;

public class OutputF extends AbstractOutput {
    public OutputF(final List<Input> inputs){
      super(inputs);
    }
    @Override
    protected boolean doOnProcessing(boolean isA, boolean isB, boolean isC, boolean isD) {
        return isA || (!isC&&!isD) || (isB&&!isC) || (isB&&!isD) ;
    }

}
