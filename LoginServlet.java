Creating  LoginServlet to process HTTP request parameters. If login successfully validated with the database then redirect to loginsuccess.jsp page otherwise redirect to login.jsp page. 
loginServlet.java 
Package com.nriit.login.web; 
Import java.io.IOException; 
Import javax.servlet.ServletException; 
Import javax.servlet.annotation.WebServlet; 	 
 

Import javax.servlet.http.HttpServlet; 
Import javax.servlet.http.HttpServletRequest; 
Import javax.servlet.http.HttpServletResponse; 
Import javax.servlet.http.HttpSession; 
Import com.nriit.login.LoginBean; 
Import com.nriit.login.database.LoginDao; 
@WebServlet(“/login”) 
Public class LoginServlet extends HttpServlet { 
	 	Private static final long serialVersionUID 
= 1L; 
 	Private LoginDao loginDao;  	Public void init() { 
	 	 	loginDao = new LoginDao(); 
	 	} 
	 	Protected void doPost(HttpServletRequest 
request, HttpServletResponse response) 
	 	 	 	Throws ServletException, 
IOException { 
	 	 	String username = 
request.getParameter(“username”);  	 	String password = 
request.getParameter(“password”); 
	 	 	LoginBean loginBean = new 
LoginBean(); 
 	 	loginBean.setUsername(username);  	 	loginBean.setPassword(password); 
	 	 	try { 
	 	 	 	if (loginDao.validate(loginBean)) 	
{ 
	 	 	 	 	//HttpSession session = 
request.getSession(); 
	 	 	 	 	// 
session.setAttribute(“username”,username); 	
 
 
  requ  
Response.sendRedirect(“loginsuccess.jsp”); 
 	 	} else { 
 	 	 	HttpSession session = 
est.getSession(); 
 	 
//session.setAttribute(“user”, username); 
 	 
//response.sendRedirect(“login.jsp”); 
 	 	} 
 	} catch (ClassNotFoundException e) {  	 	e.printStackTrace(); 
 	} 	
 
} 	}