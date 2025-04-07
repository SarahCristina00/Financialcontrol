package com.Financialcontrol.Financialcontrol.model;


import com.Financialcontrol.Financialcontrol.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTransacao extends JpaRepository<Transacao, Long> {
}

