public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Pedrito");
        estudiante.setEdad(20);
        estudiante.setProgramaAcademico("Ingeniería de Sistemas");
        estudiante.setNota1(4.5);
        estudiante.setNota2(3.8);
        estudiante.setNota3(4.2);
        estudiante.saludar();
        estudiante.edadDeLaPersona();
        estudiante.calcularPromedio();

        Persona estudiante2 = new Estudiante();
        estudiante2.setNombre("Sandra");
        estudiante2.setEdad(22);
        estudiante2.saludar();

        Profesor profesor = new Profesor();
        profesor.setNombre("Laura");
        profesor.setEdad(35);
        profesor.setDepartamento("Sistemas");
        profesor.saludar();
        profesor.dictarClase();
    }
}
