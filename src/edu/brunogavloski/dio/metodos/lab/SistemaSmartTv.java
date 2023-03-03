package edu.brunogavloski.dio.metodos.lab;

import java.util.Scanner;

public class SistemaSmartTv {
		Scanner scan = new Scanner(System.in);
		int canal = 1;
		int volume = 25;
		boolean ligada = false;
		
		public void ligar() {
			ligada = true;
		}
		
		public void desligar() {
			ligada = false;
		}
		
		public void aumentarVolume() {
			volume++;
			System.out.println("O volume atual é: " + volume);
		}
		
		public void dominuirVolume() {
			volume--;
			System.out.println("O volume atual é: " + volume);
		}
		
		public void aumentarCanal() {
			canal++;
			System.out.println("O canal atual é: " + canal);
		}
		
		public void diminuirrCanal() {
			canal--;
			System.out.println("O canal atual é: " + canal);
		}
	
		
		

}
