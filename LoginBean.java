 Create a LoginBean class which we will use in JSP action tags. 
Package com.nriit.login.bean; 
Import java.io.Serializable; 
Public class LoginBean implements Serializable { 
 	/** 
•  
 */ 
 
 
 	Private static final long serialVersionUID = 
1L; 
 	Private String username; 
 	Private String password; 
 	Public String getUsername() { 
 	 	Return username; 
 	} 
 	Public void setUsername(String username) { 
 	This.username = username; 
 	} 
 	Public String getPassword() { 
            Return password; 
 	} 
 	Public void setPassword(String password)  
{ 
 	This.password = password; 
 	} 
}