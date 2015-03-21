<jsp:include page="template/header.jsp" />
<jsp:useBean id="pessoa" scope="session" class="br.com.senacrs.bean.Pessoa" />
        <h2><a href="/CadastroPessoa/">Voltar para o MENU</a></h2>
        <form name="formulario" action="${pageContext.request.contextPath}/Controller?acao=ControllerLogicPessoaEditar" method="POST">
            <table>
                <thead>
                    <tr>
                        <th colspan="2"> Alteração no cadastro de Pessoa </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label for="nome">Nome:</label></td>
                        <td><input type="text" name="nome" value="${pessoa.nome}" size="50" id="nome" /></td>
                    </tr>
                    <tr>
                        <td><label for="sobrenome">Sobrenome:</label></td>
                        <td><input type="text" name="sobrenome" value="${pessoa.sobreNome}" size="50" id="sobrenome" /></td>
                    </tr>
                    <tr>
                        <td><label for="rua">Rua:</label></td>
                        <td><input type="text" name="rua" value="${pessoa.endereco.rua}" size="50" id="rua" /></td>
                    </tr>
                    <tr>
                        <td><label for="bairro">Bairro:</label></td>
                        <td><input type="text" name="bairro" value="${pessoa.endereco.bairro}" size="50" id="bairro" /></td>
                    </tr>
                    <tr>
                        <td><label for="cep">CEP:</label></td>
                        <td><input type="text" name="cep" value="${pessoa.endereco.cep}" size="50" id="cep" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enviar" name="enviar" /></td>
                        <td><input type="reset" value="Limpar" name="limpar" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
<jsp:include page="template/footer.jsp" />