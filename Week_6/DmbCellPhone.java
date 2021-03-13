package InheritancePractice;

public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel) {
        super(model, color);
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    @Override
    void powerOn() {
        if(model.equals("자바폰")) {
            super.powerOn();
        }
        else
            System.out.println("DmbCellphone 전원을 켭니다...");
    }

    void turnOnDmb() {
        System.out.println("채널 : " + channel + "번 방송 수신 시작합니다.");
    }
}
