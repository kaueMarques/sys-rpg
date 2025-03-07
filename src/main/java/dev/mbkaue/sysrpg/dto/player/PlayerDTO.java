package dev.mbkaue.sysrpg.dto.player;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerDTO {
    
    private UUID idJogador;
    private String nomeJogador;    

}
