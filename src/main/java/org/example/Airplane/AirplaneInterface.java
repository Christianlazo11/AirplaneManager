package org.example.Airplane;

import java.util.ArrayList;

public interface AirplaneInterface {

  void create(Airplane airplane);

  void edit(Airplane airplane);

  void delete(String id);

  Airplane search(int registrationNumber);

  ArrayList<Airplane> getAvaibilityAirplanes();
}
