public class usuario {
    public static void main(String[] args) {
        smartTv smarTv = new smartTv();

        System.out.println("A TV esta ligada? " + smarTv.ligada);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("A TV esta ligada? " + smarTv.ligada);
        smarTv.desligar();
        System.out.println("A TV esta ligada? " + smarTv.ligada);
        smarTv.volumeUp();
        smarTv.volumeUp();
        smarTv.volumeUp();
        smarTv.volumeUp();
        System.out.println("Volume: " + smarTv.volume);

    }
}
