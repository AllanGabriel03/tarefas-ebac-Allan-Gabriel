package main.java.DAO;

import main.java.DAO.generics.GenericDAO;
import main.java.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    public ClienteDAO(){
        super();
    }

}
