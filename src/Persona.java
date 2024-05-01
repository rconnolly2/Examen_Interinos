public abstract class Persona {
    private final Integer id;
    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private static Integer contador = 0;

    public Persona(String nom, String apell1, String apell2) {
        Persona.contador++;
        this.id = contador;

        this.nombre = nom;
        this.apellido1 = apell1;
        this.apellido2 = apell2;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    @Override
    public String toString() {
        return "id="+getId()+", nombre="+getNombre()+", primer_apellido="+getApellido1()+", segundo_apellido="+getApellido2();
    }
}
