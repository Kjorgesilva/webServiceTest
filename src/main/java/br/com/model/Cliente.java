package br.com.model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
    private Integer id;
    private String login;
    private String senha;
 
    
    public Cliente(){
    	
    }


	public Cliente(int id, String login, String senha) {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}   
	
	
	
	
    
    
    

}
