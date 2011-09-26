<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<html>
<head>
<title>Principal</title>
<link rel="stylesheet" href="style.css">

</head>
<body>  
<f:view>
	<h:form id="form">
		<h:panelGrid columns="2">
			<h:commandButton action="#{noticiaMB.atualizarNoticias}"
				value="Listar Notícias" immediate="true" />
			<h:commandButton action="#{noticiaMB.iniciarIncluirNoticia}"
				value="Incluir Notícia" immediate="true" />
		</h:panelGrid>
		<h:messages errorStyle="color:red" infoStyle="color:blue"></h:messages>
		<br/>
		<h:dataTable id="dt1" value="#{noticiaMB.listaNoticias}" var="item"
			bgcolor="#F1F1F1" border="10" cellpadding="5" cellspacing="3"
			first="0" dir="LTR" frame="hsides" rules="all" width="100%">

			<f:facet name="header">
				<h:outputText value="Notícias cadastradas" />
			</f:facet>

			<h:column>
				<f:facet name="header">
					<h:outputText value="ID" />
				</f:facet>
				<h:outputText value="#{item.id}"></h:outputText>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Título" />
				</f:facet>
				<h:outputText value="#{item.titulo}"></h:outputText>
			</h:column>
			<h:column>			
				<f:facet name="header">
					<h:outputText value="Conteúdo" />
				</f:facet>
				<h:outputText value="#{item.conteudo}"></h:outputText>
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Data" />
				</f:facet>
				<h:outputText value="#{item.dataPublicacao}">
					<f:convertDateTime type="both" dateStyle="short" />
				</h:outputText>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Ações" />
				</f:facet>
				<h:panelGrid columns="2">
					<h:commandLink id="linkAtualizarNoticia"
						action="#{noticiaMB.iniciarAtualizarNoticia}" value="Atualizar">
						<f:setPropertyActionListener value="#{item.id}"
							target="#{noticiaMB.idNoticia}" />
					</h:commandLink>
					<h:commandLink id="linkExcluirNoticia"
						action="#{noticiaMB.excluirNoticia}" value="Excluir">
						<f:setPropertyActionListener value="#{item.id}"
							target="#{noticiaMB.idNoticia}" />
					</h:commandLink>
				</h:panelGrid>
			</h:column>

		</h:dataTable>
	</h:form>
</f:view>
</body>
</html>
