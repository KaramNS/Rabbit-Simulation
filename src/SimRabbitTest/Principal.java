package SimRabbitTest;

public class Principal {




    public static void main(String[] args) {
        Time time = new Time();
        GroupOfRabbit groupOfRabbit = new GroupOfRabbit();
        

        while(time.getYear() != 20){

            groupOfRabbit.isDying();
            groupOfRabbit.removeDead();
            groupOfRabbit.reproduction();
            time.moveForward();



        }

        System.out.println(groupOfRabbit);


    }
}