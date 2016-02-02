<%
if(request.getSession() != null) {
    request.getSession().invalidate();
}
out.println("<meta http-equiv=\"refresh\" content=\"0; url=index.jsp\">");
%>