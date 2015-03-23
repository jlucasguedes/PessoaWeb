<%-- 
    Document   : visualizaPessoa
    Created on : 21/03/2015, 00:20:11
    Author     : lucas
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="pessoa" scope="request" class="br.com.senacrs.bean.Pessoa" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visualização de Pessoa</title>
        <style>
            tr th { text-align: left; padding: 10px; background: darkturquoise;}
            table, tr, td { border-collapse: collapse; border: 2px solid gray; padding: 5px; }
            a { font-weight: bold; text-decoration: none; color: blue;}
        </style>
    </head>
    <body>
        <h2><a href="/CadastroPessoa/">Voltar para o MENU</a></h2>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Rua</th>
                    <th>Bairro</th>
                    <th>CEP</th>
                    <th colspan="2">Ações</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${pessoas}" var="pessoa">
                    <tr>
                        <td>${pessoa.id}</td>
                        <td>${pessoa.nome}</td>
                        <td>${pessoa.sobreNome}</td>
                        <td>${pessoa.endereco.rua}</td>
                        <td>${pessoa.endereco.bairro}</td>
                        <td>${pessoa.endereco.cep}</td>                        
                        <td><a href="${pageContext.request.contextPath}/Controller?acao=ControllerLogicPessoaPopularEditar&id=${pessoa.id}">Editar</a></td>
                        <td><a href="${pageContext.request.contextPath}/Controller?acao=ControllerLogicPessoaExcluir&id=${pessoa.id}">Excluir</a></td>
                    </tr>
                </c:forEach>
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
