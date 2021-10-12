import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;

//Phone
//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона
//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать
public class first {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone(10, 0, 300);
        samsung.sendMessage("aksjhdgldjhfgljsdhf");
        samsung.serialNumber = 348759384;
        samsung.model = 98798798;
        samsung.weight = 98.64563;
        samsung.return_();
        samsung.receiveCall(453634563);

        BabushkaPhone nokia = new BabushkaPhone(100, 400, "be live");
        nokia.serialNumber = 348759384;
        nokia.model = 98798798;
        nokia.weight = 98.64563;
        nokia.RETURN();


    }


}
class BabushkaPhone extends Phone {
    int age;
    String status = "live";
    int value_button = 10;
    int max_volume = 100;
    String grafic_display = "720x1280";
    public void RETURN(){
        System.out.print("Делай выводы ВНУЧЕК " + super.serialNumber + " " + super.model + " " + super.weight + " " + grafic_display + " " + status);
    }
    BabushkaPhone(int value_button, int max_volume, String status) {
        this.value_button = value_button;
        this.max_volume = max_volume;
        this.status = status;

    }

}

class SmartPhone extends Phone {
    int age;
    String new_ = "new";
    String status = "live";
    int value_button = 10;
    int max_volume = 100;
    SmartPhone(int age, int value_button, int max_volume) {
        this.age = age;
        this.value_button = value_button;
        this.max_volume = max_volume;
    }
    public void sendMessage(String a) {
        System.out.println("Сообщение: " + a);
    }
}



class Phone {
    int serialNumber;
    int model;
    double weight;

    public void set(double weight) {
        this.weight = weight;
        this.model = model;
        this.serialNumber = serialNumber;
    }
    public void return_() {
        System.out.print(serialNumber + " " + model + " " + weight);
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public void receiveCall(int number) {
        System.out.println(number);
    }
    public double getWeight() {
        return weight;
    }
}
