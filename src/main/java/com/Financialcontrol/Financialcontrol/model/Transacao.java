package com.Financialcontrol.Financialcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
    private String descricao;
    private LocalDate data;
    private BigDecimal valor;



    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String Descricao){
        this.descricao = descricao;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public BigDecimal getValor(){
        return valor;
    }
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
}
