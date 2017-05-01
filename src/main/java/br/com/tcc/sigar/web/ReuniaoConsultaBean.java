/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;


import br.com.tcc.sigar.reuniao.Reuniao;
import br.com.tcc.sigar.reuniao.ReuniaoRN;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Flipe
 */
@ManagedBean
@RequestScoped
public class ReuniaoConsultaBean{

    private Reuniao reuniao = new Reuniao();

    private List<Reuniao> lista;

    public List<Reuniao> getLista() {
        if (this.lista == null) {
            ReuniaoRN reuniaoRN = new ReuniaoRN();
            this.lista = reuniaoRN.listar();
        }

        return this.lista;
    }
    
    public String consultar() {
      return "consultarreuniao";
      
    }

    public String excluir() {
        ReuniaoRN reuniaoRN = new ReuniaoRN();
        reuniaoRN.excluir(this.reuniao);
        this.lista = null;
        return null;
    }

    public Reuniao getReuniao() {
        return reuniao;
    }

    public void setReuniao(Reuniao reuniao) {
        this.reuniao = reuniao;
    }

}
