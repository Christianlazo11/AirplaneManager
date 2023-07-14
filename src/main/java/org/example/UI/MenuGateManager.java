package org.example.UI;

import org.example.Gate.Gate;
import org.example.Gate.GateManager;
import org.example.Utils.Utils;

import java.util.ArrayList;

import static org.example.Main.gateManager;

public abstract class MenuGateManager {

    public static void showMenu() {
        System.out.println("******  Menu Puertas  ******");
        System.out.println("----------------------------");
        System.out.println("******    Puertas     ******");
        System.out.println("Escoja la acción que desea realizar");
        showGates();
    }

    public static void showGates() {
        int option = 0;
        int cont = 0;

        System.out.printf("%32s%n", "-".repeat(32));
        System.out.printf("|%-5s|%-25s|%n", "1.", "Ver todas las puertas");
        System.out.printf("%32s%n", "-".repeat(32));
        System.out.printf("|%-5s|%-25s|%n", "2.", "Ver puertas disponibles");
        System.out.printf("%32s%n", "-".repeat(32));

        while(option < 1 || option > 2) {
            if(cont > 0) {
                System.out.println("Ingresa una opción correcta!!!");
            }
            option = Utils.s.nextInt();
            cont++;
        }

        if(option == 1) {
            MenuGate.showAllGates();
        } else {
            MenuGate.showAvaibilityGates();
            System.out.println("Elije una opción ");
            showGatesOption();
        }
    }

    public static void showGatesOption() {
        int option = 0;
        int cont = 0;
        System.out.printf("%32s%n", "-".repeat(32));
        System.out.printf("|%-5s|%-25s|%n", "1.", "Asignar puerta");
        System.out.printf("%32s%n", "-".repeat(32));
        System.out.printf("|%-5s|%-25s|%n", "2.", "Volver al menu principal");
        System.out.printf("%32s%n", "-".repeat(32));

        while(option < 1 || option > 2) {
            if(cont > 0) {
                System.out.println("Ingresa una opción correcta!!!");
            }
            option = Utils.s.nextInt();
            cont++;
        }

        if(option == 1) {
            showSelectGate();
        } else {
            Menu.showMenu();
        }

    }

    public static void showSelectGate() {
        int option = 0;
        int cont = 0;
        int dataLength = gateManager.getAllGates().size();

        System.out.println("Ingresa el número de puerta que quieres asignar");

        while (option < 1 || option > dataLength) {
            if(cont > 0) {
                System.out.println("Ingresa una opción correcta!!!");
            }
            option = Utils.s.nextInt();
            cont++;
        }

        MenuAirplane.getAvaibilityAirplanes();
        System.out.println("Ingresa el # de registro del avión que quieres asignar");


    }
}
