package dev.mbkaue.sysrpg.dto.inventario;

import java.util.List;

import dev.mbkaue.sysrpg.dto.player.PlayerCharDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MochilaDTO {

    private PlayerCharDTO player;
    private List<ItemDoPlayerDTO> itens;

}
