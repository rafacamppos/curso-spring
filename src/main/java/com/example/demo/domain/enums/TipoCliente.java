package com.example.demo.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa Juridíca");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCod() {
		return cod;
	}
	
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
			
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(cod)) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
