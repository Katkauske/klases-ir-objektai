import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NuskaitytiIsFailo {
    public static void main(String[] args) throws Exception {
       try {
           nuskaitytiDuomenisIsFailo("knygos_pataisyta.csv");
       }
       catch (FileNotFoundException e){
           System.out.println("Failas nerastas");
       }
    }
    public static  ArrayList<Knyga> nuskaitytiDuomenisIsFailo(String failoAdresas) throws Exception{
        File failas = new File("knygos_pataisyta.csv");
        Scanner skaitytuvas = new Scanner(failas);
        skaitytuvas.nextLine();
       ArrayList<Knyga> knyga = new ArrayList<>();
       while (skaitytuvas.hasNextLine()) {
           String eilute = skaitytuvas.nextLine();
          String[] isskaldytiEilute = eilute.split(",");
          Knyga knyga1 = new Knyga();
          knyga1.setId(Integer.parseInt(isskaldytiEilute[0]));
          knyga1.setPavadinimas(isskaldytiEilute[1]);
          knyga1.setAutorius(isskaldytiEilute[2]);
          knyga1.setZanras(isskaldytiEilute[3]);
          knyga1.setIvertinimas(Double.parseDouble(isskaldytiEilute[4]));
          knyga1.setPuslapiuSkaicius(Integer.parseInt(isskaldytiEilute[5]));
          knyga1.setLeidejas(isskaldytiEilute[6]);
           System.out.println("knyga1 = " + knyga1);
       }
        return knyga;
    }
}
