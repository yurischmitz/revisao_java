
/**
 *
 * @author yuri.schmitz
 */
public class ClassePrincipal {

    public static void main(String[] args) {
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
}
