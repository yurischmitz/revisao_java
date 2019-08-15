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

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
         
         
        pessoa1.setNome("Yuri");
        pessoa1.setSaldo(1000);
        pessoa1.setDebito(0);
         
        pessoa2.setNome("Cris");
        pessoa2.setSaldo(1000);
        pessoa2.setDebito(200);
         
        if(pessoa1.getDebito() > 0 && pessoa2.getDebito() > 0){
            System.out.println("\n\n\t\t\tVOCÊ ESTÁ TENTANDO TRANSFERIR PARA DUAS CONTAS AO MESMO TEMPO\n\n");
        } else {
            if(pessoa2.getSaldo() >= pessoa2.getDebito() && pessoa2.getDebito() > 0){
              //depositando para o Yuri
              pessoa1.setSaldo(pessoa1.getSaldo() + pessoa2.getDebito());//DEPOSITANDO
              pessoa1.setRecebeu(pessoa2.getDebito());//DIZENDO QUANDO RECEBEU
              pessoa2.setSaldo(pessoa2.getSaldo() - pessoa2.getDebito());//TIRANDO O VALOR DA OUTRA PESSOA
              System.out.println(pessoa1);
              System.out.println(pessoa2);
           } else if(pessoa2.getDebito() > pessoa2.getSaldo()){
               System.out.println("\n\nVALOR MUITO ALTO\n\n");
           }

           if(pessoa1.getSaldo() >= pessoa1.getDebito()&& pessoa1.getDebito() > 0){
              //DEPOSITANDO PARA A CRIS
              pessoa2.setSaldo(pessoa2.getSaldo() + pessoa1.getDebito());//DEPOSITANDO
              pessoa2.setRecebeu(pessoa1.getDebito());//DIZENDO QUANDO RECEBEU
              pessoa1.setSaldo(pessoa1.getSaldo() - pessoa1.getDebito());//TIRANDO O VALOR DA OUTRA PESSOA
              System.out.println(pessoa1);
              System.out.println(pessoa2);
           } else if(pessoa1.getDebito() > pessoa1.getSaldo()){
               System.out.println("\n\nVALOR MUITO ALTO\n\n");
           }
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
}
