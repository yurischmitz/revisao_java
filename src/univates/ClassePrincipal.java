/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

/**
 *
 * @author yuri.schmitz
 */
public class ClassePrincipal {
    
    public static void main(String[] args) {
        
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    
    pessoa1.setCodigo(1);
    pessoa1.setNome("Yuri");
    pessoa1.setEndereco("Lajeado");
    pessoa1.setTelefone("956835642");
    
        System.out.println("Código: " + pessoa1.getCodigo() +
                "\nNome: " + pessoa1.getNome() +
                "\nEndereço: " + pessoa1.getEndereco() + "\nTelefone: " + pessoa1.getTelefone());
        
    pessoa2.setCodigo(2);
    pessoa2.setNome("Jonas");
    pessoa2.setEndereco("Encantado");
    pessoa2.setTelefone("956832424");
    
        System.out.println("\nCódigo: " + pessoa2.getCodigo() +
                "\nNome: " + pessoa2.getNome() +
                "\nEndereço: " + pessoa2.getEndereco() + 
                "\nTelefone: " + pessoa2.getTelefone());
        
        
        
        
        
        
        
        /*
        soma(2, 3);//imprima o resultado na tela
        subtrai(3, 3);//mesma coisa
        
        //teste condicional
        String var1 = "JUCA";
        String var2 = "Juca";
        
        //equalsIgnoreCase = compara texto ignorado CaseSensitive
        //! = Diferente, ou seja, o resultado vai dar ao contrário do que era pra ser
        if(!var1.equalsIgnoreCase(var2)){
            System.out.println("\nVERDADEIRO\n");
        }else{
            System.out.println("\nFALSO\n");
        }
        
        //3 laços de repetição
        for(int i = 0; i <= 10; i++){
            System.out.println("Valor de i =" + i);
        }
        //2
        int i = 0;
        while(i < 18){
            System.out.println(i + " menor que 18");
            i += 1;
        }
        //3
        i = 0;
        do{ //ele executa pelo menos a primeira vez
            System.out.println(i + " menor que 18");
            i += 1;
        }while(i < 18);
   
    }

    public static void soma(int n1, int n2) {
        int soma = n1 + n2;
        System.out.println("Soma de dois números: " + soma);

    }

    public static void subtrai(int n1, int n2) {
        int subtrai = n1 - n2;
        System.out.println("Subtração de dois números: " + subtrai);
    }
    */
}
}