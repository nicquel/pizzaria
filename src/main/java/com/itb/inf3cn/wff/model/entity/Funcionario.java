package com.itb.inf3cn.wff.model.entity;

import com.itb.inf3cn.wff.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Setter
@Getter
@DiscriminatorValue("Funcionario")
@NoArgsConstructor //Construtor sem parâmetros (padrão)
@AllArgsConstructor //Construtor com todos parâmetros
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Funcionario {

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
