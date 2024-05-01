import java.util.Comparator;

public class Docentes extends Persona {
    private final String titulacion;
    private final Integer puntos;

    public Docentes(String nom, String apell1, String apell2, String titul, Integer punt) {
        super(nom, apell1, apell2);
        this.titulacion = titul;
        this.puntos = punt;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return super.toString()+ " Docente [titulacion=" + getTitulacion() + ", puntos=" + getPuntos() + "]";
    }

    
}

class ComparadorDocente implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
      return  Integer.compare(p1.getPuntos(), p2.getPuntos());
    }
}

