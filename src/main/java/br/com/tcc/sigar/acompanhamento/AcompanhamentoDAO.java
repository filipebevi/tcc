/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.acompanhamento;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface AcompanhamentoDAO {

    void atualizar(Acompanhamento acompanhamento);

    Acompanhamento buscarPorCodigo(Integer idAcompanhamento);

    Acompanhamento carregar(Integer idAcompanhamento);

    void excluir(Acompanhamento acompanhamento);

    List<Acompanhamento> listar();

    void salvar(Acompanhamento acompanhamento);
    
}
