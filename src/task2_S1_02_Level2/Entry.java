package task2_S1_02_Level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message + " :");
            try {
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }
    public static int readInt(String message) {
        while (true) {
            System.out.println(message + " :");
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }
    public static float readFloat(String message) {
        while (true) {
            System.out.println(message + " :");
            try {
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }
    public static double readDouble(String message) {
        while (true) {
            System.out.println(message + " :");
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }
    public static char readChar(String message) {
        while (true) {
            System.out.println(message + " :");
          String entry = scanner.nextLine();

          if (entry.length() == 1) {
              return  entry.charAt(0);
          }else {
              System.out.println(" Error: You must enter only one character. Please try again.");
          }
    }



}
