/*
 * Atribuicacao "=" da um valor de uma variavel
 * Soma "+" Subtracao "-" Multiplicacao "*" Divisao "/"
 * Modulo (resto da divisao) "%"
 * Soma "+" utilizado com texto vira concatenacao
 * Unarios "+" Negacao "-" Incremento "++" Decremmento "--" 
 */
public class Operadores {
     public static void main(String[] args) {
        String nomeCompleto = "linguagem" + "java";
        System.out.println(nomeCompleto);
        Incremento(args);
     }
     public static void unario(String[] args) {
        int numero = 5;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        numero = + numero;
        System.out.println(numero);
        numero = numero* -1;
        System.out.println(numero);

     }
     public static void Incremento(String[] args){
        int numero = 5;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        int numerosub = 4;
        System.out.println(numerosub);
        numerosub--;
        System.out.println(numerosub);

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);
     }
}
