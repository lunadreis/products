import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 32;
        int code = 2462;
        char gender = 'N';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.print(product1);
        System.out.print(", which price is $ ");
        System.out.printf("%.2f%n", price1);
        System.out.print(product2);
        System.out.print(", which price is $ ");
        System.out.printf("%.2f%n", price2);
        System.out.print("\nRecord: ");
        System.out.print("32 years old");
        System.out.print(", code 2462");
        System.out.println(" and gender: N");
        System.out.print("\nMeasue with eight decimal places:");
        System.out.printf("%.8f%n", measure);
        System.out.print("Rouded:");
        System.out.print(" (Three decimal places):");
        System.out.printf("%.3f%n" , measure);
        Locale.setDefault(Locale.US);
        System.out.print("US decimal point:");
        System.out.printf("%.3f" , measure);


    }
}
