package br.com.vitorrsantoss.ecommerce_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest { // Finalidade: Receber os dados para criar um novo usuário.

  // Request: Representa os dados enviados para uma API

  @NotBlank(message = "O nome é obrigatório.")
  private String nome;

  @NotBlank(message = "O email é obrigatório.")
  @Email(message = "Formato do email incorreto.")
  private String email;

  @NotBlank(message = "A senha é obrigatória.")
  @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
  private String senha;
}
