package dev.mbkaue.sysrpg.handlers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import dev.mbkaue.sysrpg.dto.player.PlayerCharDTO;
import dev.mbkaue.sysrpg.dto.player.UserDTO;
import dev.mbkaue.sysrpg.dto.ClasseDTO;
import dev.mbkaue.sysrpg.dto.StatusDTO;
import dev.mbkaue.sysrpg.dto.inventario.MochilaDTO;
import dev.mbkaue.sysrpg.dto.inventario.ItemDoPlayerDTO;
import dev.mbkaue.sysrpg.dto.ItemDTO;

import java.util.ArrayList;
import java.util.List;

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
        PlayerCharDTO playerChar = new PlayerCharDTO();
        playerChar.setHistoriaPersonagem("Uma história fascinante");
        
        UserDTO user = new UserDTO();
        user.setNomeJogador("Kaue Marques");
        playerChar.setUser(user);
        
        ClasseDTO classe = new ClasseDTO();
        classe.setNomeClasse("Arquiteto");
        classe.setVidaInicial(100);
        playerChar.setClasse(classe);
        
        MochilaDTO mochila = new MochilaDTO();
        List<ItemDoPlayerDTO> itens = new ArrayList<>();
        
        ItemDTO item1 = new ItemDTO();
        item1.setNomeItem("Espada");
        item1.setDescricao("Uma espada afiada");
        ItemDoPlayerDTO itemDoPlayer1 = new ItemDoPlayerDTO();
        itemDoPlayer1.setItem(item1);
        itemDoPlayer1.setQntItens(1);
        itens.add(itemDoPlayer1);
        
        ItemDTO item2 = new ItemDTO();
        item2.setNomeItem("Escudo");
        item2.setDescricao("Um escudo resistente");
        ItemDoPlayerDTO itemDoPlayer2 = new ItemDoPlayerDTO();
        itemDoPlayer2.setItem(item2);
        itemDoPlayer2.setQntItens(1);
        itens.add(itemDoPlayer2);
        
        mochila.setItens(itens);
        playerChar.setMochila(mochila);
        
        StatusDTO status = new StatusDTO();
        status.setForca(18);
        status.setDestreza(14);
        status.setConstituicao(16);
        status.setInteligencia(10);
        status.setSabedoria(12);
        status.setCarisma(13);
        playerChar.setStatus(status);

        model.addAttribute("playerChar", playerChar);

        return "player";
    }
}