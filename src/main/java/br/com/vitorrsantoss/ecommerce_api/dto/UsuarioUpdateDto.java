package br.com.vitorrsantoss.ecommerce_api.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioUpdateDto { // Finalidade: Receber dados para atualizar um usuário existente.

  private String nome;
  @Email
  private String email;
  private String telefone;
  private String endereco;
  private String cep;
  private String complemento;
}
