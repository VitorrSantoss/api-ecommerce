package br.com.vitorrsantoss.ecommerce_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_endereco")
public class Endereco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  // ----- Dados que será preenchido pelo ViaCEP e confirmados pelo Usuário ----- //

  @NotBlank(message = "Campo CEP é obrigatório")
  @Column(nullable = false, name = "CEP")
  private String cep;

  @NotBlank(message = "Campo UF é obrigatório")
  @Column(nullable = false, name = "UF")
  private String uf;

  @NotBlank(message = "Campo cidade é obrigatório")
  @Column(nullable = false, name = "CIDADE")
  private String cidade;

  @NotBlank(message = "Campo bairro é obrigatório")
  @Column(nullable = false, name = "BAIRRO")
  private String bairro;

  @NotBlank(message = "Campo logradouro é obrigatório")
  @Column(nullable = false, name = "LOGRADOURO")
  private String logradouro;

  // ----- Dados preenchidos APENAS pelo Usuário ----- //

  @Column(nullable = false, name = "COMPLEMENTO")
  private String complemento;

  @Size(max = 10)
  @Column(nullable = false, name = "NUMERO")
  private int numero;

  @Column(nullable = false, name = "DESTINATÁRIO", length = 100)
  private String destinatario;

  @Column(nullable = false, name = "APELIDO", length = 50)
  private String apelido;

  // ----- Relacionamento: "muitos para um" ----- //

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuario;


}