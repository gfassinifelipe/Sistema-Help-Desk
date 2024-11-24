package com.giovanni.helpdesk.doamin.enums;

public enum Perfil {
	
	ADMIN (0, "ROLE_ADMIN"), CLIENTE (1, "ROLE_CLIENTE"), TECNICO (2, "ROLE_TECNICO");
	
	private Integer codigo;
	private String descricao;
	
	Perfil(int codigo, String descricao) {
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
	public static Perfil toEnum(Integer codigo) {
		if(codigo == null) {
			if(codigo == null) {
				return null;
			}
			
			for (Perfil p : Perfil.values()) {
				if(codigo.equals(p.getCodigo())) {
					return p;
				}
			}
		}
		
		throw new IllegalArgumentException("Perfil Inválido!");
	}
}
