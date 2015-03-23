package br.com.senacrs.controller.logic;


import br.com.senacrs.controller.logic.ControllerLogic;
import br.com.senacrs.dao.PessoaDAO;
import br.com.senacrs.util.DAOFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class ControllerLogicPessoaExcluir implements ControllerLogic {

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PessoaDAO pessoaDAO = DAOFactory.getPessoaDAO();
        
        pessoaDAO.excluir(Integer.parseInt(request.getParameter("id")));
        
        request.getRequestDispatcher("/Controller?acao=ControllerLogicPessoaListar").forward(request, response);
    }
    
}
