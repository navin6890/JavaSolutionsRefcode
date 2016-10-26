<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form class="login-form" id="formID" action="signIn"
			method="POST" modelAttribute="login">
			
			<form:input path="id" id="id" type="text"
					class="form-control form-control-solid placeholder-no-fix"
					placeholder="Email Address" autocomplete="off" required="" maxlength="50"
					name="username" />
					
					<form:input path="password" id="pass" type="text"
					class="form-control form-control-solid placeholder-no-fix"
					placeholder="Email Address" autocomplete="off" required="" maxlength="50"
					name="password" />

<button type="submit" class="btn green uppercase">Login</button>


</form:form>




</body>
</html>