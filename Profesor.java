class Profesor extends Persona {
    private String departamento;

    public void dictarClase() {
        System.out.println(this.getNombre() + " está dictando clase en el departamento de " + this.departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
