package ex_1031;

public class Television implements RemoteControl {
    //implemets
    //추상메서드이기때문에 오버라이딩은 강제로 작성해야함!!

    private int volume = 0; //인스턴트 필드

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");

    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;

        }
        System.out.println("현재 TV의 볼륨은 " + this.volume);
    }
}

