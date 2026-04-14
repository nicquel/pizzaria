package com.itb.inf3cn.wff.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Categoria")

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor //Construtor sem parâmetros (padrão)
@AllArgsConstructor //Construtor com todos parâmetros
@Builder //Forma otimizada para criação de objetos
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 500, nullable = false)
    private String descricao;
    @Column(nullable = false)
    private boolean codStatus;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
    private Cliente cliente;




}
