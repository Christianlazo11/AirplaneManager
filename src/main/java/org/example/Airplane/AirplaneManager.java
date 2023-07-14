package org.example.Airplane;

import java.util.ArrayList;
import org.example.Data.SetTestDataAirplane;

public class AirplaneManager implements AirplaneInterface {

  private ArrayList<Airplane> airplanes;

  public AirplaneManager() {
    this.airplanes = new ArrayList<>();
    SetTestDataAirplane.setData(airplanes);
  }

  @Override
  public void create(Airplane airplane) {
    this.airplanes.add(airplane);
  }

  @Override
  public void edit(Airplane airplane) {
    for (Airplane air : airplanes) {
      if (air.getId().equals(airplane.getId())) {
        air.setAirline(airplane.getAirline());
        air.setPassengerCapacity(airplane.getPassengerCapacity());
        air.setRegistrationNumber(airplane.getRegistrationNumber());
        air.setStatus(airplane.getStatus());
      }
    }
  }

  @Override
  public void delete(String id) {
    for (Airplane air : airplanes) {
      if (air.getId().equals(id)) {
        airplanes.remove(air);
        break;
      }
    }
  }

  @Override
  public Airplane search(int registrationNumber) {
    for (Airplane air : airplanes) {
      if (air.getRegistrationNumber() == registrationNumber) {
        return air;
      }
    }
    return null;
  }

  @Override
  public ArrayList<Airplane> getAvaibilityAirplanes() {
    ArrayList<Airplane> result = new ArrayList<>();

    for (Airplane air : airplanes) {
      if (air.getIdGate().isEmpty()) {
        result.add(air);
      }
    }

    return result;
  }

  public ArrayList<Airplane> getAirplanes() {
    return airplanes;
  }
}
