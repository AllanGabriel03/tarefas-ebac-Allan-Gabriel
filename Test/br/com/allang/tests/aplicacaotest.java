package br.com.allang.tests;


import br.com.allang.Aplicacao;
import br.com.allang.Pessoa;
import br.com.allang.pessoaService;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class aplicacaotest {

    @Test
    public void test(){
        //*Aplicacao apli = new Aplicacao();
        pessoaService service = new pessoaService();

        List<Pessoa> pessoas = List.of(
                new Pessoa("Allan", "M"),
                new Pessoa("Roberta", "F"),
                new Pessoa("Arthur", "M"),
                new Pessoa("Telma", "f")
        );

        List<Pessoa> isFemale = service.apenasF(pessoas);

        assertTrue(isFemale.stream().allMatch(pessoa -> "F".equalsIgnoreCase(pessoa.getGenero())));





    }
}
