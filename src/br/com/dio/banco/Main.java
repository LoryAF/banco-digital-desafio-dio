package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital");

        // Criando clientes
        Cliente cliente1 = new Cliente("Maria", "123.456.789-00", "Rua Exemplo, 101");
        Cliente cliente2 = new Cliente("João", "987.654.321-00", "Avenida Exemplo, 52");

        // Criando contas
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        // Adicionando as contas ao banco
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Operações
        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        // Imprimindo extratos
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Chamando o método para imprimir informações das contas registradas
        banco.imprimirInfoContasRegistradas();
    }
}
