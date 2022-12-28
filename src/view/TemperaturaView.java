package view;

import java.util.Observer;

import javax.swing.JFrame;

import model.Temperatura;

@SuppressWarnings({"deprecation", "serial"})
public abstract class TemperaturaView extends JFrame implements Observer {
	protected Temperatura temperatura;
	
	public TemperaturaView(String label, Temperatura temperatura, int x, int y) {
		this.temperatura = temperatura;
				
		super.setTitle(label);
												
		this.temperatura.addObserver(this); // Conexao do View com o Model
		
		super.setSize(300, 120);
		
		super.setLocation(x, y);
		
		super.setVisible(true);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public Temperatura getTemperatura() {
		return temperatura;
	}
}