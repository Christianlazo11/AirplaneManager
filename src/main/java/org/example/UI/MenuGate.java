package org.example.UI;

import static org.example.Main.airplaneManager;
import static org.example.Main.gateManager;

import java.util.ArrayList;
import org.example.Airplane.Airplane;
import org.example.Gate.Gate;
import org.example.Utils.Utils;

public class MenuGate {

  public static void showAllGates() {
    ArrayList<Gate> data = gateManager.getAllGates();

    System.out.printf("%29s%n", "-".repeat(29));
    System.out.printf("|%-10s|%-16s|%n", "# Puerta", "Disponibilidad");
    for (int i = 0; i < data.size(); i++) {
      System.out.printf("%29s%n", "-".repeat(29));
      System.out.printf("|%-10s|", data.get(i).getGateNumber());
      System.out.printf("%-16s|%n", data.get(i).isAvaibility());
    }
    System.out.printf("%29s%n", "-".repeat(29));

    int option = 0;
    System.out.println("1. => Menu Anterior");
    while (option != 1) {
      option = Utils.s.nextInt();
    }
    if (option == 1) {
      MenuGateManager.showMenu();
    }
  }

  public static void showAvaibilityGates() {
    ArrayList<Gate> data = gateManager.getAvaibilityGates();

    System.out.printf("%29s%n", "-".repeat(29));
    System.out.printf("|%-10s|%-16s|%n", "# Puerta", "Disponibilidad");
    for (int i = 0; i < data.size(); i++) {
      System.out.printf("%29s%n", "-".repeat(29));
      System.out.printf("|%-10s|", data.get(i).getGateNumber());
      System.out.printf("%-16s|%n", data.get(i).isAvaibility());
    }
    System.out.printf("%29s%n", "-".repeat(29));
  }

  public static void assignGate(int gateNumber, int registrationAirplane) {

    Airplane air = airplaneManager.search(registrationAirplane);
    Gate gate = gateManager.search(gateNumber);

    air.setIdGate(gate.getId());

    gateManager.addAirplane(gateNumber, air.getId());

    airplaneManager.edit(air);

    Utils.clearDisplay();
    System.out.println("✔Avión asignado Correctamente!!!");

    MenuGateManager.showMenu();
  }
}
