public class Team {
    public String nameTeam;
    public Animal[] teamArr = new Animal[4]; 
    
    public Team (String nameTeam, Animal mem1, Animal mem2, Animal mem3, Animal mem4) {
        this.nameTeam = nameTeam;
        teamArr[0] = mem1;
        teamArr[1] = mem2;
        teamArr[2] = mem3;
        teamArr[3] = mem4;
    }
    

    public void infoTeam() {
        System.out.println("Команда: " + nameTeam);
        for(Animal mem : teamArr) {
            mem.info();
        }
    }
    
     public void passedTheDistance() {
        for (Animal mem: teamArr) {
            if (mem.isOnDistance()) {
                mem.info();
            }
        }
    }
}
