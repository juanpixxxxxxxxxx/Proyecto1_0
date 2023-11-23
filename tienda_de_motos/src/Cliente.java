import java.sql.*;
import java.util.Scanner;
public class Cliente {




        public static void main(String[] args) throws SQLException {


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_De_Motos", "root", "");


            Scanner scanner = new Scanner(System.in);


            System.out.println("Menú de modificación de clientes");
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar apellido paterno");
            System.out.println("3. Modificar apellido materno");
            System.out.println("4. Salir");


            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:

                    System.out.println("Introduzca el nuevo nombre:");
                    String nuevoNombre = scanner.next();


                    Statement statement = connection.createStatement();
                    String query = "UPDATE cliente SET nombre_cliente = '" + nuevoNombre + "' WHERE id_cliente = " + scanner.nextInt();
                    statement.executeUpdate(query);


                    System.out.println("El nombre se ha modificado correctamente.");
                    break;
                case 2:

                    System.out.println("Introduzca el nuevo apellido paterno:");
                    String nuevoApellidoPaterno = scanner.next();


                    Statement statement2 = connection.createStatement();
                    String query2 = "UPDATE cliente SET apellido_paterno = '" + nuevoApellidoPaterno + "' WHERE id_cliente = " + scanner.nextInt();
                    statement2.executeUpdate(query2);


                    System.out.println("El apellido paterno se ha modificado correctamente.");
                    break;
                case 3:

                    System.out.println("Introduzca el nuevo apellido materno:");
                    String nuevoApellidoMaterno = scanner.next();


                    Statement statement3 = connection.createStatement();
                    String query3 = "UPDATE cliente SET apellido_materno = '" + nuevoApellidoMaterno + "' WHERE id_cliente = " + scanner.nextInt();
                    statement3.executeUpdate(query3);


                    System.out.println("El apellido materno se ha modificado correctamente.");
                    break;
                case 4:

                    System.out.println("Saliendo...");
                    break;
                default:

                    System.out.println("Opción no válida.");
            }


            connection.close();
        }
    }


