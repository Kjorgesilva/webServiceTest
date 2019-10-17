package br.com.ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.model.Cliente;

@Path("/cliente")
public class ClienteWs implements Serializable {

	List<Cliente> listagem = new ArrayList<Cliente>();

	public ClienteWs() {		
		listagem.add(new Cliente(1,"Login", "Senha"));
//		http://10.12.5.163:8080/ServiceTeste/rest/cliente/user

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user")
	public String listar() {
		System.out.println("passou aqui");
		return new Gson().toJson(listagem);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/teste")
	public Cliente getTestService(@QueryParam("login") String login, @QueryParam("senha") String senha) {
		Cliente teste = new Cliente();
		System.out.println("Passou teste");
		return 	teste;
	}
	
	
	
	

}
