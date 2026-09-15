interface HeartMonitor {
    void measureheartrate();
}

interface StepCounter{
    void countstep();
}

class SmartWatch implements HeartMonitor, StepCounter{
    public void measureheartrate(){
        System.out.println("72 BPM");
    }

    public void countstep(){
        System.out.println("5000");
    }
}

class Geeks36 {
    public static void main(String[] args) {
        SmartWatch s = new SmartWatch();
        s.measureheartrate();
        s.countstep();
    }
}