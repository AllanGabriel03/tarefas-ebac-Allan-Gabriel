public class Honda extends Carro {

    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public void modelo() {
        System.out.println("Modelo Honda");
    }

    public Honda(String nome){
        this.nome = nome;
    }
}
