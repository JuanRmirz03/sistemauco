public class Persona {
    private String nombre;
    protected int edad;
    private String correo;

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad está mala");
        } else {
            this.edad = edad;
            System.out.println("La edad se modificó");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
