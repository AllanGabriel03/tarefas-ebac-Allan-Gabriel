//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ICarFactory hb20 = new HB20();
       System.out.print("Carro 1, Modelo: ");
       hb20.getModelo();
        System.out.print("Cor: ");
       System.out.println(hb20.getCor());

       ICarFactory corolla = new Corolla();
       System.out.print("Carro 2, Modelo: ");
       corolla.getModelo();
        System.out.print("Cor: ");
        System.out.println(corolla.getCor());
    }
}