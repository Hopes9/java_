
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


