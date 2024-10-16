//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fabrica<Object> carros = new Fabrica<>();
        carros.adicionarModelos(new Honda("Civic"));
        carros.adicionarModelos(new Honda("Accord"));
        carros.adicionarModelos(new Fiat("Uno"));
        carros.adicionarModelos(new Fiat("Toro"));
    }
}