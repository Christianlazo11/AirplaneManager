package org.example;


import org.example.Airplane.Airplane;
import org.example.Airplane.AirplaneManager;
import org.example.Gate.Gate;
import org.example.Gate.GateManager;
import org.example.UI.Menu;

import java.util.ArrayList;

public class Main {

    public static GateManager gateManager;
    public static AirplaneManager airplaneManager;
    public static void main(String[] args) {
        System.out.println("Hello world!");

       gateManager = new GateManager();
       airplaneManager = new AirplaneManager();


        ArrayList<Airplane> data = airplaneManager.getAirplanes();
        ArrayList<Gate> data02 = gateManager.getAllGates();

        //gateManager.deleteAirplane();
        //airplaneManager.edit();


        Menu.showMenu();

        //System.out.println(data.toString());


    }
}