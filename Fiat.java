public class Fiat extends Carro {
    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public void modelo() {
        System.out.println("Modelo Fiat");
    }

    public Fiat(String nome){
        this.nome = nome;
    }
}
