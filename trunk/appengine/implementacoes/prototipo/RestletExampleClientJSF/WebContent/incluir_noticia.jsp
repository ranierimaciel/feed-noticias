<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<html>
<head>
<title>Incluir Not�cia</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<f:view>
	<h:form id="form">	
		<h:panelGrid columns="2">
			<h:outputText value="T�tulo:" />
			<h:inputText value="#{noticiaMB.noticiaCadastro.titulo}" required="true" size="40" maxlength="500"
				requiredMessage="T�tulo obrigat�rio">
			</h:inputText> 
			<h:outputText value="Conte�do:" />
			<h:inputTextarea value="#{noticiaMB.noticiaCadastro.conteudo}" required="true"
				converter="textConverter"
				requiredMessage="Conte�do obrigat�rio" cols="50" rows="10">
			</h:inputTextarea>			
		</h:panelGrid>		
		<h:panelGrid columns="2">
			<h:commandButton action="#{noticiaMB.incluirNoticia}" value="Incluir Not�cia"/>
			<h:commandButton action="#{noticiaMB.iniciarPrincipal}" value="Voltar" immediate="true"/>
		</h:panelGrid>
		<h:messages errorStyle="color:red" infoStyle="color:blue"></h:messages>
	</h:form>
</f:view>
</body>
</html>
