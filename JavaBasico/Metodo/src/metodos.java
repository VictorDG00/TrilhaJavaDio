/* Convencoes
 *  Metodo precisa ser um verbo, camelCase, metodos so tem uma responsabilidade, java nao tem metodos globais, todos os metodos ficam no escopo de uma classe.
 * Metodos com void nao tem retorno, metodos com tipo de variavel tem retorno
 * privado so pode ser visto pela classe que foi criado, public pode ser visto por outras classes que importarem informacao de outro codigo
 */
public class metodos {
    public static void main(String[] args) {
        somar(2,3);
    }
    public double somar (int num1, int num2){
        double resultado = num1 + num2;
        System.out.println(resultado);
        return(resultado);
    }
    public void imprimir(String text){
        System.out.println("pao de batata");
    }
//   public double dividir(int dividendo, int divisor)throws Exception{}
    
}
