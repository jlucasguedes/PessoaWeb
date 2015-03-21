<jsp:include page="template/header.jsp" />
        <h1> Menu Pessoa </h1>
        <%-- Cadastrar, Editar Excluir e Listar --%>
        <h2><a href="${pageContext.request.contextPath}/Controller?acao=ControllerLogicRedirecionamento&page=cadPessoa">Cadastrar</a></h2>
        <h2><a href="${pageContext.request.contextPath}/Controller?acao=ControllerLogicRedirecionamento&page=editPessoa">Editar</a></h2>
        <h2><a href="${pageContext.request.contextPath}/Controller?acao=ControllerLogicRedirecionamento&page=listaPessoa">Listar</a></h2>
<jsp:include page="template/footer.jsp" />