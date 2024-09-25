public class Corolla implements ICarFactory{
    @Override
    public void getModelo() {
        System.out.println(getClass().getName());
    }

    @Override
    public String getCor() {
        return "Preto";
    }
}
