package com.Financialcontrol.Financialcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class transacao {
    private String descricao;
    private LocalDate data;
    private BigDecimal valor;



    public String getDescricao(){
        return descricao;
    }
    public LocalDate getData(){
        return data;
    }
    public BigDecimal getValor(){
        return valor;
    }
}
