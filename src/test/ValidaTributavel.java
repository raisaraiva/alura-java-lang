package test;

import model.ContaCorrente;
import model.utils.CalculadoraUtils;

public class ValidaTributavel {

	public static void test() {

		ContaCorrente contaCorrenteA = new ContaCorrente(3, 3);
		ContaCorrente contaCorrenteB = new ContaCorrente(4, 4);

		contaCorrenteA.deposita(100.0);
		contaCorrenteB.deposita(200.0);

		CalculadoraUtils calculadorDeImposto = new CalculadoraUtils();

		calculadorDeImposto.registra(contaCorrenteA);
		calculadorDeImposto.registra(contaCorrenteB);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}
}
