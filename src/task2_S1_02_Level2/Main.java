package task2_S1_02_Level2;

public class Main {
    public static void main(String[] args) {


        byte b = Entry.readByte("Enter a byte value");
        System.out.println("You entered byte: " + b);

        int i = Entry.readInt("Enter an Integer value");
        System.out.println("You entered Integer: " + i);

        float f = Entry.readFloat("Enter a float value (use ',' instead of '.')");
        System.out.println("You entered float: " + f);

        double d = Entry.readDouble("Enter a double value");
        System.out.println("You entered double: " + d);

        char c = Entry.readChar("Enter a single character");
        System.out.println("You entered char: " + c);

        String s = Entry.readString("Enter string");
        System.out.println("You entered string: " + s);

        boolean yn = Entry.readYesOrNo("Do you want to continue?");

    }
}




