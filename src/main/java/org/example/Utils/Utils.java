package org.example.Utils;

import java.util.Scanner;
import java.util.UUID;

public class Utils {

  public static Scanner s = new Scanner(System.in);

  public static String getID() {
    UUID uuid = UUID.randomUUID();
    return uuid.toString();
  }

  public static void clearDisplay() {
    System.out.printf("%n%n%n%n%n%n");
  }
}
