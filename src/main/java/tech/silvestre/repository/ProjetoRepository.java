package tech.silvestre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.silvestre.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    List<Projeto> findByNomeContaining(String nome);

}