package controller;

public class ThreadController extends Thread{
	
	private int[] vetor;
	private int linha;
	
	public ThreadController(int[] vetor, int linha) {
		this.vetor = vetor;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		somarLinha();
	}

	private void somarLinha() {
		int result =0;
		for (int i : vetor) {
			result += i;
		}
		System.out.println("Linha #"+linha+" - Resultado = "+result);
	}
}
