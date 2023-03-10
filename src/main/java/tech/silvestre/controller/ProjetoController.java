package tech.silvestre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.silvestre.model.Projeto;
import tech.silvestre.model.ProjetoDTO;
import tech.silvestre.service.ProjetoService;

@RestController
@RequestMapping
public class ProjetoController {

	@Autowired
	ProjetoService projetoService;

	@GetMapping("/projetos")
	public List<Projeto> listarProjetos() {
		return projetoService.buscarProjetos();
	}

	@PostMapping("/projetos")
	public ResponseEntity<ProjetoDTO> criarProjeto(@Valid @RequestBody ProjetoDTO projetoDTO) {
		ProjetoDTO projetoCriadoDTO = projetoService.criarProjeto(projetoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(projetoCriadoDTO);
	}

}
