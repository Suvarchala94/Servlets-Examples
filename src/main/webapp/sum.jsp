
<%@ page errorPage="error.jsp" %>
<%
	String num1=request.getParameter("n1");
	String num2=request.getParameter("n2");
	int a=Integer.parseInt(num1);
	int b=Integer.parseInt(num2);
	int n3=a/b;
	out.println("the result is "+n3);

%>
