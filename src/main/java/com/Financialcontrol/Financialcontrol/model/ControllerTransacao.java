package com.Financialcontrol.Financialcontrol.model;

import com.Financialcontrol.Financialcontrol.model.Transacao;
import com.Financialcontrol.Financialcontrol.model.ServiceTransacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class ControllerTransacao {

    @Autowired
    private ServiceTransacao transacaoService;

    @GetMapping
    public List<Transacao> listar() {
        return transacaoService.listar();
    }

    @PostMapping
    public Transacao adicionar(@RequestBody Transacao transacao) {
        return transacaoService.salvar(transacao);
    }
}