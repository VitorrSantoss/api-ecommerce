package br.com.vitorrsantoss.ecommerce_api.models;

import java.time.LocalDateTime;

import br.com.vitorrsantoss.ecommerce_api.constants.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_pedidos")
public class Pedidos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "Campo valor_total é obrigatório")
  @Column(nullable = false, name = "VALOR_TOTAL")
  private double valorTotal;
  
  @NotNull(message = "Campo status é obrigatório")
  @Column(nullable = false, name = "STATUS")
  private StatusPedido status;

  @NotNull(message = "Campo data_pedido é obrigatório")
  @PastOrPresent(message = "Data do pedido deve está no presente ou no passado")
  @Column(nullable = false, name = "DATA_PEDIDO")
  private LocalDateTime dataPedido;

  @NotNull(message = "Campo data_criação é obrigatório")
  @PastOrPresent(message = "Data de criação deve está no presente ou no passado")
  @Column(nullable = false, name = "DATA_CRIAÇÃO")
  private LocalDateTime dataCriacao;

  @NotNull(message = "Campo data_atualização é obrigatório")
  @PastOrPresent(message = "Data de atualização deve está no presente ou no passado")
  @Column(nullable = false, name = "DATA_ATUALIZAÇÃO")
  private LocalDateTime dataAtualizacao;

  // ----- Relacionamentos ----- //
  @ManyToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuarioId;

  @ManyToOne
  @JoinColumn(name = "endereço_id")
  private Endereco enderecoId;

  @OneToMany
  private ItensPedido itensPedido;
  
}
