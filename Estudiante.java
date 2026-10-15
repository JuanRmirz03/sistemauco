class Estudiante extends Persona {
    private String programaAcademico;
    private double nota1;
    private double nota2;
    private double nota3;

    public void edadDeLaPersona() {
        System.out.println("La edad es: " + this.edad);
    }

    public void calcularPromedio() {
        double promedio = (this.nota1 + this.nota2 + this.nota3) / 3;
        System.out.println("El promedio de " + this.getNombre() + " es: " + promedio);
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
