public class Boger {
    private int bogid;
    private String title;
    private String Forfatter;
    private boolean udlaant;
    private Laaner laaner;
    private String udlaansDato;
    private String LaanerNavn;
    private String Dato;

    public Boger(int bogid, String title, String forfatter) {
        this.bogid = bogid;
        this.title = title;
        Forfatter = forfatter;

    }
    public void udlaanBog(Laaner l, String Dato){

        this.udlaant = true;
        this.laaner = l;
        this.udlaansDato = Dato;

        }



    public void afleverBog(){
        this.udlaant = false;
        this.laaner = null;
        this.udlaansDato = "";
    }

    public int getBogid() {
        return bogid;
    }

    public void setBogid(int bogid) {
        this.bogid = bogid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForfatter() {
        return Forfatter;
    }

    public void setForfatter(String forfatter) {
        Forfatter = forfatter;
    }



    public boolean isUdlaant() {
        return udlaant;
    }

    public void setUdlaant(boolean udlaant) {
        this.udlaant = udlaant;
    }

    public Laaner getLaaner() {
        return laaner;
    }

    public void setLaaner(Laaner laaner) {
        this.laaner=laaner;
    }

    public String getUdlaansDato() {
        return udlaansDato;
    }

    public void setUdlaansDato(String udlaansDato) {
        this.udlaansDato = udlaansDato;
    }




    @Override
    public String toString() {
        return "Boger{" +
                "bogid=" + bogid +
                ", title='" + title + '\'' +
                ", Forfatter='" + Forfatter + '\'' +
                ", udlaant=" + udlaant +
                ", laaner='" + laaner + '\'' +
                ", udlaansDato='" + udlaansDato + '\'' +
                '}';
    }
}
