package com.jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.dao.ClienteDAO;
import com.jpa.entities.Cliente;
import com.jpa.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteDAO.createCliente(cliente);
	}

}
