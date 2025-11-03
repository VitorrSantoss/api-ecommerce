package br.com.vitorrsantoss.ecommerce_api.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_categorias")
public class Categorias {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Campo nome é obrigatório")
  @Column(nullable = false, name = "NOME")
  private String nome;

  @Column(name = "DESCRIÇÃO")
  private String descricao;

  @NotNull(message = "Campo criação obrigatório")
  @Column(nullable = false, name = "CRIAÇÃO")
  private LocalDateTime criacao;

  @NotNull(message = "Campo atualização obrigatório")
  @Column(nullable = false, name = "ATUALIZAÇÃO")
  private LocalDateTime atualizacao;

  // ----- RELACIONAMENTOS ----- //
  @OneToMany
  private List<Produtos> produtos;

}
