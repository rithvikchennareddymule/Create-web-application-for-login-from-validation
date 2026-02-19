import java.sql.Connection; import java.sql.DriverManager; import java.sql.PreparedStatement; import java.sql.ResultSet; import java.sql.SQLException; 
 

import com.nriit.login.LoginBean; 
 
public class LoginDao { 
 
public boolean validate(LoginBean loginBean) throws 
ClassNotFoundException { boolean status = false; 
 
Class.forName("com.mysql.jdbc.Driver"); 
 
try (Connection connection = DriverManager 
.getConnection("jdbc:mysql://localhost:3306/mysql_d atabase?useSSL=false", "root", "rithvikmule@10"); 
 
