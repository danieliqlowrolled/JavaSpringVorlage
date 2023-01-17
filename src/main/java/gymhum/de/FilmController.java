package gymhum.de;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gymhum.de.model.Film;


@Controller
public class FilmController {
    ArrayList<Film> filme;

    public FilmController(){
        setFilme(new ArrayList<>());
        getFilme().add(new Film("New Kids Nitro", "1h 45min", 16));
        getFilme().add(new Film("Oppenheimer", "2h 30min", 16));
    }

    @GetMapping("/filme")
    public String showFilme(@RequestParam(name = "activePage" , required = false, defaultValue = "filme") String activePage, Model model){
        model.addAttribute("activePage", "filme");
        model.addAttribute("filme", getFilme());
        return "index.html";
    }

    public void setFilme(ArrayList<Film> filme) {
        this.filme = filme;
    }
    public ArrayList<Film> getFilme() {
        return filme;
    }

    
}
