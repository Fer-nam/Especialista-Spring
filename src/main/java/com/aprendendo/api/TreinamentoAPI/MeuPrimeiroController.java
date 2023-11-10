package com.aprendendo.api.TreinamentoAPI;

import com.aprendendo.api.TreinamentoAPI.modelo.Cliente;
import com.aprendendo.api.TreinamentoAPI.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService){

        System.out.println("MeuPrimeiroController " + ativacaoClienteService);
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String digaOi(){
        Cliente joao = new Cliente("João", "joao@xyz.com", "34445662");

        ativacaoClienteService.ativar(joao);

        return "Hello!";
    }
}
