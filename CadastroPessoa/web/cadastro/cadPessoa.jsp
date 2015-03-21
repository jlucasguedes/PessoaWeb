<jsp:include page="/template/header.jsp" />
        <h2><a href="/CadastroPessoa/">Voltar para o MENU</a></h2>
        <form name="formulario" action="/CadastroPessoa/Controller?acao=ControllerLogicPessoaCadastrar" method="POST">
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
<jsp:include page="/template/footer.jsp" />