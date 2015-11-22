package galion;

import java.util.ArrayList;
import java.util.ListIterator;

public class Loot {
    private ArrayList<Display> list;
    
    Loot() {
        this.list = new ArrayList<>();
    }
    
    public ArrayList<Display> getList() {
        return this.list;
    }
    
    public boolean add(String s) {
        Display t = new Display(s);
        boolean b = this.list.add(t);
        return b;
    }
    
    public boolean remove(String s) {
        Display t = new Display(s);
        boolean b = this.list.remove(t);
        return b;
    }
    
    public boolean sort() {
        boolean b = false;
        return b;
    }
    
    public int check() {
        int k = 0;
        ListIterator<Display> i = this.list.listIterator();
        while (i.hasNext() && k == 0) {
            if (i.next().getTitle().compareTo(i.previous().getTitle()) < 0) k = 1;
            else if (i.next().getTitle().equals(i.previous().getTitle())) k = 2;
        }
        return k;
    }
}