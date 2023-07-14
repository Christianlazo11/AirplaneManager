package org.example.Data;

import java.util.ArrayList;
import org.example.Airplane.Airplane;

public class SetTestDataAirplane {

  public static void setData(ArrayList<Airplane> air) {
    air.add(new Airplane("LATAM", 100, 25468, "disponible"));
    air.add(new Airplane("SKY", 120, 25465, "En mantenimiento"));
    air.add(new Airplane("Avianca", 500, 25496, "disponible"));
    air.add(new Airplane("EasyFly", 420, 25449, "En vuelo"));
    air.add(new Airplane("JetSmart", 350, 25436, "disponible"));
    air.add(new Airplane("Emirates", 450, 25436, "disponible", "151fs26s"));
  }
}
