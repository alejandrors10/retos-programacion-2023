package Reto_3;

import javax.swing.*;
import java.util.Random;

public class AlejandroRS10 {
    private static final Random random=new Random();

    public static void main(String[] args) {


        int i=Integer.parseInt(JOptionPane.showInputDialog("Elige: Todos (1), Letras y números (2), " +
                "Números y símbolos (3), Letras y símbolos (4), Letras (5), Números (6), Símbolos (7)"));

        switch (i) {
            case 1 -> System.out.println(generateRandomPasswordAll(generateRandomLenght()));
            case 2 -> System.out.println(generateRandomPasswordLetNum(generateRandomLenght()));
            case 3 -> System.out.println(generateRandomPasswordNumSym(generateRandomLenght()));
            case 4 -> System.out.println(generateRandomPasswordLetSym(generateRandomLenght()));
            case 5 -> System.out.println(generateRandomPasswordLet(generateRandomLenght()));
            case 6 -> System.out.println(generateRandomPasswordNum(generateRandomLenght()));
            case 7 -> System.out.println(generateRandomPasswordSym(generateRandomLenght()));
            default -> System.out.println("Elige un número entre 1 y 7");
        }

    }

    public static int generateRandomLenght(){

        int minCifras = 8;
        int maxCifras = 16;

        return random.nextInt(maxCifras - minCifras + 1) + minCifras;
    }


    public static String generateRandomPasswordAll(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=[]{}|;:,.<>?";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }

    public static String generateRandomPasswordLetNum(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }

    public static String generateRandomPasswordLet(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }

    public static String generateRandomPasswordLetSym(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_-+=[]{}|;:,.<>?";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }

    public static String generateRandomPasswordNumSym(int length) {
        String symbols = "0123456789!@#$%^&*()_-+=[]{}|;:,.<>?";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }

    public static String generateRandomPasswordSym(int length) {
        String symbols = "!@#$%^&*()_-+=[]{}|;:,.<>?";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }
    public static String generateRandomPasswordNum(int length) {
        String symbols = "0123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }
}
