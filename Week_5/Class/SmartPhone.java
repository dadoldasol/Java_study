package javaunittest;

public class SmartPhone {
    static String company = "Samsung";

    String model = "S21";
    String numbers = "010-0000-0000";

    int battery = 100;

    public SmartPhone(String model, String numbers) {
        this.model = model;
        this.numbers = numbers;
    }

    String getModel(){
        return this.model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getNumbers() {
        return this.numbers;
    }

    void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    void Call(String call_num) {
        System.out.println("Calling to .... " + call_num);
    }

    void ReadPhoneNumbers(int ... phonenumbers) {
        for(int num=0;num<phonenumbers.length;num++) {
            System.out.println(phonenumbers[num]);
        }
    }
}
