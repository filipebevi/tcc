/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.topico;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface TopicoDAO {

    void atualizar(Topico topico);

    Topico buscarPorCodigo(Integer idTopico);

    Topico carregar(Integer idTopico);

    void excluir(Topico topico);

    List<Topico> listar();

    void salvar(Topico topico);
    
}
