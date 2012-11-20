<%@page import="DAO.PersonDao,pojo.Person"  %>
<jsp:useBean id="obj" class="pojo.Person" scope="page">
<jsp:setProperty property="*" name="obj"  />
</jsp:useBean>
<%
int i=PersonDao.register(obj);
if(i>0)
out.print("success");

%>