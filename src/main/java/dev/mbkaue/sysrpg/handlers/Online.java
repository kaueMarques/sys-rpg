package dev.mbkaue.sysrpg.handlers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping("/")
public class Online {
    
    @GetMapping
    public String home() {
        return "<h1>Fingi, so fingi que e uma tela bonita</h1>";
    }

    @GetMapping("/ping")
    public String hello() {
        return "pong!";
    }

    @GetMapping("/player")
    public String characterSheet(Model model) {
        model.addAttribute("characterName", "Aldren, o Bravo");
        model.addAttribute("characterClass", "Guerreiro");
        model.addAttribute("characterLevel", 5);
        model.addAttribute("strength", 18);
        model.addAttribute("dexterity", 14);
        model.addAttribute("constitution", 16);
        model.addAttribute("intelligence", 10);
        model.addAttribute("wisdom", 12);
        model.addAttribute("charisma", 13);

        return "player.html"; 
    }

}
