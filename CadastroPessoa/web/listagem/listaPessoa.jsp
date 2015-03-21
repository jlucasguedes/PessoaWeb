<%-- 
    Document   : visualizaPessoa
    Created on : 21/03/2015, 00:20:11
    Author     : lucas
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="pessoa" scope="session" class="br.com.senacrs.bean.Pessoa" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visualização de Pessoa</title>
        <style>
            tr th { text-align: left; padding: 10px;}
        </style>
    </head>
    <body>
        <h2><a href="/CadastroPessoa/">Voltar para o MENU</a></h2>
        <table>
            <thead>
                <tr>
                    <th colspan="2">Cliente cadastrado</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${not empty pessoa.nome}">
                    <tr>
                        <td><label for="nome">Nome:</label></td>
                        <td><input type="text" id="nome" name="nome" value="${pessoa.nome}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td><label for="sobreNome">Sobrenome:</label></td>
                        <td><input type="text" id="sobreNome" name="sobrenome" value="${pessoa.sobreNome}" readonly="readonly" /></td>
                    </tr>
                </c:if>
                    <tr>
                        <th colspan="2">Endereço</th>
                    </tr>
                    <tr>
                        <td><label for="rua">Rua:</label></td>
                        <td><input type="text" id="rua" name="" value="${pessoa.endereco.rua}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td><label for="bairro">Bairro</label></td>
                        <td><input type="text" id="bairro" name="bairro" value="${pessoa.endereco.bairro}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td><label for="cep">CEP:</label></td>
                        <td><input type="text" id="cep" name="cep" value="${pessoa.endereco.cep}" readonly="readonly"/></td>
                    </tr>
            </tbody>
        </table>
<%--
        <c:if test="${not empty pessoa.nome}">
            ${pessoa.nome}
            ${pessoa.sobreNome}<br />
        </c:if>
        ${pessoa.endereco.rua} <br />
        ${pessoa.endereco.bairro} <br />
        ${pessoa.endereco.cep} --%>

    </body>
</html>
