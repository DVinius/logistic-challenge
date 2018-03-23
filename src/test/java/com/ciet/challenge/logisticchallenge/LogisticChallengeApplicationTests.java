package com.ciet.challenge.logisticchallenge;

import org.junit.Test;

public class LogisticChallengeApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void shouldSolveTransport() {
		transportPackage(3, "Zona de Abastecimento [A]", "Zona de Transferencia [Z]", "Caminhão [C]");
	}
	
	/**
	 * Basic Hanoi tower solution
	 * 
	 * @param packagesAmount
	 * @param origin
	 * @param aux
	 * @param dest
	 */
	private void transportPackage(int packagesAmount, String origin, String aux, String dest) {
		if (packagesAmount == 1) {
			System.out.println(origin +"-> "+dest);
		} else {
			transportPackage(packagesAmount -1 , origin, dest, aux);
			System.out.println(origin +"-> "+dest);
			transportPackage(packagesAmount -1, aux, origin, dest);
		}
	}
	

}
