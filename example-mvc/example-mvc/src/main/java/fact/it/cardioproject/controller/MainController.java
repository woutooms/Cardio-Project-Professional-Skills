package fact.it.cardioproject.controller;

import fact.it.cardioproject.model.FileData;
import fact.it.cardioproject.model.Oefening;
import fact.it.cardioproject.model.Waarden;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    public final FileData day = new FileData();
    public final Waarden waarden = new Waarden();

    Oefening oefening;

    @RequestMapping("/reeks1")
    public String reeks1(Model model) {

        model.addAttribute("day", day);
        model.addAttribute("plank", Oefening.Exercise.plank);
        model.addAttribute("brug", Oefening.Exercise.brug);
        model.addAttribute("plattePlankLinks", Oefening.Exercise.plattePlankLinks);
        model.addAttribute("plattePlankRechts",Oefening.Exercise.plattePlankRechts);
        model.addAttribute("supermanLinks",Oefening.Exercise.supermanLinks);
        model.addAttribute("supermanRechts",Oefening.Exercise.supermanRechts);
        model.addAttribute("kattenrug",Oefening.Exercise.kattenrug);

        return "reeks1";
    }

    @RequestMapping("/reeks2")
    public String reeks2(Model model) {

        model.addAttribute("day",day);
        model.addAttribute("stapjes",Oefening.Exercise.stapjes);
        model.addAttribute("beenstrekLinks",Oefening.Exercise.beenstrekLinks);
        model.addAttribute("beenstrekRechts",Oefening.Exercise.beenstrekRechts);
        model.addAttribute("plankLinksStrek", Oefening.Exercise.plankLinksStrek);
        model.addAttribute("plankRechtsStrek",Oefening.Exercise.plankRechtsStrek);
        model.addAttribute("plankLinksBeweeg", Oefening.Exercise.plankLinksBeweeg);
        model.addAttribute("plankRechtsBeweeg",Oefening.Exercise.plankRechtsBeweeg);

        return "reeks2";
    }

    @RequestMapping("/done")
    public String done(Model model){


        return "done";
    }

    @RequestMapping("/submitroutine")
    public String submitRoutines(Model model) {

        model.addAttribute("day",day);
        day.countDay();

        return "done";
    }

    @RequestMapping("/nextday")
    public String nextDay(Model model){

        model.addAttribute("day", day);
        model.addAttribute("plank", Oefening.Exercise.plank);
        model.addAttribute("brug", Oefening.Exercise.brug);
        model.addAttribute("plattePlankLinks", Oefening.Exercise.plattePlankLinks);
        model.addAttribute("plattePlankRechts",Oefening.Exercise.plattePlankRechts);
        model.addAttribute("supermanLinks",Oefening.Exercise.supermanLinks);
        model.addAttribute("supermanRechts",Oefening.Exercise.supermanRechts);
        model.addAttribute("kattenrug",Oefening.Exercise.kattenrug);
        model.addAttribute("stapjes",Oefening.Exercise.stapjes);
        model.addAttribute("beenstrekLinks",Oefening.Exercise.beenstrekLinks);
        model.addAttribute("beenstrekRechts",Oefening.Exercise.beenstrekRechts);
        model.addAttribute("plankLinksStrek", Oefening.Exercise.plankLinksStrek);
        model.addAttribute("plankRechtsStrek",Oefening.Exercise.plankRechtsStrek);
        model.addAttribute("plankLinksBeweeg", Oefening.Exercise.plankLinksBeweeg);
        model.addAttribute("plankRechtsBeweeg",Oefening.Exercise.plankRechtsBeweeg);

        waarden.veranderOefening(day);

        if (day.getDay() % 2 == 0){
            return "reeks1";
        } else {
            return "reeks2";
        }
    }

}


