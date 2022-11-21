public class Programa {
    public static void main(String[] args) {

        Knyga knyga1 = new Knyga(11111, "Pasakos", "Inga Narijauskiene", "Grozine literatura", 8.5, 50, "Baltos lankos");
        System.out.println("knyga1.getid() = " + knyga1.getId());
        System.out.println("knyga1 = " + knyga1.getPavadinimas());
        System.out.println("knyga1 = " + knyga1.getAutorius());
        System.out.println("knyga1.getZanras() = " + knyga1.getZanras());
        System.out.println("knyga1.getIvertinimas() = " + knyga1.getIvertinimas());
        System.out.println("knyga1.getPuslapiuSkaicius() = " + knyga1.getPuslapiuSkaicius());
        System.out.println("knyga1 = " + knyga1.getLeidejas());
        System.out.println("knyga1 = " + knyga1);
    }

    }
