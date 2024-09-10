package abstratas;


public class programa {
    public static void main (String args[]){
      PessoaFisica pessoas = new PessoaFisica();
      pessoas.setNome("Allan");
      pessoas.setCpf(45);
      System.out.println("Pessoa Física: ");
      System.out.println("Nome: " + pessoas.getNome() + " CPF: " + pessoas.getCpf());

      PessoaJuridica pj = new PessoaJuridica();
      pj.setNome("Allanj");
      pj.setCnpj(89);
      System.out.println("Pessoa Jurídica: ");
      System.out.print("Nome: " + pj.getNome() + " CNPJ: " + pj.getCnpj());
    }
}
