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

        pessoa1.setCodigo(1);
        pessoa1.setNome("Yuri");
        pessoa1.setEndereco("Nova Bréscia");
        pessoa1.setTelefone(982168484);
        pessoa1.setValorConta(500);

        pessoa2.setCodigo(2);
        pessoa2.setNome("Jonas");
        pessoa2.setEndereco("Encantado");
        pessoa2.setTelefone(956832424);
        pessoa2.setValorConta(500);

        
        //Valor a depsitar na conta da pessoa 1
        pessoa2.setDebito(0);
        //Valor a depositar na conta da pessoa2
        pessoa1.setDebito(0);
        
        
        
        if(pessoa2.getDebito() > 0 && pessoa1.getDebito() > 0){
            System.out.println("\n\tERRO!\n\tÉ POSSÍVEL DEPOSITAR EM APENAS UMA CONTA POR VEZ!!!\n");
            System.exit(0);
        }
        if(pessoa1.getDebito() > pessoa1.getValorConta() || pessoa2.getDebito() > pessoa2.getValorConta()){
            System.out.println("\n\tERRO!\n\tO VALOR É MAIOR QUE O TOTAL DA CONTA!!!\n");
            System.exit(0);
        }

            //Debito na conta da pessoa1
            if (pessoa2.getValorConta() > pessoa2.getDebito()) {
                pessoa1.setValorConta(pessoa1.getValorConta() + pessoa2.getDebito());
                pessoa2.setValorConta(pessoa2.getValorConta() - pessoa2.getDebito());
            }
            //Debito na conta da pessoa2
            if (pessoa1.getValorConta() > pessoa1.getDebito()) {
                pessoa2.setValorConta(pessoa2.getValorConta() + pessoa1.getDebito());
                pessoa1.setValorConta(pessoa1.getValorConta() - pessoa1.getDebito());
            }
        
        
        System.out.println(pessoa1);
        System.out.println("-----------------------------------------");
        System.out.println(pessoa2);

        
        
        
        
        
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
