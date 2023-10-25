package ex_1024;

public class Basic {
    public static void main(String[] args) {

        // 참조 타입
        String[] players1 = {"이강인", "손흥민", "황희찬"};
        String[] players2 = players1;  // 값을 복사 x, 주소(참조) 복사


        players2 = new String[players1.length];
        //직접 요소에 접근해서 하나씩 복사
        for (int i = 0; i < players2.length; i++) {
            players2[i] = players1[i];
        }
        players2[1] = "박지성";

        // System.arraycopy
//        System.arraycopy();

//        System.out.println(players1[1]); // 손흥민
//        System.out.println(players2[1]); // 손흥민
//
//        players2[1] = "박지성";
        System.out.println(players2[1]); // 박지성
        System.out.println(players1[1]); // 박지성

        System.out.println();

        // 향상된 for문
        for (String player : players2) {   // player 이름은 원하는 타입명으로 지정가능
            System.out.println(player);
        }

        System.out.println();
        String [] Seasons1 = {"봄", "여름", "가을", "겨울"};
        String [] Seasons2 = Seasons1;

        Seasons2 = new String[Seasons1.length];
        for (int i = 0; i < Seasons2.length; i++){
            Seasons2[i] = Seasons1[i];
        }

        Seasons2[1] = "Summer";

        System.out.println(Seasons1[1]);
        System.out.println(Seasons2[1]);

        System.out.println();

        for (String firSeaseon : Seasons1) {
            System.out.print(firSeaseon);
        }
        System.out.println();

        for (String secSeason : Seasons2) {
            System.out.print(secSeason);
        }




    }
}
