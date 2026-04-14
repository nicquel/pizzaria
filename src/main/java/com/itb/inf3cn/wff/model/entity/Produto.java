package com.itb.inf3cn.wff.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Produto")

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor //Construtor sem parâmetros (padrão)
@AllArgsConstructor //Construtor com todos parâmetros

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(length = 10, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private String tipo;
    @Column(length = 10, nullable = false)
    private String descricao;
    @Column(length = 10, nullable = false)
    private BigDecimal valorCompra;
    @Column(length = 10, nullable = false)
    private BigDecimal valorVenda;
    @Column(length = 10, nullable = false)
    private int quantidadeEstoque;
    @Column(nullable = false)
    private boolean codStatus;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = false)
    private Categoria categoriaId;




}
