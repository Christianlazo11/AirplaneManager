package org.example.Gate;

import org.example.Data.SetTestDataGate;

import java.util.ArrayList;

public class GateManager implements GateInterface{

    private ArrayList<Gate> gates;

    public GateManager() {
        this.gates = new ArrayList<>();
        SetTestDataGate.setData(this.gates);
    }


    @Override
    public void addAirplane(String idGate, String idAirplane) {
        for(Gate gate : gates) {
            if(gate.getId().equals(idGate)) {
                try {
                    gate.setIdAirplane(idAirplane);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            break;
        }
    }

    @Override
    public void deleteAirplane(String idGate) {
        for(Gate gate: gates) {
            if(gate.getId().equals(idGate)) {
                try {
                    gate.setIdAirplane("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    @Override
    public ArrayList<Gate> getAllGates() {
        return this.gates;
    }

    @Override
    public ArrayList<Gate> getAvaibilityGates() {
        ArrayList<Gate> result = new ArrayList<>();

        for(Gate gate: gates) {
            if(gate.isAvaibility()) {
                result.add(gate);
            }
        }
        return result;
    }
}
