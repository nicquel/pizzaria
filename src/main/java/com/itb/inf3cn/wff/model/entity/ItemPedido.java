package com.itb.inf3cn.wff.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ItemPedido")

@Setter
@Getter
@NoArgsConstructor //Construtor sem parâmetros (padrão)
@AllArgsConstructor //Construtor com todos parâmetros
@Builder //Forma otimizada para criação de objetos
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(length = 10, nullable = false)
    private int quantidadeItem;

    @Column(nullable = false)
    private boolean codStatus;

    @Column(length = 10, nullable = false)
    private BigDecimal valorUnitario;

    // Relacionamento "Associação"
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = false)
    private Produto produtoId;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = false)
    private Pedido pedidoId;



}
