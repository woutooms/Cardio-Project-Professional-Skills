package fact.it.cardioproject.model;

import fact.it.cardioproject.controller.MainController;

public class Oefening {

    public static enum Exercise {

        plank("Plank", 2, 10, "In buiklig steunen op ellebogen en voeten, lichaam volledig strekken."),
        brug("Brug", 2, 10, "In ruglig steunen op schouders en voeten, bekken omhoog heffen."),
        plattePlankLinks("Platte Plank Links", 2, 10, "In Re zijlig onderste knie buigen, Li been gestrekt opheffen"),
        plattePlankRechts("Platte Plank Rechts", 2, 10, "In Li zijlig onderste knie buigen, Re been gestrekt opheffen"),
        supermanLinks("Platte Plank Links", 2, 10, "In handen en knieënstand, Li arm en Re been strekken"),
        supermanRechts("Platte Plank Rechts", 2, 10, "In handen en knieënstand, Re arm en Li been strekken"),
        kattenrug("Kattenrug", 2, 8, "Steunen op handen en knieën, Afwisselend holle en bolle rug maken"),
        stapjes("Stapjes", 2, 6, "In ruglig steunen op schouders en voeten, stapjes zetten"),
        beenstrekLinks("Beenstrek Links", 2, 6, "In ruglig steunen op schouders en voeten, Bekken omhoog heffen met 1 been gestrekt"),
        beenstrekRechts("Beenstrek Rechts", 2, 6, "In ruglig steunen op schouders en voeten, Bekken omhoog heffen met 1 been gestrekt"),
        plankLinksStrek("Plank Links been gestrekt", 2, 10, "In Li zijlig steunen op Li elleboog en Re knie, Bekken omhoog heffen en Re been strekken"),
        plankRechtsStrek("Plank Rechts been gestrekt", 2, 10, "In Re zijlig steunen op Re elleboog en Re knie, Bekken omhoog heffen en Li been strekken"),
        plankLinksBeweeg("Plank Links been bewegen", 2, 10, "In Li zijlig steunen op Li elleboog en Re knie, Bekken omhoog heffen en Re been op en neer bewegen"),
        plankRechtsBeweeg("Plank Rechts been bewegen", 2, 10, "In Re zijlig steunen op Re elleboog en Re knie, Bekken omhoog heffen en Li been op en neer bewegen");

        private String naamOefening;
        private int herhalingenOefening;
        private int tijdOefening;
        private String uitlegOefening;

        Exercise(String naamOefening, int herhalingenOefening, int tijdOefening, String uitlegOefening) {
            this.naamOefening = naamOefening;
            this.herhalingenOefening = herhalingenOefening;
            this.tijdOefening = tijdOefening;
            this.uitlegOefening = uitlegOefening;
        }

        public String getNaamOefening() {
            return naamOefening;
        }

        public int getHerhalingenOefening() {
            return herhalingenOefening;
        }

        public int getTijdOefening() {
            return tijdOefening;
        }

        public String getUitlegOefening() {
            return uitlegOefening;
        }

        public void setNaamOefening(String naamOefening) {
            this.naamOefening = naamOefening;
        }

        public void setHerhalingenOefening(int herhalingenOefening) {
            this.herhalingenOefening = herhalingenOefening;
        }

        public void setTijdOefening(int tijdOefening) {
            this.tijdOefening = tijdOefening;
        }

        public void setUitlegOefening(String uitlegOefening) {
            this.uitlegOefening = uitlegOefening;
        }

    }

}