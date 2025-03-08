package dev.mbkaue.sysrpg.dto.inventario;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import dev.mbkaue.sysrpg.dto.player.PlayerCharDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MochilaDTO {

    private PlayerCharDTO player;
    private List<ItemDoPlayerDTO> itens;

}
