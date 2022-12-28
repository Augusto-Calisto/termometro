package view;

import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Temperatura;

@SuppressWarnings({"deprecation", "serial"})
public abstract class TemperaturaView extends JFrame implements Observer {
	protected Temperatura temperatura;
	protected JTextField display;
	
	public TemperaturaView(String label, Temperatura temperatura, int x, int y) {
		this.temperatura = temperatura;
		
		display = new JTextField();
		
		super.setTitle(label);
		
		super.add("North", new JLabel(label));
		
		super.add("Center", display);
								
		this.temperatura.addObserver(this); // Conexao do View com o Model
		
		super.setSize(300, 120);
		
		super.setLocation(x, y);
		
		super.setVisible(true);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public Temperatura getTemperatura() {
		return temperatura;
	}
	
	public double getDisplay() {		
		try {
			return Double.valueOf(display.getText());
		} catch(NumberFormatException e) {
			return 0.0;
		}
	}
	
	public void setDisplay(String texto) {
		this.display.setText(texto);
	}
}