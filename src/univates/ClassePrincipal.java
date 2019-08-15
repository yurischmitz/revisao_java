/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package univates;

/**
 *
 * @author yuri.schmitz
 */
public class ClassePrincipal {

    public static void main(String[] args) {

        //método de inicialização da classe        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        pessoa1.setNome("Juca");
        pessoa1.setValorConta(1000);
        pessoa1.setChequeEspecial(200);
        
        pessoa2.setCodigo(2);
        pessoa2.setNome("João");
        pessoa2.setValorConta(1000);
        pessoa2.setChequeEspecial(200);
        
        System.out.println("Saldo Inicial:");
        System.out.println(pessoa1);
        System.out.println("-------------------");
        System.out.println(pessoa2);
        System.out.println("-------------------");
        
        double valorTransferencia = 0;
        System.out.println("Valor da Transferência: R$ " + valorTransferencia);
        
        if(pessoa1.credito(valorTransferencia) == true){
            pessoa2.debito(valorTransferencia);
        }
        
        System.out.println("Saldo Final:");
        System.out.println(pessoa1);
        System.out.println("-------------------");
        System.out.println(pessoa2);
        System.out.println("-------------------");
        
        valorTransferencia = 1200;
        System.out.println("Valor da Transferência: R$ " + valorTransferencia);
        if(pessoa2.credito(valorTransferencia) == true){
            pessoa1.debito(valorTransferencia);
        }
        System.out.println("Saldo Final:");
        System.out.println(pessoa1);
        System.out.println("-------------------");
        System.out.println(pessoa2);
        System.out.println("-------------------");
        }
        
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
