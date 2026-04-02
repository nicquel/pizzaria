package com.itb.inf3cn.wff.model.entity;

import jakarta.persistence.*;
import com.itb.inf3cn.wff.model.enums.TipoUsuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("ADMIN")
@Setter
@Getter
@EqualsAndHashCode

public class Admin  {

    @Id //Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment (Identificado de 1 em 1)
    private Long id;

    private String nivelAcesso;
}
