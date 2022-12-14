package modelo;

public class DataHora {
	private Data dt;
	private Hora h;
	
	public DataHora() {
		
	}
	
	public DataHora(int d, int m, int a, int h, int min, int s) {
		this.dt = new Data(d, m, a);
		this.h = new Hora(h, min, s);
	}

	//OPÇÃO 1
	public DataHora(int d, int m, int a) {
		this.dt = new Data(d, m, a);
		this.h = new Hora();
	}
	
	//OPÇÃO 2
	public DataHora(Data d, Hora h) {
		this.dt = d;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Hora "+h+" do dia "+dt;
	}	
}
