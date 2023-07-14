package org.example.Data;

import java.util.ArrayList;
import org.example.Gate.Gate;

public class SetTestDataGate {

  public static void setData(ArrayList<Gate> gate) {
    gate.add(new Gate(1));
    gate.add(new Gate(2, "affasfsa"));
    gate.add(new Gate(3));
    gate.add(new Gate(4, "afafsfasfsa"));
    gate.add(new Gate(5));
    gate.add(new Gate(6));
    gate.add(new Gate(7));
    gate.add(new Gate(8));
  }
}
