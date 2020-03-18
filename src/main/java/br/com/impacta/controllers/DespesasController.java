package br.com.impacta.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.models.Categoria;
import br.com.impacta.models.Despesa;
import br.com.impacta.services.DespesaService;

@Controller
@RequestMapping("/despesas")
public class DespesasController {
	
	private static final String VIEW_CADASTRO = "/despesa/cadastro";
	private static final String VIEW_LISTAGEM = "/despesa/listagem";
	
	@Autowired
	DespesaService despService;

	@RequestMapping("/nova")
	public ModelAndView nova(ModelAndView mv){
		mv.setViewName(VIEW_CADASTRO);
		return mv;
	}

/*	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public String salvar(Despesa despesa){
		despRepository.save(despesa);
		return "/despesa/cadastro";
	}
*/	
	@ModelAttribute("categorias")
	public List<Categoria> getCategorias(){
		return Arrays.asList(Categoria.values());
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Despesa despesa, ModelAndView mv){
		despService.salvar(despesa);
		mv.setViewName(VIEW_CADASTRO);
		mv.addObject("mensagem", "Despesa salva com sucesso!");
		return mv;
	}
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listagem(Despesa despesa, ModelAndView mv){
		mv.setViewName(VIEW_LISTAGEM);
		mv.addObject("listaDespesas", despService.listardespesas());
		return mv;
	}

	@RequestMapping(value="{codigo}", method=RequestMethod.DELETE)
	public String remover(@PathVariable Long codigo){
		despService.removerDespesa(codigo);
		return "/despesa";
		
		
		
		
		
	}
	
	
}
	