<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<form:form class="emi-form" id="emiID" action="addFees?id=${id}"
			method="POST" modelAttribute="emi">
			
			<form:input path="date" id="date" type="text"
					class="form-control form-control-solid placeholder-no-fix"
					placeholder="date" autocomplete="off" required="" maxlength="50"
					name="date" />
					
					<form:input path="amount" id="amount" type="int"
					class="form-control form-control-solid placeholder-no-fix"
					placeholder="Email Address" autocomplete="off" required="" maxlength="50"
					name="amount" />

<button type="submit" class="btn green uppercase">submitt</button>


</form:form>






</body>
</html>