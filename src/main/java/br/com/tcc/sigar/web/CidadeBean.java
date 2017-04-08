/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;

import br.com.tcc.sigar.cidade.Cidade;
import br.com.tcc.sigar.cidade.CidadeRN;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Flipe
 */
@ManagedBean
@RequestScoped
public class CidadeBean {
    
    Cidade cidade = new Cidade();
    List<Cidade> lista;
 
    
    public String novo(){
        this.cidade = new Cidade();
        return "cadastrarcidade";
    }
    
    public String salvar(){
        CidadeRN cidadeRN = new CidadeRN();
        cidadeRN.salvar(this.cidade);
        
        return "cidade";
    }

    public List<Cidade> getLista() {
       if(this.lista==null){
            CidadeRN cidadeRN = new CidadeRN();
            this.lista=cidadeRN.listar();
       }
        
        return this.lista;
    }
    
    public String editar(){
        return "cadastrarcidade";
    }
    
   public String excluir(){
       CidadeRN cidadeRN=new CidadeRN();
       cidadeRN.excluir(this.cidade);
       this.lista=null;
       return null;
   }
   

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
}
