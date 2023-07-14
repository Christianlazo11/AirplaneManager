package org.example.Gate;

import org.example.Airplane.Airplane;

import java.util.ArrayList;

public interface GateInterface {

    void addAirplane(String idGate, String idAirplane);
    void deleteAirplane(String idGate);
    ArrayList<Gate> getAllGates();
    ArrayList<Gate> getAvaibilityGates();

}
