public class Knyga {
   private int id;
   private String pavadinimas;
   private String autorius;
   private String zanras;
   private double ivertinimas;
   private int puslapiuSkaicius;
   private String leidejas;

    public Knyga(int id, String pavadinimas, String autorius, String zanras, double ivertinimas, int puslapiuSkaicius, String leidejas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.zanras = zanras;
        this.ivertinimas = ivertinimas;
        this.puslapiuSkaicius = puslapiuSkaicius;
        this.leidejas = leidejas;
    }

    public Knyga() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAutorius() {
        return autorius;
    }

    public void setAutorius(String autorius) {
        this.autorius = autorius;
    }

    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public double getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(double ivertinimas) {
        this.ivertinimas = ivertinimas;
    }

    public int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public String getLeidejas() {
        return leidejas;
    }

    public void setLeidejas(String leidejas) {
        this.leidejas = leidejas;
    }

    @Override
    public String toString() {
        return "Knyga{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", autorius='" + autorius + '\'' +
                ", zanras='" + zanras + '\'' +
                ", ivertinimas=" + ivertinimas +
                ", puslapiuSkaicius=" + puslapiuSkaicius +
                ", leidejas='" + leidejas + '\'' +
                '}';
    }
}

