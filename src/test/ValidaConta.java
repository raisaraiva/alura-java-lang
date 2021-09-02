package test;

import model.exception.SaldoInsuficienteException;
import model.ContaCorrente;
import model.ContaPoupanca;

public class ValidaConta {

	public static void test() {

		// cria as contas

		ContaCorrente contaCorrente = new ContaCorrente(1, 1);
		ContaPoupanca contaPoupanca = new ContaPoupanca(2, 2);

		System.out.println("Conta corrente: " + contaCorrente);
		System.out.println("Conta poupança: " + contaPoupanca);

		// deposita valores

		contaCorrente.deposita(100.0);
		contaPoupanca.deposita(200.0);

		// realiza transferência

		try {
			contaCorrente.transferencia(10.0, contaPoupanca);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());

		contaPoupanca.deposita(200.0);

		try {
			contaPoupanca.saque(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		System.out.println(contaPoupanca.getSaldo());
	}
}
