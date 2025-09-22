package conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaSencilla_mariadb {
public static void main(String[] args) {
Connection con;
try {
     // Establecemos la conexion con la BD
     con= 
     DriverManager.getConnection("jdbc:mysql://localhost:33060/prueba", "root", "root");
     System.out.println("conecta");
     Statement smt = con.createStatement();
      ResultSet rset = smt.executeQuery("select  * from estancias");
      while (rset.next())
            System.out.println("Codigo estancia " + rset.getString(1) + " metros " + rset.getString(2) + " nº radiadores " + rset.getString(3));
     con.close(); // Cerrar conexión
} catch (SQLException cn) {
cn.printStackTrace();
}
}
}


