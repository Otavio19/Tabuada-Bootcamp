/* 
     Esse algoritmo tem a função de executar a tabuada que o usuário escolher
*/

package tabuada;

import java.util.Scanner;

public class Tabuada {
    
    static void TabuadaDo(int numero){
        int contador = 0;
        int resultado;
        
        do{
             resultado = numero * contador;
             System.out.println(numero+" X "+contador + " = " + resultado);
             contador++;
        }while(contador <=10);
    }

    public static void main(String[] args) {
        int numero, resposta;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Código criado por Otávio Afonso");
        System.out.println("###############################");
        
        for(int i = 0; i <=3 ; i++){
            
            System.out.println("Qual tabuada deseja executar?");
        
            numero = ler.nextInt();
            TabuadaDo(numero);
            System.out.println("#################");
            System.out.println("Deseja continuar? \n 1 - Sim \n 2 - Não");
            resposta = ler.nextInt();
            switch(resposta){
                case 1:
                    i=0;
                break;
                
                case 2:
                    i=4;
                break;
                
            }
        }
        System.out.println("#############################");
        System.out.println("Obrigado por usar meu código!");
        
    }
    
}
