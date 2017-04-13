/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;

import br.com.tcc.sigar.departamento.Departamento;
import br.com.tcc.sigar.departamento.DepartamentoRN;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.omnifaces.util.Messages;

/**
 *
 * @author Flipe
 */
@ManagedBean
@RequestScoped
public class DepartamentoBean {
    private Departamento departamento = new Departamento();
    private List<Departamento> lista;
    
    public String novo(){
        this.departamento = new Departamento();
        return "cadastrardepartamento";
    }
    
    public String salvar(){
        DepartamentoRN departamentoRN = new DepartamentoRN();
        departamentoRN.salvar(this.departamento);
        Messages.addGlobalInfo("Departamento: COD:"+departamento.getIdDepartamento()+" "+departamento.getNome()+" cadastrado/alterado com sucesso");
        
        return "departamento";
    }

    public List<Departamento> getLista() {
       if(this.lista==null){
            DepartamentoRN departamentoRN = new DepartamentoRN();
            this.lista=departamentoRN.listar();
       }
        
        return this.lista;
    }
    
    public String editar(){
        return "cadastrardepartamento";
    }
    
   public String excluir(){
       DepartamentoRN departamentoRN=new DepartamentoRN();
       departamentoRN.excluir(this.departamento);
       this.lista=null;
       return null;
   }
   

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
