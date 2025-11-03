package br.com.vitorrsantoss.ecommerce_api.models;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter's and Setter's
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_usuarios")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Campo email é obrigatório") // validação há nível de requisição: registro não pode ser nulo
  @Email //
  @Column(nullable = false, name = "EMAIL", unique = true) // configuração da coluna no banco de dados
  private String email;

  @NotBlank(message = "Campo senha é obrigatório")
  @Size(min = 6, max = 12, message = "Senha deve ter entre 6 e 12 caracteres") // validação do tamanho/comprimento de
                                                                               // uma String
  @JsonIgnore // validação para nunca expor a senha nas resposta da API
  @Column(nullable = false)
  private String senha;

  @NotNull(message = "Campo status é obrigatório")
  @Column(nullable = false, name = "STATUS")
  private Boolean ativo;

  @NotBlank(message = "Campo cpf é obrigatório")
  @CPF(message = "CPF inválido") // validação se uma String contém um CPF segundo as regras brasileiras
  @Column(nullable = false, name = "CPF", unique = true)
  private String cpf;

  @NotBlank(message = "Campo nome_completo é obrigatório")
  @Column(nullable = false, name = "NOME_COMPLETO")
  private String nomeCompleto;

  @NotNull(message = "Campo data_nascimento é obrigatório")
  @Past(message = "Data de Nascimento deve está no passado") // validação de data/hora que está no passado
  @Column(nullable = false, name = "DATA_NASCIMENTO")
  private LocalDate dataNascimento;

  @NotBlank(message = "Campo telefone é obrigatório")
  @Column(nullable = false, name = "TELEFONE", unique = true)
  private String telefone;

  // ----- O 'role' representando o papel do usuário no sistema. ----- //
  @Enumerated(EnumType.STRING) // Banco de dados irá salvar o NOME da role ("ROLE_ADMIN") em vez de um número
                               // (0, 1).
  private Role role;

  // ----- Relacionamento: "um para muitos" ----- //
  @OneToMany
  private List<Endereco> enderecos;

  @OneToOne
  private Carrinho carrinho;

  @OneToMany
  private List<Pedidos> pedidos;

}