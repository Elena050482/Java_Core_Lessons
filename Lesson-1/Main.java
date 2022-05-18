/**
* Java Core. Homework 1
*
* @ author Elena Zavarzina
* @ version 16.05.2022
*/
 

// 2. Добавить класс Team, который будет содержать:
// название команды;
// массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//метод для вывода информации о членах команды, прошедших дистанцию;
//метод вывода информации обо всех членах команды.

//3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//массив препятствий;
//метод, который будет просить команду пройти всю полосу.


public class Main {

    public static void main(String[] args) {
        Course c = new Course (new Run(35), new Swim(100));
        Team team = new Team("Победители", 
            new Cat("Мурзик", 15,0), 
            new Dog("Бобик", 20,50), 
            new Monkey("Лорри", 45,0), 
            new Human("Альфред", 75,200));
         
         c.doIt(team); 

         System.out.println("\nПобедители:");
         team.passedTheDistance();

         System.out.println("\nРезультаты:");
         team.infoTeam();
        }
    }
