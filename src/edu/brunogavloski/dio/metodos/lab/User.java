package edu.brunogavloski.dio.metodos.lab;



public class User {

	public static void main(String[] args) {
		SistemaSmartTv  sistemaSmartT = new SistemaSmartTv();
		
		
		
		sistemaSmartT.dominuirVolume();
		sistemaSmartT.dominuirVolume();
		sistemaSmartT.dominuirVolume();
		sistemaSmartT.dominuirVolume();
		sistemaSmartT.dominuirVolume();
		
		System.out.println("A tv esta: " + sistemaSmartT.ligada);
		System.out.println("O volume atual: " + sistemaSmartT.volume);
		System.out.println("O canal atual: " + sistemaSmartT.canal);
		
		
		sistemaSmartT.ligar();
		System.out.println("Novo status: ligado " + sistemaSmartT.ligada);
		
		sistemaSmartT.desligar();
		System.out.println("Novo status: ligado " + sistemaSmartT.ligada);

		sistemaSmartT.aumentarVolume();
		
		sistemaSmartT.trocarCanal();
		
		
		
		
		
	}

}
