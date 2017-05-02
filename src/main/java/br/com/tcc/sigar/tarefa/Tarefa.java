/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.tarefa;

import br.com.tcc.sigar.acompanhamento.Acompanhamento;
import br.com.tcc.sigar.participante.Participante;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Flipe
 */
@Entity
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue
    private Integer idTarefa;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Calendar previsao;
    @Temporal(TemporalType.DATE)
    private Calendar conclusao;
    @ManyToOne
    private Participante idParticipante;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Acompanhamento> idAcompanhamento;

    public Tarefa() {
        this.previsao = Calendar.getInstance();
        this.conclusao = null;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getPrevisao() {
        return previsao;
    }

    public void setPrevisao(Calendar previsao) {
        this.previsao = previsao;
    }

    public Calendar getConclusao() {
        return conclusao;
    }

    public void setConclusao(Calendar conclusao) {
        this.conclusao = conclusao;
    }

    public Participante getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Participante idParticipante) {
        this.idParticipante = idParticipante;
    }

    public List<Acompanhamento> getIdAcompanhamento() {
        return idAcompanhamento;
    }

    public void setIdAcompanhamento(List<Acompanhamento> idAcompanhamento) {
        this.idAcompanhamento = idAcompanhamento;
    }

    @Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdTarefa());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idTarefa);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        hash = 67 * hash + Objects.hashCode(this.previsao);
        hash = 67 * hash + Objects.hashCode(this.conclusao);
        hash = 67 * hash + Objects.hashCode(this.idParticipante);
        hash = 67 * hash + Objects.hashCode(this.idAcompanhamento);
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
        final Tarefa other = (Tarefa) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.idTarefa, other.idTarefa)) {
            return false;
        }
        if (!Objects.equals(this.previsao, other.previsao)) {
            return false;
        }
        if (!Objects.equals(this.conclusao, other.conclusao)) {
            return false;
        }
        if (!Objects.equals(this.idParticipante, other.idParticipante)) {
            return false;
        }
        if (!Objects.equals(this.idAcompanhamento, other.idAcompanhamento)) {
            return false;
        }
        return true;
    }
    
    

}
