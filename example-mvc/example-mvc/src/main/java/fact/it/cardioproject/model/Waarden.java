package fact.it.cardioproject.model;

import fact.it.cardioproject.controller.MainController;

public class Waarden {

    Oefening oefening;

    public void veranderOefening(FileData day){

        if(1 <= day.getDay() && day.getDay() < 8) {
            Oefening.Exercise.plank.setHerhalingenOefening(3);
            Oefening.Exercise.brug.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(3);

            Oefening.Exercise.plank.setTijdOefening(15);
            Oefening.Exercise.brug.setTijdOefening(15);
            Oefening.Exercise.plattePlankLinks.setTijdOefening(15);
            Oefening.Exercise.plattePlankRechts.setTijdOefening(15);
            Oefening.Exercise.supermanLinks.setTijdOefening(15);
            Oefening.Exercise.supermanRechts.setTijdOefening(15);
            Oefening.Exercise.kattenrug.setTijdOefening(10);
            Oefening.Exercise.stapjes.setTijdOefening(10);
            Oefening.Exercise.beenstrekLinks.setTijdOefening(10);
            Oefening.Exercise.beenstrekRechts.setTijdOefening(10);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(15);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(15);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(15);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(15);
        }else if(8 <= day.getDay() && day.getDay() < 15){
            Oefening.Exercise.plank.setHerhalingenOefening(2);
            Oefening.Exercise.brug.setHerhalingenOefening(2);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(2);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(2);
            Oefening.Exercise.stapjes.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekLinks.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekRechts.setHerhalingenOefening(3);

            Oefening.Exercise.plank.setTijdOefening(20);
            Oefening.Exercise.brug.setTijdOefening(20);
            Oefening.Exercise.plattePlankLinks.setTijdOefening(20);
            Oefening.Exercise.plattePlankRechts.setTijdOefening(20);
            Oefening.Exercise.supermanLinks.setTijdOefening(20);
            Oefening.Exercise.supermanRechts.setTijdOefening(20);
            Oefening.Exercise.kattenrug.setTijdOefening(15);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(15);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(15);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(15);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(15);

        }else if(15 <= day.getDay() && day.getDay() < 22){

            Oefening.Exercise.plank.setHerhalingenOefening(3); //week 4
            Oefening.Exercise.brug.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(3);
            Oefening.Exercise.supermanLinks.setHerhalingenOefening(3);
            Oefening.Exercise.supermanRechts.setHerhalingenOefening(3);
            Oefening.Exercise.stapjes.setHerhalingenOefening(2);
            Oefening.Exercise.beenstrekLinks.setHerhalingenOefening(2);
            Oefening.Exercise.beenstrekRechts.setHerhalingenOefening(2);
            Oefening.Exercise.plankLinksStrek.setHerhalingenOefening(3);
            Oefening.Exercise.plankLinksBeweeg.setHerhalingenOefening(3);
            Oefening.Exercise.plankRechtsStrek.setHerhalingenOefening(3);
            Oefening.Exercise.plankRechtsBeweeg.setHerhalingenOefening(3);

            Oefening.Exercise.kattenrug.setTijdOefening(20);
            Oefening.Exercise.stapjes.setTijdOefening(20);
            Oefening.Exercise.beenstrekLinks.setTijdOefening(20);
            Oefening.Exercise.beenstrekRechts.setTijdOefening(20);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(20);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(20);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(20);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(20);

        }else if(22 <= day.getDay() && day.getDay() < 29){

            Oefening.Exercise.plank.setHerhalingenOefening(2);
            Oefening.Exercise.brug.setHerhalingenOefening(2);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(2);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(2);
            Oefening.Exercise.stapjes.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekLinks.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekRechts.setHerhalingenOefening(3);
            Oefening.Exercise.kattenrug.setHerhalingenOefening(3);
            Oefening.Exercise.plankLinksStrek.setHerhalingenOefening(2);
            Oefening.Exercise.plankLinksBeweeg.setHerhalingenOefening(2);
            Oefening.Exercise.plankRechtsStrek.setHerhalingenOefening(2);
            Oefening.Exercise.plankRechtsBeweeg.setHerhalingenOefening(2);

            Oefening.Exercise.plank.setTijdOefening(25);
            Oefening.Exercise.brug.setTijdOefening(25);
            Oefening.Exercise.plattePlankLinks.setTijdOefening(25);
            Oefening.Exercise.plattePlankRechts.setTijdOefening(25);
            Oefening.Exercise.supermanLinks.setTijdOefening(25);
            Oefening.Exercise.supermanRechts.setTijdOefening(25);
            Oefening.Exercise.kattenrug.setTijdOefening(15);
            Oefening.Exercise.stapjes.setTijdOefening(25);
            Oefening.Exercise.beenstrekLinks.setTijdOefening(25);
            Oefening.Exercise.beenstrekRechts.setTijdOefening(25);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(25);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(25);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(25);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(25);
        }else if(29 <= day.getDay() && day.getDay() < 36){

            Oefening.Exercise.plank.setHerhalingenOefening(3);
            Oefening.Exercise.brug.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(3);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(3);
            Oefening.Exercise.supermanLinks.setHerhalingenOefening(3);
            Oefening.Exercise.supermanRechts.setHerhalingenOefening(3);
            Oefening.Exercise.kattenrug.setHerhalingenOefening(4);
            Oefening.Exercise.stapjes.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekLinks.setHerhalingenOefening(3);
            Oefening.Exercise.beenstrekRechts.setHerhalingenOefening(3);
            Oefening.Exercise.plankLinksStrek.setHerhalingenOefening(3);
            Oefening.Exercise.plankLinksBeweeg.setHerhalingenOefening(3);
            Oefening.Exercise.plankRechtsStrek.setHerhalingenOefening(3);
            Oefening.Exercise.plankRechtsBeweeg.setHerhalingenOefening(3);

            Oefening.Exercise.plank.setTijdOefening(30);
            Oefening.Exercise.brug.setTijdOefening(30);
            Oefening.Exercise.plattePlankLinks.setTijdOefening(30);
            Oefening.Exercise.plattePlankRechts.setTijdOefening(30);
            Oefening.Exercise.supermanLinks.setTijdOefening(30);
            Oefening.Exercise.supermanRechts.setTijdOefening(30);
            Oefening.Exercise.kattenrug.setTijdOefening(15);
            Oefening.Exercise.stapjes.setTijdOefening(20);
            Oefening.Exercise.beenstrekLinks.setTijdOefening(20);
            Oefening.Exercise.beenstrekRechts.setTijdOefening(20);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(30);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(30);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(30);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(30);
        }else if(36 <= day.getDay()) {

            Oefening.Exercise.plank.setHerhalingenOefening(4);
            Oefening.Exercise.brug.setHerhalingenOefening(4);
            Oefening.Exercise.plattePlankLinks.setHerhalingenOefening(4);
            Oefening.Exercise.plattePlankRechts.setHerhalingenOefening(4);
            Oefening.Exercise.supermanLinks.setHerhalingenOefening(4);
            Oefening.Exercise.supermanRechts.setHerhalingenOefening(4);
            Oefening.Exercise.kattenrug.setHerhalingenOefening(3);
            Oefening.Exercise.stapjes.setHerhalingenOefening(4);
            Oefening.Exercise.beenstrekLinks.setHerhalingenOefening(4);
            Oefening.Exercise.beenstrekRechts.setHerhalingenOefening(4);
            Oefening.Exercise.plankLinksStrek.setHerhalingenOefening(4);
            Oefening.Exercise.plankLinksBeweeg.setHerhalingenOefening(4);
            Oefening.Exercise.plankRechtsStrek.setHerhalingenOefening(4);
            Oefening.Exercise.plankRechtsBeweeg.setHerhalingenOefening(4);

            Oefening.Exercise.plank.setTijdOefening(25);
            Oefening.Exercise.brug.setTijdOefening(25);
            Oefening.Exercise.plattePlankLinks.setTijdOefening(25);
            Oefening.Exercise.plattePlankRechts.setTijdOefening(25);
            Oefening.Exercise.supermanLinks.setTijdOefening(25);
            Oefening.Exercise.supermanRechts.setTijdOefening(25);
            Oefening.Exercise.kattenrug.setTijdOefening(20);
            Oefening.Exercise.stapjes.setTijdOefening(18);
            Oefening.Exercise.beenstrekLinks.setTijdOefening(18);
            Oefening.Exercise.beenstrekRechts.setTijdOefening(18);
            Oefening.Exercise.plankLinksStrek.setTijdOefening(25);
            Oefening.Exercise.plankLinksBeweeg.setTijdOefening(25);
            Oefening.Exercise.plankRechtsStrek.setTijdOefening(25);
            Oefening.Exercise.plankRechtsBeweeg.setTijdOefening(35);
        }
    }
}
