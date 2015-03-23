/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.util;

import br.com.senacrs.dao.JDBCPessoaDAO;
import br.com.senacrs.dao.PessoaDAO;

/**
 *
 * @author Lucas
 */
public class DAOFactory {
    public static PessoaDAO getPessoaDAO() {
        return new JDBCPessoaDAO();
    }
    
}
