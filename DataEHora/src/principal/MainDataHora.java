package principal;

import modelo.Data;
import modelo.DataHora;
import modelo.Hora;

public class MainDataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data dt1;
		Hora h1;
		DataHora dtH1, dtH2;
		
		dt1 = new Data(14, 12, 2022);
		h1 = new Hora(11, 24, 50);
		
		System.out.println("\nData: "+dt1);
		System.out.println("\nHora: "+h1);
		
		dtH1 = new DataHora(14, 12, 2022, 11, 24, 50);
		System.out.println("\n"+dtH1);
		
		dtH2 = new DataHora(dt1, h1);
		System.out.println("\n"+dtH2);
	}

}
