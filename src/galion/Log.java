package galion;

import java.io.*;
import java.util.*;

public class Log {
    Loot loot;
    
    public List<String> read(String file) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new FileReader(file));
        String s = in.readLine();
        while (s != null) list.add(s);
        in.close();
        return list;
    }
    
    public void write(String content, String file) throws IOException {
        File f = new File(file);
        BufferedWriter out = new BufferedWriter(new FileWriter(f));
        out.write(content);
        out.close();
    }
    
    public String layout(ArrayList<Display> list) {
        String text = list.get(0).toString();
        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i).toString();
            text = text +"\r\n"+  s;
        }
        return String.format(text);
    }
    
    public String display(ArrayList<Display> list, boolean b) {
        String s = null;
        int l = list.size();
        int k = 0;
        for (int i = 0; i < l && s == null; i++) {
            if (list.get(i).getStatus() == b) {
                s = list.get(i).getTitle();
                k = i+1;
            }
        }
        for (int j = k; j < l; j++) {
            if (list.get(j).getStatus() == b) {
                String t = list.get(j).getTitle();
                s = s +"\r\n"+ t;
            }
        }
        return String.format(s);
    }
    
    public String display(ArrayList<Display> list) {
        String s = list.get(0).getTitle();
        for (int i = 0; i < list.size(); i++) {
            String t = list.get(i).getTitle();
            s = s +"\r\n"+ t;
        }
        return String.format(s);
    }
}