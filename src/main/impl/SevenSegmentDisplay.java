package main.impl;

import main.base.display.Display;
import main.base.input.Input;
import main.base.output.Output;
import main.impl.output.*;

import java.util.List;

public class SevenSegmentDisplay implements Display {
    private Output a;
    private Output b;
    private Output c;
    private Output d;
    private Output e;
    private Output f;
    private Output g;

    @Override
    public void display() {
        String disp =
                "   %s %s\n" +
                        "%s       %s\n" +
                        "%s       %s\n" +
                        "   %s %s   \n" +
                        "%s       %s\n" +
                        "%s       %s\n" +
                        "   %s %s   ";
        disp = String.format(disp, outputStatusToDisplayString(a), outputStatusToDisplayString(a),
                outputStatusToDisplayString(f), outputStatusToDisplayString(b),
                outputStatusToDisplayString(f), outputStatusToDisplayString(b),
                outputStatusToDisplayString(g), outputStatusToDisplayString(g),

                outputStatusToDisplayString(e), outputStatusToDisplayString(c),
                outputStatusToDisplayString(e), outputStatusToDisplayString(c),
                outputStatusToDisplayString(d), outputStatusToDisplayString(d)
        );

        System.out.println(disp);
    }

    @Override
    public void setInputs(final List<Input> inputs) {
        a = new OutputA(inputs);
        b = new OutputB(inputs);
        c = new OutputC(inputs);
        d = new OutputD(inputs);
        e = new OutputE(inputs);
        f = new OutputF(inputs);
        g = new OutputG(inputs);
    }

    private static String outputStatusToDisplayString(final Output output){
        return output.isOn() ? "." : "";
    }
}
