public class HB20 implements ICarFactory{

    @Override
    public void getModelo() {
        System.out.println(getClass().getName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
