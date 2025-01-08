package test.java;

import Main.Java.Cliente;
import Main.Java.dao.jdbc.ClienteDAO;
import Main.Java.dao.jdbc.IClienteDAO;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {


    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.buscar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertTrue(qtdDel == 1);

    }

    @Test
    public void atualizarTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");
        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.buscar("01");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("02");
        clienteBD.setNome("Outro nome");
        Integer countUpdate = dao.atualizar(clienteBD);
        assertTrue(countUpdate == 1);

        Cliente clienteBD1 = dao.buscar("01");
        assertNull(clienteBD1);

        Cliente clienteBD2 = dao.buscar("02");
        assertNotNull(clienteBD2);
        assertEquals(clienteBD.getId(), clienteBD2.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = dao.buscarTodos();
        for (Cliente cli : list) {
            dao.excluir(cli);
        }
    }

    @Test
    public void consultarTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();

        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();

        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.buscar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertTrue(qtdDel == 1);
    }


    @Test
    public void buscarTodosTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clientes = new Cliente();
        clientes.setCodigo("01");
        clientes.setNome("Teste");
        Integer qtd2 = dao.cadastrar(clientes);
        assertTrue(qtd2 == 1);

        List<Cliente> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int qtdDel = 0;
        for (Cliente cli : list) {
            dao.excluir(cli);
            qtdDel++;
        }
        assertEquals(list.size(), qtdDel);

        list = dao.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void excluirTest() throws Exception{
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Allan Gabriel");

        dao.cadastrar(cliente);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }


}
