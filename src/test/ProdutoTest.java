package test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import main.java.Produto;
import org.junit.Assert;
import org.junit.Test;


public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setCodigo("P1");
        produto.setNome("PRODUTO TESTE");
        produto.setQuantidade(1);
        produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());
    }
}
