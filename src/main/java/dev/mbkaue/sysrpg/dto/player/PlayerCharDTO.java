package dev.mbkaue.sysrpg.dto.player;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import dev.mbkaue.sysrpg.dto.ClasseDTO;
import dev.mbkaue.sysrpg.dto.StatusDTO;
import dev.mbkaue.sysrpg.dto.inventario.MochilaDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PlayerCharDTO {

    private String historiaPersonagem;
    private UserDTO user;
    private ClasseDTO classe;
    private MochilaDTO mochila;
    private StatusDTO status;
}
