import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_BD {
    public Connection get_conConnection() {
    Connection conection = null;
    try {
        conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_de_motos","root","");
        if (conection!= null) {
            System.out.println("Conectado");
           }
        }catch (SQLException e) {
        System.out.println("Error :"+e);

    }

        return conection;
    }
}
