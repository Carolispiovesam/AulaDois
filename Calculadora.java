import java.util.Scanner; // Importação do scanner


public class Calculadora{ // Iniciação da classe

     public static void main(String[] args){ // Iniciciação do método main

           double primeironum, segundonum, resultado = 0; // Declaração de variável do tipo double
           int operador; // Declaração de variável do tipo inteiro


  Scanner scanner = new Scanner(System.in); // Criação e instanciação do Scanner
          
           System.out.println("Digite o primeiro número: "); // Entrada de dados
           primeironum = scanner.nextDouble(); // Traduz os dados inseridos pelo teclado
           scanner.nextLine(); // Ignora o enter 
        
           System.out.println("Digite o segundo número: "); // Entrada de dados
           segundonum = scanner.nextDouble(); // Traduz os dados inseridos pelo teclado
           scanner.nextLine(); // Ignora o enter 
         
           System.out.println("Digite o operador (1 para Adicao; 2 para Subtracao; 3 para Multiplicacao; 4 para Divisao): "); // Entrada de dados
           operador = scanner.nextInt(); // Traduz os dados inseridos pelo teclado
           scanner.nextLine(); // Ignora o enter 

scanner.close(); // Fecha o scanner

               // Blocos condicionais de if else para os operadores
               if (operador == 1){
               resultado = (primeironum + segundonum);
               }

               else if (operador == 2){
               resultado = (primeironum - segundonum);
               }

               else if (operador == 3){
               resultado = (primeironum * segundonum);
               }

               else if (operador == 4){
               resultado = (primeironum / segundonum);
               }
            
               else {
               System.out.println("Nenhum operador digitado!");
               }
      
      System.out.println("Resultado:" + resultado); // Printa a saída de dados na tela
      
 
       }
}

 
        
