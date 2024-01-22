public class Methode {

    public class CapitalizedAndVerdubbelaar {
        public static void main(String[] args) {
            capitalizeAndPrint("novi hogeschool");
            capitalizeAndPrint("Koningin Beatrix");

            verdubbelaar(10); // het resultaat hiervan zie je niet. Waarom niet?
            System.out.println("Het dubbele van 100 is: " + verdubbelaar(100));
            int uitslag = verdubbelaar(1000) + 10;
            System.out.println("Duizend verdubbeld + 10 is: " + uitslag);
        }
        public static void capitalizeAndPrint(String input) {
            String capitalized = input.toUpperCase();
            System.out.println("Everything capitalized: " + capitalized);
        }

        public static int verdubbelaar(int cijfer) {
            int uitkomst = cijfer * 2;
            return uitkomst;
        }

    }
}
