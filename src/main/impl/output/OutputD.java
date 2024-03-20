package main.impl.output;

import main.abs.output.AbstractOutput;
import main.base.input.Input;

import java.util.List;

public class OutputD extends AbstractOutput {
   public OutputD(final List<Input> inputs){
      super(inputs);
    }
    @Override
    protected boolean doOnProcessing(boolean isA, boolean isB, boolean isC, boolean isD) {
        return (!isB&&!isD) || (isC&&!isD) || (isB&&!isC&&isD) || (!isB&&isC) || isA;
    }

}
