package br.com.vitorrsantoss.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitorrsantoss.ecommerce_api.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Long> {
  
}
