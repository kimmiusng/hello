package ex_1026;

public class Account {
    // 필드
    private String account; // 계좌번호
    private String name; // 소유자
    private int deposit; // 잔고

    //생성자 생성
    public Account(String account, String name, int deposit){
        this.account = account;
        this.name = name;
        this.deposit = deposit;
    }

    //메소드
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void deposit(int amount){
        this.deposit += amount;
    }

}
