/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.reuniao;

import br.com.tcc.sigar.participante.Participante;
import br.com.tcc.sigar.tarefa.Tarefa;
import br.com.tcc.sigar.topico.Topico;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Flipe
 */
@Entity
public class Reuniao implements Serializable {

    @Id
    @GeneratedValue
    private Integer idReuniao;
    private String assunto;
    @Temporal(TemporalType.DATE)
    private Calendar dt;
    private String observacao;
    @ManyToMany
    private List<Participante> idParticipantes;
    @OneToMany
    private List<Tarefa> idTarefa;
    @OneToMany
    private List<Topico> idTopico;

    public Reuniao() {
        this.dt = Calendar.getInstance();
    }

    public Integer getIdReuniao() {
        return idReuniao;
    }

    public void setIdReuniao(Integer idReuniao) {
        this.idReuniao = idReuniao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Calendar getDt() {
        return dt;
    }

    public void setDt(Calendar dt) {
        this.dt = dt;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Participante> getIdParticipantes() {
        return idParticipantes;
    }

    public void setIdParticipantes(List<Participante> idParticipantes) {
        this.idParticipantes = idParticipantes;
    }

    public List<Tarefa> getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(List<Tarefa> idTarefa) {
        this.idTarefa = idTarefa;
    }

    public List<Topico> getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(List<Topico> idTopico) {
        this.idTopico = idTopico;
    }

    @Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdReuniao());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idReuniao);
        hash = 59 * hash + Objects.hashCode(this.assunto);
        hash = 59 * hash + Objects.hashCode(this.dt);
        hash = 59 * hash + Objects.hashCode(this.observacao);
        hash = 59 * hash + Objects.hashCode(this.idParticipantes);
        hash = 59 * hash + Objects.hashCode(this.idTarefa);
        hash = 59 * hash + Objects.hashCode(this.idTopico);
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
        final Reuniao other = (Reuniao) obj;
        if (!Objects.equals(this.assunto, other.assunto)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.idReuniao, other.idReuniao)) {
            return false;
        }
        if (!Objects.equals(this.dt, other.dt)) {
            return false;
        }
        if (!Objects.equals(this.idParticipantes, other.idParticipantes)) {
            return false;
        }
        if (!Objects.equals(this.idTarefa, other.idTarefa)) {
            return false;
        }
        if (!Objects.equals(this.idTopico, other.idTopico)) {
            return false;
        }
        return true;
    }
    
    

}
