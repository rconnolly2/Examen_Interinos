import java.util.ArrayList;

public class App {

    public static void adjudicarPlazas(ArrayList<Plazas> lst_plazas, ArrayList<Persona> lst_doc_san) {
        // Saco sanitarios y docentes y los meto en 2 arraylist separadas
        ArrayList<Persona> lst_san = new ArrayList<Persona>();
        ArrayList<Persona> lst_doc = new ArrayList<Persona>();

        // itero sobre la arraylist de docentes y sanitarios
        for (int i=0; i<=lst_doc_san.size()-1; i++) {
            if (lst_doc_san.get(i) instanceof Sanitarios) {
                // es obj sanitario
                lst_san.add(lst_doc_san.get(i));
            } else {
                lst_doc.add(lst_doc_san.get(i));
            }
        }

        // Ordeno con 2 comparatorslos docentes ordenados por puntuacion y los sanitarios por dias
        lst_doc.sort(new ComparadorDocente());

        System.out.println(lst_doc.toString());

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crear una ArrayList de Personas
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar algunas personas a la lista
        personas.add(new Docentes("Juan", "Pérez", "García", "Matemáticas", 123));
        personas.add(new Docentes("María", "López", "Martínez", "Historia", 124));
        personas.add(new Sanitarios("Pedro", "Sánchez", "Fernández", "Enfermero", 125));
        personas.add(new Sanitarios("Ana", "Gómez", "Rodríguez", "Médico", 126));

        adjudicarPlazas(null, personas);

    }
}


