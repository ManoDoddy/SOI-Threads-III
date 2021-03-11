package view;

import controller.ThreadController;

public class Main {
	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			Thread t = new ThreadController(matriz[i], i);
			t.start();
		}
		
	}
}
