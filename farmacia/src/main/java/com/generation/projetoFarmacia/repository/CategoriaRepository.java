package com.generation.projetoFarmacia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.projetoFarmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	  // Método para buscar todas as categorias
    List<Categoria> findAll();

    // Método para buscar uma categoria pelo ID
    Optional<Categoria> findById(Long id);

    // Método para salvar uma categoria
    <S extends Categoria> S save(S entity);

    // Método para excluir uma categoria pelo ID
    void deleteById(Long id);
}





