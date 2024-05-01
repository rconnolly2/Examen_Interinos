import java.util.Comparator;



public class Sanitarios extends Persona {
    private final String especialidad;
    private final Integer dias_trabajados;
    
    public Sanitarios(String nom, String apell1, String apell2, String espec, Integer dias_trab) {
        super(nom, apell1, apell2);
        this.especialidad = espec;
        this.dias_trabajados = dias_trab;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Integer getDias_trabajados() {
        return dias_trabajados;
    }

    @Override
    public String toString() {
        return super.toString()+ " Docente [especialidad=" + getEspecialidad() + ", dias trabajados=" + getDias_trabajados() + "]";
    }


}

class ComparadorSanitario implements Comparator<Persona> {

    @Override
    public int compare(Persona s1, Persona s2) {
      return  Integer.compare(s1.getDias_trabajados(), s2.getDias_trabajados());
    }
}

