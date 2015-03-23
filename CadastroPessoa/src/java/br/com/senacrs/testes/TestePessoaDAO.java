/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.testes;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.dao.PessoaDAO;
import br.com.senacrs.util.DAOFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "TestePessoaDAO", urlPatterns = {"/TestePessoaDAO"})
public class TestePessoaDAO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("João Lucas");
            pessoa.setSobreNome("Guedes de Oliveira");
            pessoa.getEndereco().setRua("Rua 24");
            pessoa.getEndereco().setBairro("Setor Bela Vista");
            pessoa.getEndereco().setCep("77.000-000");
//            pessoa.setNome(request.getParameter("nome"));
//            pessoa.setSobreNome(request.getParameter("sobrenome"));
//            pessoa.getEndereco().setRua(request.getParameter("rua"));
//            pessoa.getEndereco().setBairro(request.getParameter("bairro"));
//            pessoa.getEndereco().setCep(request.getParameter("cep"));
            
            PessoaDAO pessoaDAO = DAOFactory.getPessoaDAO();
            pessoaDAO.inserir(pessoa);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestePessoaDAO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Testando Inserção de Pessoa</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
