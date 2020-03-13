package br.com.impacta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.impacta.model.Despesa;
import br.com.impacta.model.repository.DespesaRepository;

@Controller
@RequestMapping("/despesas")
public class DespesasController {
	
	@Autowired
	DespesaRepository despRepository;

	@RequestMapping("/nova")
	public String nova(){
		return "despesas/cadastro";
	}

	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public String salvar(Despesa despesa){
		despRepository.save(despesa);
		return "despesas/cadastro";
	}


}
	