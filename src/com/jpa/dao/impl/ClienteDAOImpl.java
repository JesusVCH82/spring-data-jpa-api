package com.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.jpa.dao.ClienteDAO;
import com.jpa.entities.Cliente;
@Repository
public class ClienteDAOImpl implements ClienteDAO {

	@Override
	public Cliente createCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return new Cliente();
	}

}
