package dev.mbkaue.sysrpg.model.player;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    
    private UUID idUser;
    private String nomeJogador;
    private List<PlayerChar> personagens;

}
