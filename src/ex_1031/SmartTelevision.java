package ex_1031;

public class SmartTelevision implements RemoteControl, Searchable {

    //기존의 상속은 하나의 부모만 상속이 가능했으나
    //인터페이스는 다중구현이 가능함
    //대신 반드시 오버라이딩을 해주어야함


    private int volume;


    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
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

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");

    }
}
