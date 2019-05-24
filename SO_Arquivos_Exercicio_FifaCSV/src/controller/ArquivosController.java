package controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ArquivosController implements IArquivoscontroller{


	@Override	
	public BufferedReader leArquivo(String caminho, String nome) throws IOException {
             File arq =new File(caminho ,nome);
             if(arq.isFile() && arq.exists()) {
            	FileInputStream fluxo = new FileInputStream(arq); 
            	InputStreamReader leitor = new InputStreamReader(fluxo);
            	BufferedReader buffer = new BufferedReader(leitor);            	
            	return buffer;
            
             }
             else {
            	 throw new IOException("Arquivo inválido");
             }
	}

	}
