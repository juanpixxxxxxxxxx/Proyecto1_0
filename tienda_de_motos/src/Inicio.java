public class Inicio {
    public static void main(String[] args) {
        System.out.println("conectando....");
        Conexion_BD conexion = new Conexion_BD();
        try {
            conexion.get_conConnection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
