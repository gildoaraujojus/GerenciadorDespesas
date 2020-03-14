package br.com.impacta.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.model.Categoria;
import br.com.impacta.model.Despesa;
import br.com.impacta.model.repository.DespesaRepository;

@Controller
@RequestMapping("/despesas")
public class DespesasController {
	
	@Autowired
	DespesaRepository despRepository;

	@RequestMapping("/nova")
	public ModelAndView nova(){
		ModelAndView mv = new ModelAndView("/despesa/cadastro");
		return mv;
	}

/*	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public String salvar(Despesa despesa){
		despRepository.save(despesa);
		return "/despesa/cadastro";
	}
*/	
	@ModelAttribute("todasCategorias")
	public List<Categoria> todasCategorias(){
		return Arrays.asList(Categoria.values());
	}
	
	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public ModelAndView salvar(Despesa despesa){
		despRepository.save(despesa);
		ModelAndView mv = new ModelAndView("/despesa/cadastro");
		mv.addObject("mensagem", "Despesa salve com sucesso!");
		return mv;
	}
}
	