package conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaSencilla_oracle {
public static void main(String[] args) {
Connection conexion;
try {
      String urljdbc = "jdbc:oracle:thin:fran/perona43@localhost:1521:XE";
      //la base de datos esta en local y el servicio Oracle es XE 
      //se utiliza thin driver 
      conexion = DriverManager.getConnection(urljdbc, "fran", "perona43"); 
      Statement smt = conexion.createStatement();
      ResultSet rset = smt.executeQuery("select  * from emple");
      while (rset.next())
            System.out.println("empleado numero " + rset.getString(1) + " nombre " + rset.getString(2) + " oficio " + rset.getString(3));
      conexion.close();
      } catch (SQLException e) {
      e.printStackTrace();
      }
    }
}
