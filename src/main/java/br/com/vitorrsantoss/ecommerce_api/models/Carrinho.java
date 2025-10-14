package br.com.vitorrsantoss.ecommerce_api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull(message = "Campo criação é obrigatório")
  @Column(nullable = false, name = "CRIAÇÃO")
  private LocalDateTime criacao;
  
  @NotNull(message = "Campo atualização é obrigatório")
  @Column(nullable = false, name = "ATUALIZAÇÃO")
  private LocalDateTime atualizacao;

  // ----- RELACIONAMENOS ----- //
  @OneToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuarioId;

}
