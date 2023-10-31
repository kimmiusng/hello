package ex_1031;

public class Execute {
    public static void main(String[] args) {
        // 인터페이스는 구현 객체가 있어야 한다.
        RemoteControl rc = new SmartTelevision();
        //rc는 애초에 new ___로 태어났다! 라고 생각
        //rc의 근본은 SmartTelevision

        Searchable s = new SmartTelevision();
        s.search("www");

//        Television tv = new Television();
//        >> 당연히 가능하지만 인터페이스의 다형성을 구현하지 못함
//        >> 추후에 구현 객체들이 많아지면 다형성의 위대함을 알게된다고함!!!
//        >> 추후에 Television, Audio,,,등등 new _____에 넣어주기만하면 구현이 가능

        // Television이 RemoteControl의 구현 객체이기 때문에
        // 자동형변환이 가능하다.  > 인터페이스의 다형성

        rc.turnOn();
        rc.setVolume(100);
        rc.turnOff();

        //rc로 search를 검색하고 싶을때

        ((Searchable)rc).search("www.naver.com"); //강제형변환

    }
}




