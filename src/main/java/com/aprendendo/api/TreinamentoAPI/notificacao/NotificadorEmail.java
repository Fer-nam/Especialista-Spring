package com.aprendendo.api.TreinamentoAPI.notificacao;

import com.aprendendo.api.TreinamentoAPI.modelo.Cliente;
import org.springframework.stereotype.Component;


public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;

    private String hostServidroSmtp;

    public NotificadorEmail(String hostServidroSmtp){
        this.hostServidroSmtp = hostServidroSmtp;
        System.out.println("Construtor chamado");
    }
    @Override
    public void notificar(Cliente cliente, String mensagem){
      if(this.caixaAlta){
          mensagem = mensagem.toUpperCase();
      }

       System.out.println("notificando o cliente: "+cliente.getNome()
                +" No Email "+ cliente.getEmail()+" no servidor SMTP "
               +this.hostServidroSmtp+" "+mensagem);
    }

    public boolean isCaixaAlta() {
        return caixaAlta;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
