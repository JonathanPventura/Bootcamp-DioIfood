// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class Main {

    public static void main(String[] args) {

      int  N;

        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
         int soma = 0;
        for (int i = N; i >= 0; i--) {
            soma = soma + i;
        }

        System.out.println(soma);
    }
}
