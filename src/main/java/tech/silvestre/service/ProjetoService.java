package tech.silvestre.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import tech.silvestre.model.Projeto;
import tech.silvestre.model.ProjetoDTO;
import tech.silvestre.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;
	private ModelMapper modelMapper;

	@PostConstruct
	public void init() {
		modelMapper = new ModelMapper();
	}

	public ProjetoDTO criarProjeto(ProjetoDTO projetoDTO) {
		Projeto projeto = new Projeto();
		projeto.setNome(projetoDTO.getNome());
		projeto.setDescricao(projetoDTO.getDescricao());
		projeto.setTecnologiasUtilizadas(projetoDTO.getTecnologiasUtilizadas());

		projeto = projetoRepository.save(projeto);

		return modelMapper.map(projeto, ProjetoDTO.class);
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