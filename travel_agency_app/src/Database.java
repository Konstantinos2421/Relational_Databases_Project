import java.sql.*;

public class Database {
    public Connection conn;
    public Statement st;
    public PreparedStatement ps;
    public CallableStatement cs;
    
    public Database(){
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency", "root", "password");
            
            st = conn.createStatement();
            
        } catch (Exception e) {}
    }
}
