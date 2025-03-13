/*
 * && and 
 * || or
 */
public class Operadores4 {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 &&  ( 7 > 3)){
            System.out.println("verdade pacas");
        } 
        if(condicao1 || condicao2){
            System.out.println("uma delas e verdade");
        }
    }
}
