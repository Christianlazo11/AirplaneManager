package org.example.Airplane;

import org.example.Utils.Utils;

public class Airplane {
  private String id;
  private String airline;
  private int passengerCapacity;
  private int registrationNumber;
  private String status;
  private String idGate;

  public Airplane(
      String airline, int passengerCapacity, int registrationNumber, String status, String idGate) {
    this.id = Utils.getID();
    this.airline = airline;
    this.passengerCapacity = passengerCapacity;
    this.registrationNumber = registrationNumber;
    this.status = status;
    this.idGate = idGate;
  }

  public Airplane(String airline, int passengerCapacity, int registrationNumber, String status) {
    this.id = Utils.getID();
    this.airline = airline;
    this.passengerCapacity = passengerCapacity;
    this.registrationNumber = registrationNumber;
    this.status = status;
    this.idGate = "";
  }

  public String getId() {
    return id;
  }

  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(int passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getIdGate() {
    return idGate;
  }

  public void setIdGate(String idGate) {
    if (this.idGate.isEmpty()) {
      this.idGate = idGate;
    }
  }

  @Override
  public String toString() {
    return "Airplane{"
        + "id='"
        + id
        + '\''
        + ", airline='"
        + airline
        + '\''
        + ", passengerCapacity="
        + passengerCapacity
        + ", registrationNumber="
        + registrationNumber
        + ", status='"
        + status
        + '\''
        + ", idGate='"
        + idGate
        + '\''
        + '}';
  }
}
