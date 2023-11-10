package com.aprendendo.api.TreinamentoAPI.service;

import com.aprendendo.api.TreinamentoAPI.modelo.Cliente;
import com.aprendendo.api.TreinamentoAPI.notificacao.Notificador;
import com.aprendendo.api.TreinamentoAPI.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;

        System.out.println("Ativação cliente service: "+ notificador);
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }
}
