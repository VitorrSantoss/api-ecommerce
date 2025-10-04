package br.com.vitorrsantoss.ecommerce_api.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto { // Data Transfer Object
  
  private Long id;
  private String email;
  private Boolean ativo;
  private String cpf;
  private String nomeCompleto;
  private LocalDate dataNascimento;
  private String telefone;
}
