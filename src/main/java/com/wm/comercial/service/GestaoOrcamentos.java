package com.wm.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.wm.comercial.model.Orcamento;
import com.wm.comercial.repository.OrcamentosRepository;
import com.wm.comercial.util.Transacional;

public class GestaoOrcamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private OrcamentosRepository orcamentos;
	
	@Transacional
	public void salvar(Orcamento orcamento) {
		orcamentos.guardar(orcamento);
	}
	
}