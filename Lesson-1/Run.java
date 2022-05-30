public class Run extends Obstacle {
    public int distance;
    
    public Run(int distance) {;
    this.distance = distance;
}
    

@Override
    public void doIt(Animal animal) {
        animal.run(distance);
    }
}
