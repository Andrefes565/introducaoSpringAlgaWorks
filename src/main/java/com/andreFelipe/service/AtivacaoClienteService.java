package com.andreFelipe.service;

import com.andreFelipe.modelo.Cliente;
import com.andreFelipe.modelo.notificacao.Notificador;


public class AtivacaoClienteService {
	
	
	private Notificador notificador;
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService:" + notificador);
	}
	
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "seu cadastro no sistema está ativo");;
	}
}
