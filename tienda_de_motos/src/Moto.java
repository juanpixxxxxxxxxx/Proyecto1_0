import java.sql.*;
import java.util.Scanner;
public class Moto {


    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_De_Motos", "root", "");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de modificación de motos");
        System.out.println("1. Modificar marca");
        System.out.println("2. Modificar modelo");
        System.out.println("3. Modificar año de fabricación");
        System.out.println("4. Modificar color");
        System.out.println("5. Modificar precio");
        System.out.println("6. Salir");


        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:

                System.out.println("Introduzca la nueva marca:");
                String nuevaMarca = scanner.next();

                Statement statement = connection.createStatement();
                String query = "UPDATE moto SET marca = '" + nuevaMarca + "' WHERE id_moto = " + scanner.nextInt();
                statement.executeUpdate(query);


                System.out.println("La marca se ha modificado correctamente.");
                break;
            case 2:

                System.out.println("Introduzca el nuevo modelo:");
                String nuevoModelo = scanner.next();


                Statement statement2 = connection.createStatement();
                String query2 = "UPDATE moto SET modelo = '" + nuevoModelo + "' WHERE id_moto = " + scanner.nextInt();
                statement2.executeUpdate(query2);


                System.out.println("El modelo se ha modificado correctamente.");
                break;
            case 3:

                System.out.println("Introduzca el nuevo año de fabricación:");
                int nuevoAñoFabricacion = scanner.nextInt();


                Statement statement3 = connection.createStatement();
                String query3 = "UPDATE moto SET año_fabricacion = " + nuevoAñoFabricacion + " WHERE id_moto = " + scanner.nextInt();
                statement3.executeUpdate(query3);


                System.out.println("El año de fabricación se ha modificado correctamente.");
                break;
            case 4:

                System.out.println("Introduzca el nuevo color:");
                String nuevoColor = scanner.next();


                Statement statement4 = connection.createStatement();
                String query4 = "UPDATE moto SET color = '" + nuevoColor + "' WHERE id_moto = " + scanner.nextInt();
                statement4.executeUpdate(query4);


                System.out.println("El color se ha modificado correctamente.");
                break;
            case 5:

                System.out.println("Introduzca el nuevo precio:");
                double nuevoPrecio = scanner.nextDouble();


                Statement statement5 = connection.createStatement();
                String query5 = "UPDATE moto SET precio = " + nuevoPrecio + " WHERE id_moto = " + scanner.nextInt();
                statement5.executeUpdate(query5);


                System.out.println("El precio se ha modificado correctamente.");
                break;
            case 6:

                System.out.println("Saliendo...");
                break;
            default:

                System.out.println("Opción no válida.");
        }


        connection.close();


    }
}
