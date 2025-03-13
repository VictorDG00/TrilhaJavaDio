/*
 * Caracteres que existem para validar os dois lados da operacao
 * x == y valida se x e igual a y Igual
 * x != y valida se x e diferente de y Diferente
 * x > y valida se x e maior que y Maior que 
 * x < y valida se x e menor que y Menor que 
 * x >= y valida se X e maior ou igual a y Maior ou igual
 * x <= y valida se X e menor ou igual a y Menor ou igual
 */
public class Operadores3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        boolean simNao = num1 == num2;
        System.out.println(simNao);
        simNao = num1 != num2;
        System.out.println(simNao);
        simNao = num1 > num2;
        System.out.println(simNao);
        simNao = num1 < num2;
        System.out.println(simNao);
        simNao = num1 >= num2;
        System.out.println(simNao);
        simNao = num1 <= num2;
        System.out.println(simNao);
        letras(args);

    }  
    public static void Relacionais(String[] args) {
        int num1 = 2;
        int num2 = 2;
        if(num1 == num2){
            System.out.println("e igual meu chapa");
        } else{
            System.out.println("nao e igual meu chapa");
        }
    } 
    public static void letras(String[] args) {
        String nomeUm = "victor";
        String nomeDois = "victor";

        System.out.println(nomeUm==nomeDois);

        
    }
}
