package com.example.demo.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"), 
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCod() {
		return cod;
	}
	
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
			
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(cod)) {
				return x;
			}
		}
		throw new IllegalArgumentException("Cód. pagamento inválido: " + cod);
	}
}

