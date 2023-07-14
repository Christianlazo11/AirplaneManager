package org.example.UI;

import org.example.Utils.Utils;

public abstract class Menu {

  public static void showMenu() {
    Utils.clearDisplay();
    System.out.println("****** Menu Principal ******");
    System.out.println("----------------------------");
    System.out.println("Escoja una de las siguientes opciones: ");
    System.out.println("1. Gestión de Aviones");
    System.out.println("2. Gestión de Puertas");
    System.out.println("3. Salir");

    int option = 0;
    int cont = 0;
    // Comprobamos que la opción sea correcta
    while (option != 1 && option != 2 && option != 3) {
      if (cont > 0) {
        System.out.println("Ingrese una Opción correcta por favor !!!");
      }
      System.out.print(">>");
      option = Utils.s.nextInt();
      cont++;
    }

    // Verificasmos con que menu continuar dependiendo de la opción
    showMenuOption(option);
  }

  public static void showMenuOption(int option) {
    System.out.println(option);

    if (option == 1) {
      MenuAirplaneManager.showMenuAirplane();
    } else if (option == 2) {
      MenuGateManager.showMenu();
    } else if (option == 3) {
      System.out.printf("%77s%n", "-".repeat(77));
      System.out.println("🖐🖐🖐🖐🖐🖐🖐🖐🖐🖐");
      System.out.printf("%77s%n", "-".repeat(77));
      System.exit(0);
    }
  }
}
