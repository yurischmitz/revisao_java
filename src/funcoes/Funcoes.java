/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yuris
 */
public class Funcoes {
    public static void mostrarMensagem(String mensagem){
        try{
            JOptionPane.showMessageDialog(null, mensagem);
            
        }catch(Exception ex){
            
        }
    }
    /*
        modificador de acesso (public, private)
        public = torna o método disponível para todo o projeto
        static = Não faz-se necessário instanciar a classe para utilizar o método/função
        int = é o retorno do método (void = método sem retorno)
        somarNumeros = nome do método
    */
    public static int somarNumeros(int valor1, int valor2){
        int resultado = valor1 + valor2;
          
        return resultado;
    }
    
    //Somar números de um array de inteiros
    public static int somarNumeros(int[] numeros){
        int resultado = 0;
        for(int var : numeros){
            resultado += var;
        }
        return resultado;
    }
    
    public static int multiplicaNumeros(int[] numeros){
        int resultado = 1;
        for(int var : numeros){
            resultado *= var;
        }
        return resultado;
    }
    
    public static double divideNumeros(int[] vetor){
        double resultado = vetor[0];
        for(int x = 1; x < vetor.length; x++){
            resultado /= vetor[x];
        }
        return resultado;
    }
    
    public static int subtraiNumeros(int[] vetor){
        int resultado = vetor[0];
        for(int x = 1; x < vetor.length; x++){
            resultado -= vetor[x];
        }
        return resultado;
    }
    
    public int subtrairNumeros(int valor1, int valor2){
        int resultado = valor1 - valor2;
        return resultado;
    }
    
    public static int sortearNumero(int maximo){
        
        Random aleatorio = new Random();
        return aleatorio.nextInt(maximo) + 1;
    }
    
    public static String sortearNumeros(int quantidade, int maximo){
        String resultado = "";
        int numero = 0;
        Random aleatorio = new Random();
        for(int i = 0; i < quantidade; i++){
            //numero = (int) (Math.random() * maximo) + 1;
            numero = aleatorio.nextInt(maximo) + 1;
            resultado += numero + ",";
        }
        
        //a linha de código a seguir remove a última virgula da String
        resultado = resultado.substring(0, resultado.length() - 1);
        return resultado;
    }
    
    public static boolean validarNumero(String numero){
        try{
            if(numero.matches("[0-9].*")){
                return true;
            }else{
                return false;
            }
            
            
        }catch(Exception ex){
            return false;
        }
    }
    
}
