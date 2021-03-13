package InheritancePractice;

public class SmartPhone extends Phone{

    public SmartPhone(String owner) {
        super(owner);
    }

    public void connectInternet() {
        System.out.println("인터넷 접속 중입니다..");
    }

    @Override
    public void ring() {
        System.out.println("벨이 울립니다.");
    }

    
}
