import java.util.Scanner;
public class mainclass {

    public static void falseUnit() {
        System.out.println("""
                            
                            You have entered a wrong unit.
                            Please start again:
                            ------------------------------------------
                            Du hast eine falsche Einheit eingegeben.
                            Bitte starte von neu:""");
        LangSelect();
    }

    public static void LangSelect() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Select a language
                Wähle eine Sprache aus
                
                English/Englisch: EN
                German/Deutsch: DE""");
        String Input = userInput.next();

        if ("DE".equals(Input)) {
            convertGer();
        }
        else if ("EN".equals(Input)) {
            convertEng();
        }
        else {
            falseUnit();
        }
    }

    public static void convertEng() {                                                                                   //convert() Methode Englisch
        double eur = 0; // Bezeichnung "Euro"
        double usd = 0; // Bezeichnung "Dollar"
        double rub = 0; // Bezeichnung "Rubel"
        boolean isNumber;

        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                
                Which unit do you want to convert?
                The calculator works with these shortcuts:
                Euro: EUR
                US Dollar: USD
                Ruble: RUB""");
        String inputCurrency = userInput.nextLine();

        if ("EUR".equals(inputCurrency)) {
            System.out.println("""
                    
                    How much Euros do you want to convert?""");                                               //Wie viel €?
            do {
                if (userInput.hasNextDouble()) {
                    eur = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));

            System.out.println("""
                    
                    Into which unit do you want to convert?""");                                              //in welche Einheit möchtest du umrechnen?;
            switch (userInput.next()) {
                case "USD" -> System.out.println(eur + " Euros are " + eur * 1 + " US-Dollars");
                case "RUB" -> System.out.println(eur + " Euros are " + eur * 61.13 + " Rubel");                         //Eingaben werden umgerechnet
                default -> falseUnit();
            }


        } else if ("USD".equals(inputCurrency)) {
            System.out.println("""
                    
                    How much Dollars do you want to convert?""");
            do {
                if (userInput.hasNextDouble()) {
                    usd = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));

            System.out.println("""
                    
                    Into which unit do you want to convert?""");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(usd + " Dollars are " + usd * 1 + " Euro");
                case "RUB" -> System.out.println(usd + " Dollars are " + usd * 61.23 + " Rubel");
                default -> falseUnit();
            }
        } else if ("RUB".equals(inputCurrency)) {
            System.out.println("""
                    
                    How much Rubel do you want to convert?""");
            do {
                if (userInput.hasNextDouble()) {
                    rub = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));
            System.out.println("""
                    
                    Into which unit do you want to convert?""");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(rub + " Rubel are " + rub * 0.016 + " Euro");
                case "USD" -> System.out.println(rub + " Rubel are "+ rub * 0.016 + " US-Dollars");
                default -> {
                    System.out.println("""
                            You have entered a wrong unit.
                            Please start again:""");
                    convertGer();
                }
            }
        } else {
            falseUnit();
        }
    }

    public static void convertGer() {                                                                                   //convert() Methode Deutsch
        double eur = 0; // Bezeichnung "Euro"
        double usd = 0; // Bezeichnung "Dollar"
        double rub = 0; // Bezeichnung "Rubel"
        boolean isNumber;

        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                
                Welche Einheit möchtest du umrechnen?
                Der Rechner funktioniert mit diesen Kürzeln:
                Euro: EUR
                US-Dollar: USD
                Rubel: RUB""");
        String inputCurrency = userInput.nextLine();

        if ("EUR".equals(inputCurrency)) {
            System.out.println("""
                    
                    Wie viel Euro möchtest du umrechnen?""");                                                 //Wie viel €?
            do {
                if (userInput.hasNextDouble()) {
                    eur = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));

            System.out.println("""
                    
                    In welche Einheit möchtest du umrechnen""");                                              //in welche Einheit möchtest du umrechnen?;
                switch (userInput.next()) {
                    case "USD" -> System.out.println(eur + " Euro sind " + eur * 1 + " US-Dollar");
                    case "RUB" -> System.out.println(eur + " Euro sind " + eur * 61.13 + " Rubel");                     //Eingaben werden umgerechnet
                    default -> falseUnit();
                }


        } else if ("USD".equals(inputCurrency)) {
            System.out.println("""
                    
                    Wie viel Dollar möchtest du umrechnen?""");
            do {
                if (userInput.hasNextDouble()) {
                    usd = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));

            System.out.println("""
                    
                    In welche Einheit möchtest du umrechnen?""");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(usd + " Dollar sind " + usd * 1 + " Euro");
                case "RUB" -> System.out.println(usd + " Dollar sind " + usd * 61.23 + " Rubel");
                default -> falseUnit();
            }
        } else if ("RUB".equals(inputCurrency)) {
            System.out.println("""
                    
                    Wie viel Rubel möchtest du umrechnen?""");
            do {
                if (userInput.hasNextDouble()) {
                    rub = userInput.nextDouble();
                    isNumber = true;
                } else {
                    falseUnit();
                    isNumber = false;
                    userInput.next();
                }
            } while(!(isNumber));
            System.out.println("""
                    
                    In welche Einheit möchtest du umrechnen""");
            switch (userInput.next()) {
                case "EUR" -> System.out.println(rub + " Rubel sind " + rub * 0.016 + " Euro");
                case "USD" -> System.out.println(rub + " Rubel sind "+ rub * 0.016 + " US-Dollar");
                default -> {
                    System.out.println("""
                            
                            Du hast eine falsche Einheit eingegeben.
                            Bitte starte von neu:""");
                    convertGer();
                }
            }
        } else {
            falseUnit();
        }
    }
    public static void main(String[] args) {
        LangSelect();
    }
}


