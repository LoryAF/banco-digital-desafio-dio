package br.com.dio.banco;


import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    // Construtor que inicializa a lista de contas
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(); // Inicialização da lista
    }

    // Método para adicionar contas ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para retornar todas as contas
    public List<Conta> getContas() {
        return contas;
    }

    protected void imprimirInfoContasRegistradas () {
        System.out.println("\n=== Contas Registradas no Banco ===");
        for (Conta conta :contas) {
            System.out.println("Cliente: " + conta.cliente.getNome() + " - Conta: " + conta.numero);
        }
    }
}
