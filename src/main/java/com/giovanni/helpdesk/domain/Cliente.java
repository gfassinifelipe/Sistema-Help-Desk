package com.giovanni.helpdesk.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.giovanni.helpdesk.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


@Entity
public class Cliente extends Pessoa{

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();
	
	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis,
			LocalDate dataCriacao) {
		super(id, nome, cpf, email, senha, perfis, dataCriacao);
		addPerfil(Perfil.CLIENTE);
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

}
