package com.ti2cc;

public class Carros {
	private int codigo;
	private String nome;
	private String marca;
	private int ano;
	
	public Carros() {
		this.codigo = -1;
		this.nome = "";
		this.marca = "";
		this.ano = -1;
	}
	
	public Carros(int codigo, String nome, String marca, int ano) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", nome=" + nome + ", marca=" + marca + ", ano=" + ano + "]";
	}	
}
