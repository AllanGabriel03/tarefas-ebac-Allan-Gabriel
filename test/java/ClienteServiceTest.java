package test.java;

import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;
import main.java.exception.TipoChaveNaoEncontradaException;
import main.java.service.ClienteService;
import main.java.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.DAO.ClienteDaoMock;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Allan");
        cliente.setCidade("Aracaju");
        cliente.setEnd("End");
        cliente.setEstado("SE");
        cliente.setNumero(77);
        cliente.setTel(79999999999L);
    }

    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Allan Gabriel");
        clienteService.alterar(cliente);
        Assert.assertEquals("Allan Gabriel", cliente.getNome());
    }
}
