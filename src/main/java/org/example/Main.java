package org.example;

import org.example.Airplane.AirplaneManager;
import org.example.Gate.GateManager;
import org.example.UI.Menu;

public class Main {

  public static GateManager gateManager;
  public static AirplaneManager airplaneManager;

  public static void main(String[] args) {
    System.out.println("Hello world!");

    gateManager = new GateManager();
    airplaneManager = new AirplaneManager();

    Menu.showMenu();
  }
}
