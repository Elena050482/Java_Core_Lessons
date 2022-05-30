//
public abstract class Animal {
    public String type;
    public String name;
    public int distanceRun;
    public int distanceSwim;
    boolean onDistance;
    
    public Animal (String type, String name, int distanceRun, int distanceSwim) {
        this.type = type;
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.onDistance = true;
        
    }
    
    public void run (int dist) {
        System.out.println("Испытание бег");
        if (this.distanceRun >= dist) {
            System.out.println(this.name + " испытание прошел");
        } else {
            System.out.println(this.name + " испытание не прошел");
            onDistance = false;
            } 
        }
        
    public void swim (int dist) {
        System.out.println("Испытание плавание");
        if (this.distanceSwim >= dist) {
            System.out.println(this.name + " испытание прошел");
        } else {
            System.out.println(this.name + " испытание не прошел");
            onDistance = false;
            } 
        }
    
    public boolean isOnDistance() {
        return onDistance;
    }
    
    public void info() {
        System.out.println(type + " " + name + " " + (onDistance ? " - полоса препятствий пройдена" : " - полоса препятствий не пройдена"));
    }
}
