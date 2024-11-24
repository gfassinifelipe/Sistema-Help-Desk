package com.giovanni.helpdesk.doamin.enums;

public enum Prioridade {
	
	BAIXA (0, "BAIXA"), MÉDIA (1, "MÉDIA"), ALTA (2, "ALTA");
	
	private Integer codigo;
	private String descricao;
	
	Prioridade(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@SuppressWarnings("unused")
	public static Prioridade toEnum(Integer codigo) {
		if(codigo == null) {
			if(codigo == null) {
				return null;
			}
			
			for (Prioridade p : Prioridade.values()) {
				if(codigo.equals(p.getCodigo())) {
					return p;
				}
			}
		}
		
		throw new IllegalArgumentException("Prioridade Inválida!");
	}
}
