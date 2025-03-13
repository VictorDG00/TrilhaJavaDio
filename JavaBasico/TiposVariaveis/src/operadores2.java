/*
 *  Ternario e uma forma de escrever if else em uma linha
 * Condicao "?"(executa se for verade) ":"(executa se nao for verdade)
 * int resultado = a==b if true "texto" else "texto"
 * int resultado = a==b ?"texto" : "texto"
 * o valor tem que condizer com o tipo de variavel
 */
public class operadores2 {
    public static void main(String[] args) {
        int a, b;

        a = 4;
        b = 4;

        String resultado= "";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);
        System.out.println("vamos chamar os ternarios agora");
        Ternario(args);
    }
    public static void Ternario(String[] args) {
        int a, b;

        a = 4;
        b = 3;

        String resultado = a==b ?"Verdadeiro" : "falso";
        
        System.out.println(resultado);
    }
}
