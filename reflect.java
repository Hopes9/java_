package com.company;

import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone(10, 0, 300);

        System.out.println(Phone.class);
        Class<Phone> taskOneClass = Phone.class;
        final Method[] methods = taskOneClass.getDeclaredMethods();
        final Field[] fields = taskOneClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        for (Method method : methods) {
            System.out.println(method);
        }

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
