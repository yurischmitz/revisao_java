/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates;

import java.util.Random;

/**
 *
 * @author yuri.schmitz
 */
public class RevisaoJava {

    //método de inicialização da classe
    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor básico
        //Exige importação da classe java.util.Random
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios entre 0 e 5
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(5) + 1);
        }

        System.out.println("Olá Mundo");
        int resultado = Funcoes.somarNumeros(1, 2);
        System.out.println("Resultado = " + resultado);
        
        //criamos uma instância de Funcoes
        Funcoes func = new Funcoes();
        resultado = func.subtrairNumeros(4, 1);
        System.out.println("Resultado = " + resultado);
        
        imprimirMensagem("TESTE 1");
        imprimirMensagem("TESTE 2");
        imprimirMensagem("TESTE 3");
        
        for(int i = 0; i <10; i++){
            System.out.println("valor de i = " + i);
        }
        
        int x = 15;
        while( x < 18 ){
            System.out.println("Sem permissão!!!");
            x++;
        }
        
        int[] numeros = {1,2,3};
        System.out.println("ENCHANCED FOR");
        for(int var : numeros){
            System.out.println(var);
        }
        
        System.out.println("FOR COMUM");
        for(int var = 0; var < numeros.length; var++){
            System.out.println(numeros[var]);
        }
        
        int[] numeros_array = {2,2,1};
        int res_soma = Funcoes.somarNumeros(numeros_array);
        System.out.println("RESULTADO DA SOMA = " + res_soma);
        
        int res_mul = Funcoes.multiplicaNumeros(numeros_array);
        System.out.println("RESULTADO DA MULTIPLICAÇÃO = " + res_mul);
        
        double res_div = Funcoes.divideNumeros(numeros_array);
        System.out.println("RESULTADO DA DIVISAO = " + res_div);
        
        int res_sub = Funcoes.subtraiNumeros(numeros_array);
        System.out.println("RESULTADO DA SUBTRACAO = " + res_sub);
        
        System.out.println();//linha em branco
        System.out.println();//linha em branco
        System.out.println();//linha em branco
        String sorteio = Funcoes.sortearNumeros(6, 60);
        System.out.println("SORTEIO = " + sorteio);
        
    }
    
    public static void imprimirMensagem(String par1){
        System.out.println();
    }

}
