package ex_1031.ex;

public class Television implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
