package com.andreFelipe.modelo.notificacao;

import com.andreFelipe.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}