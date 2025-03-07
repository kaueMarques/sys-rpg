package dev.mbkaue.sysrpg.dto.inventario;
import dev.mbkaue.sysrpg.dto.ItemDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemDoPlayerDTO {

    private int qntItens;
    private ItemDTO item;

}
