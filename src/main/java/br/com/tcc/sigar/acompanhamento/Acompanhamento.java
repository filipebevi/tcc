/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.acompanhamento;

import br.com.tcc.sigar.participante.Participante;

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
public class Acompanhamento implements Serializable {
    @Id
    @GeneratedValue
    private Integer idAcompanhamento;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Calendar dt;
    @ManyToOne
    private Participante idParticipante;

    public Acompanhamento() {

        this.dt = Calendar.getInstance();
    }

    public Integer getIdAcompanhamento() {
        return idAcompanhamento;
    }

    public void setIdAcompanhamento(Integer idAcompanhamento) {
        this.idAcompanhamento = idAcompanhamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDt() {
        return dt;
    }

    public void setDt(Calendar dt) {
        this.dt = dt;
    }

    public Participante getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Participante idParticipante) {
        this.idParticipante = idParticipante;
    }

    @Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdAcompanhamento());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.idAcompanhamento);
        hash = 73 * hash + Objects.hashCode(this.descricao);
        hash = 73 * hash + Objects.hashCode(this.dt);
        hash = 73 * hash + Objects.hashCode(this.idParticipante);
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
        final Acompanhamento other = (Acompanhamento) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.idAcompanhamento, other.idAcompanhamento)) {
            return false;
        }
        if (!Objects.equals(this.dt, other.dt)) {
            return false;
        }
        if (!Objects.equals(this.idParticipante, other.idParticipante)) {
            return false;
        }
        return true;
    }
    
    

}
