package org.example.Data;

import org.example.Gate.Gate;

import java.util.ArrayList;

public class SetTestDataGate {

    public static void setData(ArrayList<Gate> gate) {
        gate.add(new Gate(1));
        gate.add(new Gate(2));
        gate.add(new Gate(3));
    }
}
