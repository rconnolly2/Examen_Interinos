public class Plazas {
    private final Integer id;
    private final Character tipo;
    private boolean adjudicada = false;
    private Persona pers_adjudicada = null;
    private static Integer contador = 0;

    public Plazas(Character tip) {
        Plazas.contador++;
        this.id = contador;
        this.tipo = tip;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }

    public Persona getPers_adjudicada() {
        return pers_adjudicada;
    }

    public Integer getId() {
        return id;
    }

    public Character getTipo() {
        return tipo;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Plazas.contador = contador;
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }

    private Persona setPers_adjudicada(Persona per) {
        this.pers_adjudicada = per;
    }

    @Override
	public String toString() {
		String texto =
				"------------------------------------\n"
				+ "ID Plaza "+getId()+"\n"
				+ "Tipo: "+getTipo()+"\n";
		if (isAdjudicada()) {
			texto=texto+
					"Adjudicada: ADJUDICADA\n"
					+ "ID: "+getPers_adjudicada().getId()+"\n"
					+ "Nombre: "+this.getPers_adjudicada().getNombre()+"\n"
					+ "Apellido1: "+getPers_adjudicada().getApellido1()+"\n"
					+ "Apellido2: "+getPers_adjudicada().getApellido2()+"\n"
					;
			if (getTipo()=='D') {
				texto=texto
						+"Titulacion: "+getPers_adjudicada().getTitulacion()+"\n"
						+ "Puntos: "+getPers_adjudicada().getPuntos()+"\n"
						;
			}else {
				texto=texto
						+"Especialidad: "+getPers_adjudicada().getEspecialidad()+"\n"
						+ "Dias: "+getPers_adjudicada().getDias_trabajados()+"\n"
						;
			}
		}else {
			texto=texto+
					"Adjudicada: NO ADJUDICADA\n";
		}
		
		return texto;
	}

    
}
