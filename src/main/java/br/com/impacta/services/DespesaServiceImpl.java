package br.com.impacta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.impacta.model.repository.DespesaRepository;
import br.com.impacta.models.Despesa;

@Service
public class DespesaServiceImpl implements DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;

	@Override
	public void salvar(Despesa despesa) {
		despesaRepository.save(despesa);
	}
}
