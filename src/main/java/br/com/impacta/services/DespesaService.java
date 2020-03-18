package br.com.impacta.services;
import java.util.List;

import br.com.impacta.models.Despesa;

public interface DespesaService {
	public void salvar(Despesa despesa);
	public List<Despesa> listardespesas();
	public void removerDespesa(Long codigo);

}
