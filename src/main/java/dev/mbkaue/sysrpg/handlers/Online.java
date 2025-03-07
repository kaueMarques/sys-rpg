package dev.mbkaue.sysrpg.handlers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
