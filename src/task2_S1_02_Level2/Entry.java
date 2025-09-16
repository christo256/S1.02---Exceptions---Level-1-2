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
                System.out.println("Format error. Please enter a valid byte.");
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
                System.out.println("Format error. Please enter a valid integer.");
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
                System.out.println("Format error. Please enter a valid float (use ',' instead of '.').");
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
                System.out.println("Format error. Please enter a valid double.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message + " :");
            String entry = scanner.nextLine();
            try {
                if (entry.length() != 1) {
                    throw new InputValidationException("Error: You must enter only one character. Please try again.");
                }
                return entry.charAt(0);
            } catch (InputValidationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    public static String readString(String message) {

        while (true) {
            System.out.print(message + ": ");
            String entry = scanner.nextLine();

            try {
                if (entry.trim().isEmpty()) {
                    throw new InputValidationException("Input cannot be empty.");
                }
                return entry;
            } catch (InputValidationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static boolean readYesOrNo(String message) {

        while (true) {
            System.out.println(message + " :");
            String entry = scanner.nextLine().trim().toLowerCase();

            try {
                if (entry.equals("y")) {
                    return true;
                } else if (entry.equals("n")) {
                    return false;
                } else {
                    throw new InputValidationException("Error: Please enter 'y' for yes or 'n' for no.");
                }
            } catch (InputValidationException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}
