package Alura.src.praticandoAlura.banco;

public class TesteCOnta {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.setTarifaMensal(10);
        contaCorrente.getTarifaMensal();
        contaCorrente.cobrarTarifa();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
