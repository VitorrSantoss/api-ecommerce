package br.com.vitorrsantoss.ecommerce_api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItensCarrinho {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "Campo quantidade é obrigatório")
  @Column(nullable = false, name = "QUANTIDADE")
  private int quantidade;

  @NotNull(message = "Campo criação é obrigatório")
  @Column(nullable = false, name = "")
  private LocalDateTime criacao;

  @NotNull(message = "Campo atualização é obrigatório")
  private LocalDateTime atualizacao;
  
  // ----- RELACIONAMENTOS ----- //

  @ManyToOne
  @JoinColumn(name = "carrinho_id")
  private Carrinho carrinhoId;

  @ManyToOne
  @JoinColumn(name = "produtos_id")
  private Produtos produtosId;
  
}
