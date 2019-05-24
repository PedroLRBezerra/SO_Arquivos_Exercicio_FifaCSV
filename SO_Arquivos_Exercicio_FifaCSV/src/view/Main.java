package view;

import java.io.IOException;

import controller.*;

public class Main {
	public static void main(String[] args) {
		IArquivoscontroller arqCont = new ArquivosController();
		FifaController fifaCtrl =new FifaController();
		
		
		String caminho= "C:\\Users\\LAB202-06\\eclipse-workspace\\SO_Arquivos_Exercicio_FifaCSV\\src";
    	String nome ="data.csv";
    	
    	
    	try {
			fifaCtrl.desempilhaBrasileiros(fifaCtrl.empilhaBrasileiros(caminho, nome));
    		fifaCtrl.buscarListaBonsJovens(fifaCtrl.listaRevelacoes(caminho, nome));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
