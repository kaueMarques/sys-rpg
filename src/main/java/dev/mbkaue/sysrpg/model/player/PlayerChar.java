package dev.mbkaue.sysrpg.model.player;

import dev.mbkaue.sysrpg.model.Classe;
import dev.mbkaue.sysrpg.model.Status;
import dev.mbkaue.sysrpg.model.inventario.Mochila;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerChar {

    private String historiaPersonagem;

    private User user;
    private Classe classe;
    private Mochila mochila;
    private Status status;

}
