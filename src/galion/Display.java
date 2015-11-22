package galion;

public class Display {
    private String title;
    private boolean status;
    private String state;
    private int serie;
    private int episode;

    Display(String s) {
        this.title = s;
        this.status = true;
        this.state = "ON ";
        this.serie = 1;
        this.episode = 1;
    }
    
    @Override
    public String toString() {
        String s = this.title+"   "+this.state+"   "+this.serie+"   "+this.episode;
        return s;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String s) {
        this.title = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean b) {
        this.status = b;
        if (b == false) this.state = "OFF";
    }
    
    public int getSerie() {
        return this.serie; 
    }
    
    public void setSerie(int i) {
        this.serie = i;
    }
    
    public int getEpisode() {
        return this.episode;
    }
    
    public void setEpisode(int i) {
        this.episode = i;
    }
}