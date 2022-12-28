package view;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Observable;

import org.jfree.chart.plot.JThermometer;

import model.Temperatura;

@SuppressWarnings({"serial", "deprecation" })
public class GraficoFahrenheitView extends TemperaturaView {
	private JThermometer termometro = new JThermometer();

	public GraficoFahrenheitView(Temperatura temperatura, int x, int y) {
		super("Grafico - Temperatura", temperatura, x, y);
		
		termometro.setValue(this.temperatura.getTemperaturaFahrenheit());
		
		termometro.setOutlinePaint(null);
				
		termometro.setUnits(0);
		
		termometro.setForeground(Color.BLUE);
		
		termometro.setBackground(Color.WHITE);
		
		termometro.setRange(0.0, 400.0); // Range
			
		termometro.setSubrangeInfo(0, 0.0, 000.0);
		
		termometro.setSubrangeInfo(1, 0.0, 000.0);	
		
		termometro.setSubrangeInfo(2, 0.0, 392.0);
		
		termometro.addSubtitle("Temperatura em Fahrenheit", new Font("SansSerif", Font.PLAIN, 12));
		
		termometro.setValueFormat(new DecimalFormat("#0"));
		
		super.add("Center", termometro);
		
		super.setSize(500, 300);
		
		super.setResizable(false);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		termometro.setValue(this.temperatura.getTemperaturaFahrenheit());
	}
}