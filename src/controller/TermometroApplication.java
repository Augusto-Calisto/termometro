package controller;

import java.util.Random;

import model.Temperatura;
import view.GraficoFahrenheitView;
import view.GraficoKelvinView;
import view.GraficoCelsiusView;

public class TermometroApplication {
	public static void main(String[] args) {
		Temperatura temperatura = new Temperatura();
		
		new GraficoCelsiusView(temperatura, 50, 50);
		
		new GraficoFahrenheitView(temperatura, 550, 50);
		
		new GraficoKelvinView(temperatura, 380, 350);

		Random random = new Random();
		
		while(true) {
			try {
				Thread.sleep(500);
				temperatura.setTemperaturaCelsius(random.nextInt(200));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}