/*Classe deve ter o mesmo novo do arquivo, por isso chama arquivos java de classe

public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print ("Hello world");

    }

}
*/
// Toda Variavel tem que comecar com letra minuscula 
// usar camelCase
// Variavel que nunca mudar de valor colocar tudo em maiusculo
/*
public class MinhaClasse {
    public static void main (String [] args){
        int ano = 2025;
        ano = 2023;
        final String BR = "Brasil";
        System.out.print(ano, BR);
    }
}
 */
// toda variavel tem que ser declarada: TIPO NOME = ATRIBUICAO (opcional)
/*
public class MinhaClasse {

    public static void main (String [] args){
        String meuNome = "victor";
        int anoFavbricacao= 2022;
        boolean verdade = true;

        anoFavbricacao  = 2018;

    }
}

 */

public class MinhaClasse {

    public static void main (String [] args){
        String primeiroNome = "Victor";
        String segundoNome = "Dias";

        String nomeCompelto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompelto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(segundoNome);
    }
}