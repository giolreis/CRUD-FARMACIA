package com.generation.projetoFarmacia.repository;

import com.generation.projetoFarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Método para buscar todos os produtos
    List<Produto> findAll();

    // Método para buscar um produto pelo ID
    Optional<Produto> findById(Long id);

    // Método para salvar um produto
    <S extends Produto> S save(S entity);

    // Método para excluir um produto pelo ID
    void deleteById(Long id);
}
