package SGA.Cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import SGA.Persona;
import SGA.Servicio.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el Cliente \n");

        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA/PersonaServiceImpl");
            List<Persona> personas = personaService.listarPersonas();

            for (Persona persona : personas) {
                System.out.println(persona);
            }

            System.out.println("\nFin de la llamada al EJB desde el cliente");

        } catch (NamingException e) {
          
            e.printStackTrace();
        }

    }
    
}