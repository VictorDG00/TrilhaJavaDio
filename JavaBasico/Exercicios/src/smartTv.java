public class smartTv{

    boolean ligada= false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void volumeUp(){
        volume++;
    }
    public void volumeDown(){
        volume--;
    }
    public void canalUp(){
        canal++;
    }
    public void CanalDown(){
        canal--;
    }
    public void canal(int x){
        canal = x;
    }


}
