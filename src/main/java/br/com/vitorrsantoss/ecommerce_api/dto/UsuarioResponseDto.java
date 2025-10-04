package br.com.vitorrsantoss.ecommerce_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDto { // Finalidade: retornar os dados de um usuário para o cliente após uma operação (criação, busca, atualização).

  // Response: Representa os dados que uma API devolve para o cliente

  private Long id;

  private String nome;

  @NotBlank(message = "O email é obrigatório.")
  @Email(message = "Formato do email incorreto.")
  private String email;

  private String role; 
}
