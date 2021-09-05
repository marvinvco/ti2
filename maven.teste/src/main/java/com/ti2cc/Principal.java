package com.ti2cc;
import java.util.*;

public class Principal {
	public static String menu(){
		return "Digite um número de 1 a 5 (1 = Listar, 2 = Inserir, 3 = Excluir, 4 = Atualizar, 5 = Sair): ";
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DAO dao = new DAO();
		
		dao.conectar();
		Carros[] carros = dao.getCarros();
		Carros carro = new Carros(6, "Ranger", "Ford", 2001);
		
		System.out.println(menu());
		int codigo = entrada.nextInt();
		
		//Listar, Inserir, Excluir, Atualizar e Sair
		do {
			if(codigo == 1) {
				//Mostrar carros
				System.out.println("==== Mostrar carros === ");
				carros = dao.getCarros();
				for(int i = 0; i < carros.length; i++) {
					System.out.println(carros[i].toString());
				}
				System.out.println(menu());
				codigo = entrada.nextInt();
			}else if(codigo == 2) {
				//Inserir um elemento na tabela
				if(dao.inserirCarro(carro) == true) {
					System.out.println("Inserção com sucesso -> " + carro.toString());
				}
				System.out.println(menu());
				codigo = entrada.nextInt();
			}else if(codigo == 3) {
				//Excluir carro
				dao.excluirCarro(carro.getCodigo());
				System.out.println(menu());
				codigo = entrada.nextInt();
			}else if(codigo == 4) {
				//Atualizar usuário
				carro.setAno(2000);
				dao.atualizarCarro(carro);
				System.out.println(menu());
				codigo = entrada.nextInt();
			}else if(codigo == 5) {
				System.out.println("Saindo...");
			}
			
		}while(codigo != 5);
		
		entrada.close();
		dao.close();
	}
}