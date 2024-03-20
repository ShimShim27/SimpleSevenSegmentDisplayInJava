package main;

import main.base.display.Display;
import main.base.encode.Encoder;
import main.impl.SevenSegmentDisplay;
import main.impl.encode.DecimalToBinaryEncoder;

public class Main {
    public static void main(String[] args) {
        final Encoder encoder = new DecimalToBinaryEncoder();
        final Display display = new SevenSegmentDisplay();
        display.setInputs(encoder.encode(9));
        display.display();
    }

}