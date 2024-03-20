package main.impl.output;

import main.abs.output.AbstractOutput;
import main.base.input.Input;

import java.util.List;

public class OutputG extends AbstractOutput {
   public OutputG(final List<Input> inputs){
      super(inputs);
    }
    @Override
    protected boolean doOnProcessing(boolean isA, boolean isB, boolean isC, boolean isD) {
        return isA || (isB&&!isC) || (!isB&&isC) || (isC&&!isD) ;
    }

}
