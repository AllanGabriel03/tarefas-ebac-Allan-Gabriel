package test.java;


import Main.Java.Produto;
import Main.Java.dao.jdbc.ProdutoDAO;
import Main.Java.dao.jdbc.IProdutoDAO;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Internet");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void atualizarTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Allan Gabriel");
        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.buscar("01");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setCodigo("02");
        produtoBD.setNome("Outro nome");
        Integer countUpdate = dao.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoBD1 = dao.buscar("01");
        assertNull(produtoBD1);

        Produto produtoBD2 = dao.buscar("02");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());

        List<Produto> list = dao.buscarTodos();
        for (Produto pro : list) {
            dao.excluir(pro);
        }
    }

    @Test
    public void consultarTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();

        produto.setCodigo("01");
        produto.setNome("Internet");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();

        produto.setCodigo("01");
        produto.setNome("Internet");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }


    @Test
    public void buscarTodosTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Internet");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtos = new Produto();
        produtos.setCodigo("01");
        produtos.setNome("Teste");
        Integer qtd2 = dao.cadastrar(produtos);
        assertTrue(qtd2 == 1);

        List<Produto> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int qtdDel = 0;
        for (Produto pro : list) {
            dao.excluir(pro);
            qtdDel++;
        }
        assertEquals(list.size(), qtdDel);

        list = dao.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void excluirTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Internet");

        dao.cadastrar(produto);

        Produto produtoBD = dao.consultar(produto.getCodigo());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }


}
