<%@page import="DAO.PersonDao,pojo.Person" %>
<jsp:useBean id="obj" class="pojo.Person"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
int i=PersonDao.register(obj);
if(i>0)
out.print("success");

%>