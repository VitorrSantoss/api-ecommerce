package br.com.vitorrsantoss.ecommerce_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioPasswordUpdateDto { // Finalidade: Executar uma ação específica e sensível -> trocar a senha.

  @NotBlank(message = "A senha antiga é obrigatória.")
  private String senhaAntiga;

  @NotBlank(message = "A nova senha é obrigatória.")
  @Size(min = 6, message = "A nova senha deve ter no mínimo 6 caracteres.")
  private String novaSenha;

}