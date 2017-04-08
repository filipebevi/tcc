/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.cidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Flipe
 */
@Entity
public class Cidade implements Serializable{
    @Id
    @GeneratedValue
    private Integer idCidade;
    private String nome;
    private String uf;
    private String ibge;
    private Integer populacao;
    private double area;
    private double pib;
    private boolean metropole;
    private String comentario;
    private String governador;

    public Cidade() {
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public boolean isMetropole() {
        return metropole;
    }

    public void setMetropole(boolean metropole) {
        this.metropole = metropole;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getGovernador() {
        return governador;
    }

    public void setGovernador(String governador) {
        this.governador = governador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.idCidade);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.uf);
        hash = 17 * hash + Objects.hashCode(this.ibge);
        hash = 17 * hash + Objects.hashCode(this.populacao);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.pib) ^ (Double.doubleToLongBits(this.pib) >>> 32));
        hash = 17 * hash + (this.metropole ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.comentario);
        hash = 17 * hash + Objects.hashCode(this.governador);
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
        final Cidade other = (Cidade) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pib) != Double.doubleToLongBits(other.pib)) {
            return false;
        }
        if (this.metropole != other.metropole) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.ibge, other.ibge)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.governador, other.governador)) {
            return false;
        }
        if (!Objects.equals(this.idCidade, other.idCidade)) {
            return false;
        }
        if (!Objects.equals(this.populacao, other.populacao)) {
            return false;
        }
        return true;
    }
    
    
    
}
