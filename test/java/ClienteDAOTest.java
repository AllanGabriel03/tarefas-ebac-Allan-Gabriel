package test.java;

import main.java.DAO.ClienteDAO;
import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;
import main.java.exception.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.DAO.ClienteDaoMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDAO = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException{
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Allan");
        cliente.setCidade("Aracaju");
        cliente.setEnd("End");
        cliente.setEstado("SE");
        cliente.setNumero(77);
        cliente.setTel(79999999999L);
        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Allan Gabriel");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("Allan Gabriel", cliente.getNome());
    }
}
