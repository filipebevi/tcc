/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.empresa;

import br.com.tcc.sigar.cidade.Cidade;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Flipe
 */
@Entity
public class Empresa implements Serializable {
    @GeneratedValue
    @Id
    private Integer idempresa;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
    @ManyToOne
    private Cidade idCidade;
    @Temporal(TemporalType.DATE)
    private Calendar dtFundacao;
    private Integer qtdFunc;
    private double faturamento;

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }

    public Calendar getDtFundacao() {
        return dtFundacao;
    }

    public void setDtFundacao(Calendar dtFundacao) {
        this.dtFundacao = dtFundacao;
    }

    public Integer getQtdFunc() {
        return qtdFunc;
    }

    public void setQtdFunc(Integer qtdFunc) {
        this.qtdFunc = qtdFunc;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.idempresa);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.cnpj);
        hash = 17 * hash + Objects.hashCode(this.endereco);
        hash = 17 * hash + Objects.hashCode(this.telefone);
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.idCidade);
        hash = 17 * hash + Objects.hashCode(this.dtFundacao);
        hash = 17 * hash + Objects.hashCode(this.qtdFunc);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.faturamento) ^ (Double.doubleToLongBits(this.faturamento) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (Double.doubleToLongBits(this.faturamento) != Double.doubleToLongBits(other.faturamento)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.idempresa, other.idempresa)) {
            return false;
        }
        if (!Objects.equals(this.idCidade, other.idCidade)) {
            return false;
        }
        if (!Objects.equals(this.dtFundacao, other.dtFundacao)) {
            return false;
        }
        if (!Objects.equals(this.qtdFunc, other.qtdFunc)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
