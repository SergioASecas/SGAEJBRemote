package SGA.Servicio;

import java.util.List;
import javax.ejb.Remote;
import SGA.Persona;

@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();

    public Persona encontrarPersonaId(Persona persona);

    public Persona encontrarPersonaEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}