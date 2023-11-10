package com.aprendendo.api.TreinamentoAPI.notificacao;

import com.aprendendo.api.TreinamentoAPI.modelo.Cliente;

public interface Notificador {

    public void notificar(Cliente cliente, String mensagem);
}
