package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.ls.LSInput;


public class FifaController implements IFifaController{

	@Override
	public Stack<String> empilhaBrasileiros(String caminho, String nome) throws IOException {
		Stack<String> pilhaBR = new Stack<>();
		ArquivosController arqctr = new ArquivosController();
		BufferedReader buffer = arqctr.leArquivo(caminho, nome);
		String linha =buffer.readLine();
		while(linha !=null) {
			String[] split =linha.split(",");
			if(split[5].equals("Brazil")) {
				pilhaBR.push(linha);
			}
			linha=buffer.readLine();
		}
			
		return pilhaBR;
	}

	@Override
	public void desempilhaBrasileiros(Stack<String> pilha) throws IOException {
		int count = 1;
		while(!pilha.isEmpty()) {
			String linha = pilha.pop();
			String[] split =linha.split(",");
			if(Integer.parseInt(split[7])>80) {
				System.out.println(count +" Nome : "+split[2]+" , "+split[7]+" OVR");
				count++;
			}
		}
		
	}

	@Override
	public List<String> listaRevelacoes(String caminho, String nome) throws IOException {
		List<String> listRev=new LinkedList<String>();
		ArquivosController arqctr = new ArquivosController();
		BufferedReader buffer = arqctr.leArquivo(caminho, nome);
		String linha =buffer.readLine();
		linha=buffer.readLine();
		while(linha !=null) {
			String[] split =linha.split(",");
			if(Integer.parseInt(split[3])<=20) {
				listRev.add(linha);
			}
			linha=buffer.readLine();
		}
		
		
		return listRev;
	}

	@Override
	public void buscarListaBonsJovens(List<String> lista) throws IOException {
		int count =1;
		for (String linha : lista) {
			String[] split =linha.split(",");
			if(Integer.parseInt(split[7])>80) {
				System.out.println(count +" Nome : "+split[2]+" , "+split[7]+" OVR");
				count++;
			}
			
		}
		
	}

}
