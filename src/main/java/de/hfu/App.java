package de.hfu;
import java.util.Scanner;
public class App {
    private static Scanner text;

	public static void main(String[] args) {
        System.out.println("Text eingeben:");
        text = new Scanner(System.in);
        String klein = text.nextLine();
        String gross;
        gross = klein.toUpperCase();
        System.out.println(gross);
    }
}
