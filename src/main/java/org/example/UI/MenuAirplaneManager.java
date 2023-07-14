package org.example.UI;

import static org.example.Main.airplaneManager;
import static org.example.UI.MenuAirplane.*;

import java.util.ArrayList;
import org.example.Airplane.Airplane;
import org.example.Utils.Utils;

public abstract class MenuAirplaneManager {

  public static void showMenuAirplane() {
    Utils.clearDisplay();
    System.out.println("****** Menu Avión ******");
    System.out.println("----------------------------");
    System.out.println("****** Aviones ******");
    showAirplanes();
    System.out.println("Escoja la acción que desea realizar");
    showMenuOption();

    int option = 0;
    int cont = 0;

    while (option < 1 || option > 4) {
      if (cont > 0) {
        System.out.println("Ingrese una Opción correcta por favor !!!");
      }
      System.out.println(">>");
      option = Utils.s.nextInt();
      cont++;
    }

    selectMenuOption(option);
  }

  public static void showAirplanes() {
    ArrayList<Airplane> data = airplaneManager.getAirplanes();
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

  public static void showMenuOption() {

    System.out.printf("%77s%n", "-".repeat(77));
    System.out.printf("|%-15s|", "1. Editar");
    System.out.printf("%-15s|", "2. Eliminar");
    System.out.printf("%-15s|", "3. Crear");
    System.out.printf("%-15s|%n", "4. Volver al menu principal");
    System.out.printf("%77s%n|", "-".repeat(77));
  }

  public static void selectMenuOption(int option) {

    switch (option) {
      case 1:
        editAirplane();
        break;
      case 2:
        deleteAirplane();
        break;
      case 3:
        createAirplane();
        break;
      case 4:
        Menu.showMenu();
        break;
      default:
        System.out.println("Error !!!, reinicie el programa 😁😁");
    }
  }
}
