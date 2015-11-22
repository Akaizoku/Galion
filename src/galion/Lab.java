package galion;

public class Lab {
    
    public void fillList(Loot l) {
        for (int i = 20; i > 0; i--) {
            String s = "s"+i;
            l.add(s);
        }
        for (int i = 10; i < 20; i++) {
            l.getList().get(i).setStatus(false);
        }
    }
    
    public void preview(Loot l) {
        System.out.println("Taille de l'array ON : "+ l.getList().size() +".");
        if (l.getList().size() > 0) {
            System.out.println("Liste des elements de ON :");
            for (int i = 0; i < l.getList().size(); i++) {
                System.out.println("["+i+"] "+l.getList().get(i));
            }
        }
    }
}