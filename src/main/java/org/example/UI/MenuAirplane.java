package org.example.UI;

import org.example.Airplane.Airplane;

import java.util.ArrayList;

import static org.example.Main.airplaneManager;

public class MenuAirplane {

    public static void getAvaibilityAirplanes() {
        ArrayList<Airplane> data =  airplaneManager.getAvaibilityAirplanes();

        System.out.printf("%77s%n", "-".repeat(77));
        System.out.printf("|%-8s|%-15s|%-15s|%-15s|%-18s|", "# Avión", "# de registro", "Aereolinea", "Capacidad", "Estado");
        for(int i = 0; i < data.size(); i++) {
            System.out.printf("%n%77s%n", "-".repeat(77));
            System.out.printf("|%-8s|", (i + 1));
            System.out.printf("%-15s|",data.get(i).getRegistrationNumber());
            System.out.printf("%-15s|",data.get(i).getAirline());
            System.out.printf("%-15s|",data.get(i).getPassengerCapacity());
            System.out.printf("%-18s|",data.get(i).getStatus());
        }
        System.out.printf("%n%77s%n", "-".repeat(77));
    }
}
