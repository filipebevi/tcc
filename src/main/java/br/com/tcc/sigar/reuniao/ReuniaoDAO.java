/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.reuniao;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface ReuniaoDAO {

    void atualizar(Reuniao reuniao);

    Reuniao buscarPorCodigo(Integer idReuniao);

    Reuniao carregar(Integer idReuniao);

    void excluir(Reuniao reuniao);

    List<Reuniao> listar();

    void salvar(Reuniao reuniao);
    
}
