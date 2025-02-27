import Dao.IMarcaDao;
import Dao.MarcaDao;
import Main.Marca;
import org.junit.Assert;
import org.junit.Test;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest(){
      marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar(){
        Marca marca = new Marca();
        marca.setNome("MARCA TESTE");
        marcaDao.cadastrar(marca);

        Assert.assertNotNull(marca);
        Assert.assertNotNull(marca.getId());
    }
}
