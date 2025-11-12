public class Main {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Lorena",13,8);
        estudiante1.setNota(12);
        estudiante1.setEdad(13);
        estudiante1.setNombre("Lorena");

        System.out.println("Información Estudiante 1: ");
        estudiante1.mostrarInfo();
    }
}
