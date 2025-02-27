
import Dao.*;
import Main.Acessorio;
import Main.Carro;
import Main.Marca;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    private ICarroDao carroDao;

    private IMarcaDao marcaDao;

    private IAcessorioDao acessorioDao;

    public CarroTest(){
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar(){
        Marca marca = criarMarca("MARCA TESTE");
        Acessorio acessorio = criarAcessorio("ACESSORIO TESTE");

        Carro carro = new Carro();
        carro.setNome("CARRO TESTE");
        carro.setMarca(marca);
        carro.setAcessorio(acessorio);
        carroDao.cadastrar(carro);

        /*Assert.assertNotNull(carro);
        Assert.assertNotNull(carro.getId());*/
    }

    private Acessorio criarAcessorio(String nome) {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("ACESSORIO TESTE");

        return acessorioDao.cadastrar(acessorio);
    }

    public Marca criarMarca(String nome){
        Marca marca = new Marca();
        marca.setNome("MARCA TESTE");

        return marcaDao.cadastrar(marca);
    }
}
