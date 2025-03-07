package dev.mbkaue.sysrpg.dto.player;

import dev.mbkaue.sysrpg.dto.ClasseDTO;
import dev.mbkaue.sysrpg.dto.inventario.MochilaDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerCharDTO {

    private String historiaPersonagem;

    private PlayerDTO player;
    private ClasseDTO classe;
    private MochilaDTO mochila;

}
