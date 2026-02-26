package br.com.fiapride.main;

// Importamos a classe Passageiro e Sofa para que o sistema a reconheça
//import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Sofa;

public class SistemaPrincipal {
	public static void main(String[] args) {
//        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ana Silva";
//        passageiro1.saldo = 50.0;
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
    	Sofa meusofa = new Sofa();
    	meusofa.textura = "macio";
    	meusofa.material = "madeira";

    	Sofa sofaDoProfessor = new Sofa();
    	sofaDoProfessor.textura = "liso";
    	sofaDoProfessor.material = "algodão";
    	System.out.println("Meu sofá é: " + meusofa.textura);
    	System.out.println("A do professor é: " + meusofa.textura);
    }
}
