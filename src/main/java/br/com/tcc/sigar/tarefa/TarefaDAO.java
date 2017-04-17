/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.tarefa;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface TarefaDAO {

    void atualizar(Tarefa tarefa);

    Tarefa buscarPorCodigo(Integer idTarefa);

    Tarefa carregar(Integer idTarefa);

    void excluir(Tarefa tarefa);

    List<Tarefa> listar();

    void salvar(Tarefa tarefa);
    
}
