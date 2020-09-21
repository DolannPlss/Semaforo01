package main;

import java.util.concurrent.Semaphore;

import controller.ThreadCorrida;

public class Principal {
	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int idCorredor = 0; idCorredor < 4; idCorredor++) {
			Thread tCorrida = new ThreadCorrida(semaforo, idCorredor);
			tCorrida.start();
		}
	}
}
