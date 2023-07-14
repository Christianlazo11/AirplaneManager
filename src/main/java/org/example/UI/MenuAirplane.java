package org.example.UI;

import static org.example.Main.airplaneManager;
import static org.example.Main.gateManager;
import static org.example.UI.MenuAirplaneManager.showMenuAirplane;

import java.util.ArrayList;
import org.example.Airplane.Airplane;
import org.example.Utils.Utils;

public class MenuAirplane {

  public static void getAvaibilityAirplanes() {
    ArrayList<Airplane> data = airplaneManager.getAvaibilityAirplanes();

    System.out.printf("%77s%n", "-".repeat(77));
    System.out.printf(
        "|%-8s|%-15s|%-15s|%-15s|%-18s|",
        "# Avión", "# de registro", "Aereolinea", "Capacidad", "Estado");
    for (int i = 0; i < data.size(); i++) {
      System.out.printf("%n%77s%n", "-".repeat(77));
      System.out.printf("|%-8s|", (i + 1));
      System.out.printf("%-15s|", data.get(i).getRegistrationNumber());
      System.out.printf("%-15s|", data.get(i).getAirline());
      System.out.printf("%-15s|", data.get(i).getPassengerCapacity());
      System.out.printf("%-18s|", data.get(i).getStatus());
    }
    System.out.printf("%n%77s%n", "-".repeat(77));
  }

  public static void createAirplane() {
    System.out.printf("%77s%n", "-".repeat(77));
    System.out.printf("%-77s%n", "Crear Avión");
    System.out.printf("%77s%n", "-".repeat(77));
    System.out.println("Ingrese los siguientes datos: ");
    System.out.printf("%77s%n", "-".repeat(77));
    System.out.println("Aereolinea: ");
    String airline = Utils.s.next();
    System.out.println("Capacidad: ");
    int capacity = Utils.s.nextInt();
    System.out.println("Estado: ");
    String state = Utils.s.next();
    System.out.println("# de Registro: ");
    int registrationNumber = Utils.s.nextInt();
    System.out.printf("%77s%n", "-".repeat(77));

    Airplane air = new Airplane(airline, capacity, registrationNumber, state);

    airplaneManager.create(air);
    Utils.clearDisplay();
    System.out.println("✔Avión creado Correctamente!!!");
    showMenuAirplane();
  }

  public static void editAirplane() {
    System.out.println("Ingresa el número del avión que deseas Editar");
    int option = 0;
    int cont = 0;
    ArrayList<Airplane> data = airplaneManager.getAirplanes();

    while (option < 1 || option > data.size()) {
      if (cont > 0) {
        System.out.println("Ingrese una Opción correcta por favor !!!");
      }
      option = Utils.s.nextInt();
      cont++;
    }
    Airplane airFind = data.get(option - 1);

    System.out.printf("%77s%n", "-".repeat(77));
    System.out.printf("%-77s%n", "Actualizar Avión");
    System.out.printf("%77s%n", "-".repeat(77));
    System.out.println("Ingrese los siguientes datos");
    System.out.printf("%77s%n", "-".repeat(77));
    System.out.println("Aereolinea: ");
    String airline = Utils.s.next();
    System.out.println("Capacidad: ");
    int capacity = Utils.s.nextInt();
    System.out.println("Estado: ");
    String state = Utils.s.next();
    System.out.println("# de Registro: ");
    int registrationNumber = Utils.s.nextInt();
    System.out.printf("%77s%n", "-".repeat(77));

    airFind.setAirline(airline);
    airFind.setPassengerCapacity(capacity);
    airFind.setStatus(state);
    airFind.setRegistrationNumber(registrationNumber);

    airplaneManager.edit(airFind);
    Utils.clearDisplay();
    System.out.println("✔Avión actualizado Correctamente!!!");

    showMenuAirplane();
  }

  public static void deleteAirplane() {
    System.out.println("Ingresa el número del avión que deseas eliminar");
    int option = 0;
    int cont = 0;
    ArrayList<Airplane> data = airplaneManager.getAirplanes();

    while (option < 1 || option > data.size()) {
      if (cont > 0) {
        System.out.println("Ingrese una Opción correcta por favor !!!");
      }
      option = Utils.s.nextInt();
      cont++;
    }
    Airplane airFind = data.get(option - 1);

    airplaneManager.delete(airFind.getId());
    gateManager.deleteAirplane(airFind.getIdGate());

    Utils.clearDisplay();
    System.out.println("✔Avión eliminado Correctamente!!!");
    showMenuAirplane();
  }
}
