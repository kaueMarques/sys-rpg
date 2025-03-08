package dev.mbkaue.sysrpg.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StatusDTO {

    private int inteligencia;
    private int carisma;
    private int vida;
    private int forca;
    private int destreza;
    private int constituicao; 
    private int sabedoria;

}
