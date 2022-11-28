<html>
<body>
<h2>Welcome to JSP</h2>
<%-- comment tag --%>
 <%-- Scriplet Tag --%>
     <%
         out.println("welcome to the scriplet tag"+ "<br/>");
         
     
     %>
     <%-- Expression Tag --%> 
    Todays date is  <%= (new java.util.Date()).toLocaleString()+ "<br/>" %>
    
     <%-- Declaration Tag --%>
     <%! int x=67; %>
     <%= "Value of x is "+x %>
     
    
</body>
</html>
