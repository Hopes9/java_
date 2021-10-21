import java.util.Arrays;
import java.util.Comparator;

public class first {
    public static void main(String[] args) {
        HubList<String> youList = new HubList<String>();
        youList.add("b");
        youList.add("asd");
        youList.add("cdsad");
        youList.add("ddds");
        youList.add("fdadasdas");
        youList.return_mass();
//        System.out.println(youList.removeAt(1)); //a
        youList.return_mass();
        System.out.println(youList.find("asd"));
        System.out.println(youList.find("cdsad"));
        System.out.println(youList.find("b"));
        youList.sort(new HubStringComparator());
        youList.return_mass();


    }
}

class HubStringComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((String) o2).length() - ((String) o1).length();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

interface HubListImpl<E> {
    void add(E element);
    E removeAt(int index);
    void sort(Comparator<? super E> c);
    int find(E element);
}



class HubList<E> implements HubListImpl<E>{
    E[] elem;
    int size = 0;
    E count;
    HubList(){
        E[] elem = (E[]) new Object[size];
    }
    @Override
    public void add(E element) {
        if (elem != null) {
            if (size > elem.length) {
                this.elem[elem.length + 1] = element;
            } else {
                E[] copy_m = (E[]) new Object[size];
                System.arraycopy(elem, 0, copy_m, 0, elem.length);
                this.elem = (E[]) new Object[size + 1];
                System.arraycopy(copy_m, 0, elem, 0, copy_m.length);
                elem[elem.length - 1] = element;
                this.size = elem.length;
            }
        } else {
                this.elem = (E[]) new Object[size + 1];
                elem[elem.length - 1] = element;
                this.size = elem.length;
        }
    }

    public void return_mass() {
        System.out.println(Arrays.toString(elem));
    }

    @Override
    public E removeAt(int index) {
        E[] g = (E[]) new Object[elem.length];
        for (int i = 0; i < elem.length; ++i) {
            if (i == index) {
                count = elem[index];
            }else if (i > index){
                g[i -1] = elem[i];
            }
            else {
                g[i] = elem[i];

            }

        }
        System.arraycopy(g, 0, elem, 0, g.length);
        return count;
    }


    @Override
    public void sort(Comparator<? super E> c) {
        for(int i = elem.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if(c.compare(elem[j], elem[j+1]) > 0) {
                    E tmp = elem[j];
                    elem[j] = elem[j+1];
                    elem[j+1] = tmp;
                }
        }
    }
}


    @Override
    public int find(E element) {
        int count = -1;
        for (int i = 0; i < elem.length; ++i){
            if (element.equals(elem[i])) {
                count = i;
            }
        }
        return count;
    }
}

