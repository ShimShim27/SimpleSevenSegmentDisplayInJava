package main.impl.output;

import main.abs.output.AbstractOutput;
import main.base.input.Input;

import java.util.List;

public class OutputB extends AbstractOutput {
    public OutputB(final List<Input> inputs){
      super(inputs);
    }
    @Override
    protected boolean doOnProcessing(boolean isA, boolean isB, boolean isC, boolean isD) {
        return !isB || (!isC && !isD) || (isC && isD);
    }

}
