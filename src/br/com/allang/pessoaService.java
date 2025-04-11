package br.com.allang;

import java.util.List;
import java.util.stream.Collectors;

public class pessoaService {

    public List<Pessoa> apenasF(List<Pessoa> pessoas){
        return pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }
    public List<Pessoa> apenasM(List<Pessoa> pessoas){
        return pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("M"))
                .collect(Collectors.toList());
    }
}
