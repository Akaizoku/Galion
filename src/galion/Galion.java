package galion;

import java.io.IOException;

public class Galion {
    Galion galion;
    Lab lab;
    Log log;
    Loot loot;
    Display show;
    
    public static void main(String[] args) throws IOException {
        Galion galion = new Galion();
        Lab lab = new Lab();
        Log log = new Log();
        Loot loot = new Loot();
        galion.test();
    }
    
    private void addShow(String s) {
        loot.add(s);
    }
    
    private boolean removeShow(String s) {
        boolean b = loot.remove(s);
        return b;
    }
    
    private void addSerie(Display s) {
        s.setSerie(s.getSerie() +1);
    }
    
    public void removeSerie(Display s) {
        s.setSerie(s.getSerie() -1);
    }
    
    private void addEpisode(Display s) {
        s.setEpisode(s.getSerie() +1);
    }
    
    public void removeEpisode(Display s) {
        s.setEpisode(s.getEpisode() -1);
    }
    
    public void load() throws Exception {
        String path = "/Users/Florian/Documents/Stock/galion.txt";
        log.read(path);
    }
    
    private void store() throws IOException {
        String content = log.layout(loot.getList());
        String path = "/Users/Florian/Documents/Stock/galion.txt";
        log.write(content, path);
    }
    
    private void test() {
        lab.preview(loot);
        lab.fillList(loot);
        lab.preview(loot);
        System.out.println(log.layout(loot.getList()));
        loot.check();
    }
}
