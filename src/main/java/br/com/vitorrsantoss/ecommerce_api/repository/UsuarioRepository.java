package br.com.vitorrsantoss.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitorrsantoss.ecommerce_api.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
  
}
