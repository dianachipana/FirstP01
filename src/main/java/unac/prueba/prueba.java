
package unac.prueba;


import java.sql.Connection;
import java.sql.SQLException;
import unac.database.AccesoDB;

public class prueba {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion conforme....");
        } catch (SQLException e) {
            System.out.println("error :" + e.getMessage());
        }
    }
}
