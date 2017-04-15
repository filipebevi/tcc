/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.participante;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface ParticipanteDAO {

    void atualizar(Participante participante);

    Participante buscarPorCodigo(Integer idParticipante);

    Participante carregar(Integer idParticipante);

    void excluir(Participante participante);

    List<Participante> listar();
    
    List<Funcionario> listarFuncionario();
    
    List<Convidado> listarConvidado();
    
   

    void salvar(Participante participante);
    
}
