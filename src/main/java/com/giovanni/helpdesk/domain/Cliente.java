package com.giovanni.helpdesk.domain;

import java.time.LocalDate;
import java.util.Set;

import com.giovanni.helpdesk.domain.enums.Perfil;

public class Cliente extends Pessoa{

	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis,
			LocalDate dataCriacao) {
		super(id, nome, cpf, email, senha, perfis, dataCriacao);
		addPerfil(Perfil.CLIENTE);
	}
	
	

}
