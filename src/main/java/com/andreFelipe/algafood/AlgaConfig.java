package com.andreFelipe.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.andreFelipe.modelo.notificacao.NotificadorEmail;
import com.andreFelipe.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {
	
	@Bean // indica que o método, instancia, configura e inicializa um novo objeto que será gerenciado pelo container spring
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
		
}
