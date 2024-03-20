package main.impl.encode;

import main.base.encode.Encoder;
import main.base.input.Input;
import main.enums.input.InputStatus;
import main.impl.input.InputA;
import main.impl.input.InputB;
import main.impl.input.InputC;
import main.impl.input.InputD;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinaryEncoder implements Encoder {

    @Override
    public List<Input> encode(final int number) {
        final List<Input> inputs = new ArrayList<>();
        if (number >= 0 && number < 10) {
            int tempNumber = number;
            final List<Integer> binaryValue = new ArrayList<>();
            for (int i=0;i<4;i++){
                binaryValue.add(tempNumber%2);
                tempNumber/=2;
            }

            inputs.add(new InputA(binaryToInputType(binaryValue.get(3))));
            inputs.add(new InputB(binaryToInputType(binaryValue.get(2))));
            inputs.add(new InputC(binaryToInputType(binaryValue.get(1))));
            inputs.add(new InputD(binaryToInputType(binaryValue.get(0))));
        }
        return inputs;
    }

    private InputStatus binaryToInputType(long bit) {
        return bit == 0 ? InputStatus.OFF : InputStatus.ON;
    }
}
