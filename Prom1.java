import java.util.Scanner; // Importação do scanner

public class Prom1{ // Iniciação da classe
     public static void main(String[] args){ // Iniciciação do método main
           int idade; // Declaração de variável do tipo inteiro
           String nome; // Declaração de tipo String
           String cpf; // Declaração de tipo String

 
           Scanner scanner = new Scanner(System.in); // Criação e instanciação do Scanner
          
           System.out.println("Qual a sua idade?: "); // Entrada de dados
           idade = scanner.nextInt(); // Traduz os dados inseridos pelo teclado
           scanner.nextLine(); // Ignora o enter 
        
           System.out.println("Qual o seu nome?: "); // Entrada de dados
           nome = scanner.nextLine(); // Traduz os dados inseridos pelo teclado

         
           System.out.println("Qual o seu CPF?: "); // Entrada de dados
           cpf = scanner.nextLine();// Traduz os dados inseridos pelo teclado
          
scanner.close(); // Fecha o scanner
      
      // Printa a saída de dados na tela
      System.out.println(" ");
      System.out.println("Idade:" + idade);
      System.out.println("Nome:" + nome);
      System.out.println("CPF:" + cpf);
 
       }
}






    
    