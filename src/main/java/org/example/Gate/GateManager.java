package org.example.Gate;

import java.util.ArrayList;
import org.example.Data.SetTestDataGate;

public class GateManager implements GateInterface {

  private ArrayList<Gate> gates;

  public GateManager() {
    this.gates = new ArrayList<>();
    SetTestDataGate.setData(this.gates);
  }

  @Override
  public void addAirplane(int gateNumber, String idAirplane) {
    for (Gate gate : gates) {
      if (gate.getGateNumber() == gateNumber) {
        gate.setIdAirplane(idAirplane);
        break;
      }
    }
  }

  @Override
  public void deleteAirplane(String idGate) {
    for (Gate gate : gates) {
      if (gate.getId().equals(idGate)) {
        try {
          gate.setIdAirplane("");
          gate.setAvaibility(true);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }
    }
  }

  @Override
  public Gate search(int gateNumber) {
    for (Gate gate : gates) {
      if (gate.getGateNumber() == gateNumber) {
        return gate;
      }
    }
    return null;
  }

  @Override
  public ArrayList<Gate> getAllGates() {
    return this.gates;
  }

  @Override
  public ArrayList<Gate> getAvaibilityGates() {
    ArrayList<Gate> result = new ArrayList<>();

    for (Gate gate : gates) {
      if (gate.isAvaibility()) {
        result.add(gate);
      }
    }
    return result;
  }
}
