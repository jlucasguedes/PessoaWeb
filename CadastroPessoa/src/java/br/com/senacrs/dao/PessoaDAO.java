/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.dao;

import br.com.senacrs.bean.Pessoa;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface PessoaDAO {

    public void inserir(Pessoa pessoa);

    public void excluir(int id);

    public Pessoa buscar(int id);

    public void editar(Pessoa pessoa);

    public List<Pessoa> listar();

}
