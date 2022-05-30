public class Course {
    Obstacle[] course = new Obstacle[2];
    
    public Course(Obstacle ob1, Obstacle ob2) {
        course[0] = ob1;
        course[1] = ob2;
    }

    public void doIt(Team t) {
        System.out.println("\nКоманда \"" + t.nameTeam + "\":\n");
        for (int i = 0; i < t.teamArr.length; i++) {
            Animal teamMate = t.teamArr[i];
            System.out.println("Член команды: " + teamMate.name);
            course[0].doIt(teamMate); // бежим
            course[1].doIt(teamMate);// плывем
            }
    }
}
