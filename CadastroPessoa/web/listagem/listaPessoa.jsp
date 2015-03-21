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
    </head>
    <body>

        <c:if test="${not empty pessoa.nome}">
            ${pessoa.nome}
            ${pessoa.sobreNome}<br />
        </c:if>
        ${pessoa.endereco.rua} <br />
        ${pessoa.endereco.bairro} <br />
        ${pessoa.endereco.cep}

    </body>
</html>