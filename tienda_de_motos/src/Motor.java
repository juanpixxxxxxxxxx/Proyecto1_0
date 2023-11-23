import java.sql.*;
import java.util.Scanner;
public class Motor {




        public static void main(String[] args) throws SQLException {


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_De_Motos", "root", "");


            Scanner scanner = new Scanner(System.in);


            System.out.println("Menú de modificación de motores");
            System.out.println("1. Modificar tipo de motor");
            System.out.println("2. Modificar cilindrada");
            System.out.println("3. Modificar costo");
            System.out.println("4. Salir");


            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:

                    System.out.println("Introduzca el nuevo tipo de motor:");
                    String nuevoTipoMotor = scanner.next();


                    Statement statement = connection.createStatement();
                    String query = "UPDATE motor SET tipo_motor = '" + nuevoTipoMotor + "' WHERE id_motor = " + scanner.nextInt();
                    statement.executeUpdate(query);


                    System.out.println("El tipo de motor se ha modificado correctamente.");
                    break;
                case 2:


                    System.out.println("Introduzca la nueva cilindrada:");
                    int nuevaCilindrada = scanner.nextInt();

                    Statement statement2 = connection.createStatement();
                    String query2 = "UPDATE motor SET cilindrada_cc = " + nuevaCilindrada + " WHERE id_motor = " + scanner.nextInt();
                    statement2.executeUpdate(query2);

                    System.out.println("La cilindrada se ha modificado correctamente.");
                    break;
                case 3:
                    System.out.println("Introduzca el nuevo costo:");
                    double nuevoCosto = scanner.nextDouble();

                    Statement statement3 = connection.createStatement();
                    String query3 = "UPDATE motor SET costo_motor = " + nuevoCosto + " WHERE id_motor = " + scanner.nextInt();
                    statement3.executeUpdate(query3);

                    System.out.println("El costo se ha modificado correctamente.");
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


