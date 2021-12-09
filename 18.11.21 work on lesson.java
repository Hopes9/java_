
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class Rectangle{

//    Задание на эту пару. Написать любым способом прогу, которая будет:
//            1. Выдавать случайного студента вашей группы
//2. Ждать оценку от 1 до 5 в консоль
//3. После выдавать следующего студента
//    Также должен быть вывод всех студентов с оценкой при вводе в консоль "print"
//
    static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Жданов Евгений", 0);
        map.put("Клещев Артём", 0);
        map.put("Колчанов Михаил Евгеньевич", 0);
        map.put("Корнеев Иван", 0);
        map.put("Крот Денис", 0);
        map.put("Кулаев Денис", 0);
        map.put("Ломовцева Александра", 0);
        List<Object> vg = new ArrayList<Object>(map.keySet());
        vg.toArray();
        Collections.shuffle(vg);
        boolean stop = true;
        while (stop){
            for (int i = 0; i < vg.toArray().length; i++){
                System.out.println(vg.toArray()[i]);

                String va = sc.next();

                if (va.equals("print")){
                    System.out.println(map);
                } else if (isNumber(va)){
                    Integer nubmer = Character.getNumericValue(va.toCharArray()[0]);
                    if (nubmer > 5 || nubmer < 0){
                        map.computeIfPresent((String)vg.toArray()[i], (k, v) -> v = nubmer);
                    }
                }
            }
        }
    }
}









import java.util.*;

public class Rectangle {

    public static void main(String[] args) {
        Cards cards = new Cards();
//        cards.retur();
        Scanner scan = new Scanner(System.in);
        while (true) {
            Object card = cards.return_one_card();
            System.out.println("Забрать или нет? " + card);
            if (cards.count > 21) {
                System.out.println("you lose");
                break;
            }
            String str = scan.next();
            if (str.equals("y")) {
                int name_card = cards.retu().get(card.toString());
                cards.add_count(name_card);
            } else if (str.equals("n")) {
                if (cards.count == 21) {
                    System.out.println("you WIN");
                    break;
                }
                System.out.println("you lose");
                break;
            }
            System.out.println("Сумма " + cards.count);
        }
    }
}

class Cards {
    public HashMap<String, Integer> cards;
    public List<String> coloda;
    public Integer count = 0;

    Cards() {
        this.cards = new HashMap<>();
        this.cards.put("2", 2);
        this.cards.put("3", 3);
        this.cards.put("4", 4);
        this.cards.put("5", 5);
        this.cards.put("6", 6);
        this.cards.put("7", 7);
        this.cards.put("8", 8);
        this.cards.put("9", 9);
        this.cards.put("10", 10);
        this.cards.put("Jack", 3);
        this.cards.put("Queen", 4);
        this.cards.put("King", 5);

        List<String> shuf = new ArrayList<String>(this.cards.keySet());
        List<String> sec = new ArrayList<String>(this.cards.keySet());

        shuf.addAll(sec);
        Collections.shuffle(shuf);
        this.coloda = shuf;

    }
    void retur() {
        System.out.println(this.coloda);
        System.out.println(this.cards);
    }

    HashMap<String, Integer> retu() {
        return this.cards;
    }

    Object return_one_card() {
        int x = (int) (Math.random() * ((coloda.size() - 1) + 1));
        Object card = this.coloda.get(x);
        return card;

    }

    void add_count(int index) {
        this.count += index;
    }
}

