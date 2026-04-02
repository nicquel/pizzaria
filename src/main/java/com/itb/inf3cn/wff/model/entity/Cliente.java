package com.itb.inf3cn.wff.model.entity;

import jakarta.persistence.*;
import com.itb.inf3cn.wff.model.enums.TipoUsuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@Setter
@Getter
@DiscriminatorValue("CLIENTE")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Cliente {

    @Id //Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment (Identificado de 1 em 1)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String sexo;
    private String senha;
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private boolean codStatus;
}
