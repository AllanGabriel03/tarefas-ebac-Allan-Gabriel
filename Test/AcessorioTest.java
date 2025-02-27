
import Dao.AcessorioDao;
import Dao.IAcessorioDao;
import Main.Acessorio;
import org.junit.Assert;
import org.junit.Test;

public class AcessorioTest {

    private IAcessorioDao acessorioDao;

    public AcessorioTest(){
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("ACESSORIO TESTE");
        acessorioDao.cadastrar(acessorio);

        Assert.assertNotNull(acessorio);
        Assert.assertNotNull(acessorio.getId());
    }
}
