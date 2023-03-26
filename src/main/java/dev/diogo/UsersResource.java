package dev.diogo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UsersResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuarios> getAllUsers() {
        return Usuarios.listAll();
    }

    @POST
    @Transactional
    public void create() {
        Usuarios user = new Usuarios();
        user.setFullName("Diogo Ribeiro Ramos");
        user.setUsername("diogo123");
        user.persist();
        // return user;
    }
}