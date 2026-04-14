package com.itb.inf3cn.wff.model.entity;

import jakarta.persistence.*;
import com.itb.inf3cn.wff.model.enums.TipoUsuario;
import lombok.*;

@Entity
@DiscriminatorValue("ADMIN")
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor //Construtor sem parâmetros (padrão)
@AllArgsConstructor //Construtor com todos parâmetros

public class Admin  {

    @Id //Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment (Identificado de 1 em 1)
    private Long id;

    private String nivelAcesso;
}
