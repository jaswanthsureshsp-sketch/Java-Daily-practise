interface GamingDevice{
    void powerOn();
}

interface Console extends GamingDevice{
    void playGame();
}
class PlayStation implements Console {

    public void powerOn() {
        System.out.println("Gaming Device Powered on");
    }
    public void playGame(){
        System.out.println("Game Started ");
    }
}

class Geeks38 {
    public static void main(String[] args) {
        PlayStation P = new PlayStation();
        P.powerOn();
        P.playGame();
    }
}