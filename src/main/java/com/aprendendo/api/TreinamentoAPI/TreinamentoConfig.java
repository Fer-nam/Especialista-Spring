package com.aprendendo.api.TreinamentoAPI;

import com.aprendendo.api.TreinamentoAPI.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreinamentoConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp;algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
