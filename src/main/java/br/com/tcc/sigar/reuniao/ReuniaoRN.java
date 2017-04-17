/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.reuniao;


import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class ReuniaoRN {
    
    private ReuniaoDAO reuniaoDAO;
    
    public ReuniaoRN(){
        this.reuniaoDAO = DAOFactory.criarReuniaoDAO();
    }
    
    public Reuniao carregar(Integer idReuniao){
        return this.reuniaoDAO.carregar(idReuniao);
    }
    
    public Reuniao buscarPorCodigo(Integer idReuniao){
        return this.reuniaoDAO.buscarPorCodigo(idReuniao);
    }
    
    public void salvar(Reuniao reuniao){
        this.reuniaoDAO.salvar(reuniao);
    
    }
    
    public void excluir(Reuniao reuniao){
        this.reuniaoDAO.excluir(reuniao);
    }
    
    public List<Reuniao> listar(){
        return this.reuniaoDAO.listar();
    }
    
}
