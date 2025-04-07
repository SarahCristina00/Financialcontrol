package com.Financialcontrol.Financialcontrol.model;

import com.Financialcontrol.Financialcontrol.model.Transacao;
import com.Financialcontrol.Financialcontrol.model.RepositorioTransacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
class ServiceTransacao {

     @Autowired
     private RepositorioTransacao repositorioTransacao;

     public List<Transacao>listar(){
        return repositorioTransacao.findAll();
     }
     public Transacao salvar (Transacao transacao){
        return repositorioTransacao.save(transacao);
     }
}