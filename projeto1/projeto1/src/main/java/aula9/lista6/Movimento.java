package aula9.lista6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
	
	private LocalDate data;
	private LocalTime hora;
	private double valor;
	private TipoMovimento tipo;
	
	
	public Movimento(LocalDate data, LocalTime hora, double valor) {
		setData(data);
		setHora(hora);
		setValor(valor);
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
