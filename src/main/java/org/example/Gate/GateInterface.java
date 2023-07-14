package org.example.Gate;


import java.util.ArrayList;

public interface GateInterface {

  void addAirplane(int gateNumber, String idAirplane) throws Exception;

  void deleteAirplane(String idGate);

  Gate search(int gateNumber);

  ArrayList<Gate> getAllGates();

  ArrayList<Gate> getAvaibilityGates();
}
