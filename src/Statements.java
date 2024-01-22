public class Statements {
    public static void main(String[] args) {
        int startPositie = 1;
        if (startPositie == 1) {
            System.out.println("Jij start van pole-position.");
        }

        int cijfer = 2;
        if (cijfer >= 8) {
            System.out.println("je hebt een mooi cijfer");
        } else if (cijfer >= 3) {
            System.out.println("je komt in aanmerking voor een herkansing");
        } else {
            System.out.println("je bent gezakt voor deze leerlijn");
        }

        //Als je in Java twee variabelen van het datatype String met elkaar wilt vergelijken, doe je dat niet met de ==-operator, maar met de equals() of equalsIgnoreCase()-methode.

        String voornaam = "Jef";
        if (voornaam.equals("Jef")) {
            System.out.println("jij hebt dit statement geschreven");
        } else {
            System.out.println("wie ben jij?");
        }
        int weekdag = 0; // verander deze waarde
        String dag;
        switch (weekdag) {
            case 0:
                dag = "zondag";
                break;
            case 1:
                dag = "maandag";
                break;
            case 2:
                dag = "dinsdag";
                break;
            case 3:
                dag = "woensdag";
                break;
            case 4:
                dag = "donderdag";
                break;
            case 5:
                dag = "vrijdag";
                break;
            case 6:
                dag = "zaterdag";
                break;
            default:
                dag = "onbekend";
        }
        System.out.println("Het is: " + dag);
    }
}

