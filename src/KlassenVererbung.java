public class KlassenVererbung {
     static class Mensch{
        private int alter;
        private String vorname;
        private String nachname;

        int getAlter(){
            return alter;
        }

        String getVorname(){
            return vorname;
        }

        String getNachname(){
            return nachname;
        }

        void setAlter(int alter){
            this.alter=alter;
        }

        void setVorname(String vorname){
            this.vorname=vorname;
        }

        void setNachname(String nachname){
            this.nachname=nachname;
        }
        Mensch(int alter,String vorname,String nachname){
            this.alter=alter;
            this.vorname=vorname;
            this.nachname=nachname;

        }

        }
     static class Untermensch extends Mensch {
        private double geld;

        double getGeld(){
            return geld;
        }

        void setGeld(double geld){
            this.geld=geld;
        }
        Untermensch(int alter, String vorname, String nachname,double geld) {
            super(alter, vorname, nachname);
        }

    }

    public static void main(String[] args) {
        Mensch Peter = new Mensch(18,"Peter","Peters");
        Untermensch Franz =new Untermensch(40,"Franz","Franzens",3000);
        System.out.println(Peter.alter);
        System.out.println(Franz.getGeld());
    }
}
