package hfu;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Text eingeben:");
        Scanner text = new Scanner(System.in);
        String klein = text.nextLine();
        String gross;
        gross = klein.toUpperCase();
        System.out.println(gross);
    }
}
