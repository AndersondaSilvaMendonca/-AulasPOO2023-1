
public class Pessoa {
	private String nome;
	private int idade;
	
	
	//Construtor que imprimi somente  o nome
	public Pessoa(String nome) {
		this.nome = nome;
		this.idade = -1; // valor negativo para indicar que a idade não está definida
		
		
	}
	
	//construtor que imprimi somente idade
	public Pessoa(int idade) {
		this.nome = ""; // define o nome como uma string vazia para o construtor com apenas a idade
		this.idade = idade; 
		
	}
	
	//Construtor que imprimi  o nome e a idade
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
		
	}
	public void apresentarPessoa() {
		
		if(!nome.isEmpty()){
				System.out.println("Nome: " + this.nome + ", ");
				}
		if(idade >=0) {
			System.out.println("Idade: " + this.idade + " anos.");
		}

	
		}
		
	}
	
	
	


