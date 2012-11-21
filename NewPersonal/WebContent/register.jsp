<%@page import="DAO.PersonDao,pojo.Person"  %>
<jsp:useBean id="obj" class="pojo.Person" >
<jsp:setProperty name="obj" property="name" param="Name"/>
<jsp:setProperty name="obj" property="address" param="Address"/>
</jsp:useBean>
<%
int i=PersonDao.register(obj);
out.println(String.valueOf(i));
%>
<% if (i>0) { %> 
    <a href="about_us.jsp" class="selected">About Usa</a> 
<% } else { %> 
    <a href="about_us.jsp">About Uss</a> 
<% } %> 
