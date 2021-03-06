/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.dao.PessoaDAO;
import br.com.senacrs.util.DAOFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 */
public class ControllerLogicPessoaEditar implements ControllerLogic {

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Pessoa pessoa = new Pessoa();

        pessoa.setId(Integer.parseInt(request.getParameter("id")));
        pessoa.setNome(request.getParameter("nome"));
        pessoa.setSobreNome(request.getParameter("sobrenome"));
        pessoa.getEndereco().setRua(request.getParameter("rua"));
        pessoa.getEndereco().setBairro(request.getParameter("bairro"));
        pessoa.getEndereco().setCep(request.getParameter("cep"));

        PessoaDAO pessoaDAO = DAOFactory.getPessoaDAO();
        
        pessoaDAO.editar(pessoa);
        
        request.getRequestDispatcher("/Controller?acao=ControllerLogicPessoaListar").forward(request, response);
        
    }

}
