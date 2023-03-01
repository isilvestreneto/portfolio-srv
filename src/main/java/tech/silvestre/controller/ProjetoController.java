package tech.silvestre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.silvestre.model.Projeto;
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

}
