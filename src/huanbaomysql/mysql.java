package huanbaomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
	Connection conn;
	public static String ip = "127.0.0.1";
	public static String database = "root";
	public static String username = "root";
	public static String password = "root";
	public void amysql(){
	try {	
		 conn = DriverManager.getConnection("jdbc:mysql://"+ip+"/"+database, username, password);
		System.out.println("�ɹ�");
	} catch (SQLException e) {
		System.err.println("״̬:ʧ��");
		System.out.print(e);
	}
	}
	public void jifen() throws SQLException{

        Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}  

        String sql = "CREATE TABLE person(uid varchar(32),name char(32))";  

        // �������ݿ��еı�  
        int result = stmt.executeUpdate(sql);  

        if (result != -1) {
            System.out.println("�������ݱ�ɹ�");  

            sql = "INSERT INTO person(uid,name) VALUES('1','somebody1')";  
            result = stmt.executeUpdate(sql);  

            sql = "INSERT INTO person(uid,name) VALUES('2','somebody2')";  
            result = stmt.executeUpdate(sql);  

            sql = "SELECT * FROM person";  

            ResultSet rs = stmt.executeQuery(sql);  
            System.out.println("uid\t����");  

            while (rs.next()) {  
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));  
            }  
		
	}
	}
    public static void main(String[] args) {
    	mysql a=new mysql();
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    	a.amysql();
    	try {
			a.jifen();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    }
}
