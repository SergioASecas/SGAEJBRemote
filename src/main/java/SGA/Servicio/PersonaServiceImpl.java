package SGA.Servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import SGA.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
       List<Persona> personas = new ArrayList<>();
       personas.add(new Persona(1,"Juan", "Perez", "jperez@gmail.com", "32165456"));
       personas.add(new Persona(2, "Sergio", "Villalba", "svillalba@gmail.com", "32165456"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaId(Persona persona) {
       
        return null;
    }

    @Override
    public Persona encontrarPersonaEmail(Persona persona) {
       
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
     
    }

    @Override
    public void eliminarPersona(Persona persona) {
       
    }
    
}