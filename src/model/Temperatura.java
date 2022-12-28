package model;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Temperatura extends Observable {
	private double temperaturaCelsius = 0;
	
	public double getTemperaturaCelsius() {
		return Math.round((getTemperaturaFahrenheit() - 32.0) * 5.0 / 9.0);
	}
	
	public double getTemperaturaFahrenheit() {
		return temperaturaCelsius * 9.0 / 5.0 + 32;
	}
	
	public void setTemperaturaCelsius(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
		super.setChanged();
		super.notifyObservers();
	}

	public double getTemperaturaKelvin() {
		return temperaturaCelsius + 273.15;
	}
	
	
	
	

	/* private double temperaturaFahrenheit = 32.0;
	
	public double getTemperaturaFahrenheit() {
		return temperaturaFahrenheit;
	}
	
	public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
		super.setChanged();
		super.notifyObservers();
	}
	
	public double getTemperaturaCelsius() {
		return Math.round((temperaturaFahrenheit - 32.0) * 5.0 / 9.0);
	}
	
	public void setTemperaturaCelsius(double temperaturaCelsius) {
		temperaturaFahrenheit = Math.round(temperaturaCelsius * 9.0 / 5.0 + 32.0);
		super.setChanged();
		super.notifyObservers();
	}*/
}