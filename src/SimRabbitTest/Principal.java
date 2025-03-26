package SimRabbitTest;

public class Principal {




    public static void main(String[] args) {
        Time time = new Time();
        GroupOfRabbit groupOfRabbit = new GroupOfRabbit();
        

        while(time.getYear() != 20){

            groupOfRabbit.beOlders();
            groupOfRabbit.checkIsDying(time);
            groupOfRabbit.removeDead();
            groupOfRabbit.reproduction();


            time.moveForward();

            System.out.println(groupOfRabbit);
            System.out.println(time);


        }



    }
}