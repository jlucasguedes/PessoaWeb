<%-- 
    Document   : cadPessoa
    Created on : 21/03/2015, 00:07:56
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Pessoa</title>
    </head>
    <body>
        <form name="formulario" action="PessoaServlet" method="POST">
            <table>
                <thead>
                    <tr>
                        <th colspan="2"> Cadastro de Pessoa </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label for="nome">Nome:</label></td>
                        <td><input type="text" name="nome" size="50" id="nome" /></td>
                    </tr>
                    <tr>
                        <td><label for="sobrenome">Sobrenome:</label></td>
                        <td><input type="text" name="sobrenome" size="50" id="sobrenome" /></td>
                    </tr>
                    <tr>
                        <td><label for="rua">Rua:</label></td>
                        <td><input type="text" name="rua" size="50" id="rua" /></td>
                    </tr>
                    <tr>
                        <td><label for="bairro">Bairro:</label></td>
                        <td><input type="text" name="bairro" size="50" id="bairro" /></td>
                    </tr>
                    <tr>
                        <td><label for="cep">CEP:</label></td>
                        <td><input type="text" name="cep" size="50" id="cep" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enviar" name="enviar" /></td>
                        <td><input type="reset" value="Limpar" name="limpar" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
