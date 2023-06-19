package projetoVeiculo;

import javax.swing.JOptionPane;

public class Acelerar {
		public static void main (String args[]) {
			
		
	int veloMax =180,soma=0, acelerar=0;
	
	while(soma < veloMax) {
		 acelerar = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto você deseja acelerar ?"));
	
	soma += acelerar;
	
	if(soma > veloMax) {
		JOptionPane.showMessageDialog(null, "Você não pode acelerar "+acelerar+ " kms pois ira ultrapassar a velocidade maxima de seu carro "+veloMax);
		break;
	}
		JOptionPane.showMessageDialog(null, "Seu carro acelerou "+acelerar+" a velocidade é de "+soma);
		
		
		String continua = JOptionPane.showInputDialog(null, "Deseja continuar acelerando ? \n"
														+ "(s/n)");
	
	if(continua.equals("s")){		
	
	}else if(continua.equals("n")) {
		break;
	}
	
	
	
	}
}
}