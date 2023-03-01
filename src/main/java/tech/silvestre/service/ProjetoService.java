package tech.silvestre.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.silvestre.model.Projeto;
import tech.silvestre.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;

	public Projeto criarProjeto(Projeto projeto) {
		return projetoRepository.save(projeto);
	}

	public List<Projeto> buscarProjetos() {
		return projetoRepository.findAll();
	}

	public Optional<Projeto> buscarProjetoPorId(Long id) {
		return projetoRepository.findById(id);
	}

	public void excluirProjeto(Long id) {
		projetoRepository.deleteById(id);
	}

	public void atualizarProjeto(Projeto projeto) {
		projetoRepository.save(projeto);
	}
}