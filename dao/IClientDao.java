package br.com.agabriel.dao;

import br.com.agabriel.domain.Cliente;

import java.util.Collection;

public interface IClientDao {
    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
