import java.util.Scanner;
public class mainclass {

    public static void main(String[] args) {
        double eur; // Bezeichnung "Euro"
        double usd; // Bezeichnung "Dollar"
        double rub; // Bezeichnung "Rubel"

        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Welche Einheit möchtest du umrechnen?
                Der Rechner funktioniert mit diesen Kürzeln:
                Euro: EUR
                US-Dollar: USD
                Rubel: RUB""");
        String inputCurrency = userInput.nextLine();

        if ("EUR".equals(inputCurrency)) {
            System.out.println("Wie viel Euro möchtest du umrechnen?");                            //Wie viel €?
            eur = userInput.nextDouble();
            System.out.println("In welche Einheit möchtest du umrechnen");                         //in welche Einheit möchtest du umrechnen?;
            switch (userInput.next()) {
                case "USD" -> System.out.println(eur + " Euro sind " + eur * 1 + " US-Dollar");
                case "RUB" -> System.out.println(eur + "Euro sind " + eur * 61.13 + " Rubel");   //Eingaben werden umgerechnet
            }
        } else if ("USD".equals(inputCurrency)) {
            System.out.println("Wie viel Dollar möchtest du umrechnen?");
            usd = userInput.nextDouble();
            System.out.println("In welche Einheit möchtest du umrechnen?");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(usd + " Dollar sind " + usd * 1 + " Euro");
                case "RUB" -> System.out.println(usd + " Dollar sind " + usd * 61.23 + " Rubel");
            }
        } else if ("RUB".equals(inputCurrency)) {
            System.out.println("Wie viel Rubel möchtest du umrechnen?");
            rub = userInput.nextDouble();
            System.out.println("In welche Einheit möchtest du umrechnen");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(rub + " Rubel sind " + rub * 0.016 + " Euro");
                case "USD" -> System.out.println(rub + " Rubel sind "+ rub * 0.016 + " US-Dollar");
            }
        } else {
            System.out.println("""
                Gib zunächst eine Einheit ein in welche du umrechnen möchtest
                Der Rechner funktioniert mit diesen Kürzeln:
                Euro: EUR
                US-Dollar: USD
                Rubel: RUB""");

            //Programm neustarten lassen hier (Mithilfe von Funktion oder Schleife)
        }

    }
}


