package controller;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

public interface IFifaController {

	public Stack<String>empilhaBrasileiros(String caminho,String nome) throws IOException;
	public void desempilhaBrasileiros(Stack<String> pilha) throws IOException;
	public List<String>listaRevelacoes(String caminho,String nome)throws IOException;
	public void buscarListaBonsJovens(List<String> lista)throws IOException;
	
	
	
}
