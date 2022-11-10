package controller;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
//import entities.Client;
//import model.ClientModel;

import javax.faces.bean.*;
import entities.*;
import model.*;

import java.math.BigDecimal;
import java.util.*;

@ManagedBean(name = "clientController")
@RequestScoped
public class ClientController {
	
	private ClientModel cm = new ClientModel();
	private Client client = new Client();
	
	public ClientModel getCm() {
		return cm;
	}
	
	public void setCm(ClientModel cm) {
		this.cm = cm;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Client> findAll(){
		return cm.findAll();
	}
	
	public String move() {
//		this.p = null;
		return "car_registration";
	}
	
	public String add() {
		this.cm.create(this.client);
		this.client = new Client();
		return "car_registration";
	}
	
	public String edit(Client client) {
		this.client = client;
		return "edit";
	}
	
	public String edit() {
		this.cm.update(this.client);
		return "index";
	}
	
	public void delete(Client client) {
		this.cm.delete(client);
	}
	

}

	

