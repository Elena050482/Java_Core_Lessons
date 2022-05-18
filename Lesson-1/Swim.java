class Swim extends Obstacle {
    int length;

    public Swim(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Animal animal) {
        animal.swim(length);
    }
}
