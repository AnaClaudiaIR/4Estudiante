public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota(int nota) { //Condición de nota entre 0 y 10 en el setter
        if(nota >0 & nota<10){
            this.nota = nota;
        } else{
            System.out.println("Has introducido una nota invalida. Nota = 0, por defecto.");
            this.nota = 0; //Se escribe la nora como 0 por defecto
        }
    }

    public Estudiante(String nombre, int edad, int nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
    }
}
