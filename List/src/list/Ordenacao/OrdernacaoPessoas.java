package list.Ordenacao;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class OrdernacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdernacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); 
        return pessoasPorAltura;   
    }

    public static void main(String[] args) {
        OrdernacaoPessoas ordernacaoPessoas = new OrdernacaoPessoas();

        ordernacaoPessoas.adicionarPessoa("Carla", 18, 1.73);
        ordernacaoPessoas.adicionarPessoa("Lucas", 14, 1.62);
        ordernacaoPessoas.adicionarPessoa("Maria", 27, 1.60);
        ordernacaoPessoas.adicionarPessoa("Joao", 32, 1.82);

        System.out.println("Organizando por altura: ");
        System.out.println(ordernacaoPessoas.ordenarPorAltura());
        System.out.println("Organizando por idade: ");
        System.out.println("\n" + ordernacaoPessoas.ordenarPorIdade());
    }
}
