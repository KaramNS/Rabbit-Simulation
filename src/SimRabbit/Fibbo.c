# include <stdio.h>
# include <stdlib.h>

typedef struct {
    int age;
    char sex;
} Rabbit;

typedef struct {
    Rabbit * rabbits;
    int size; 
} RabbitPopulation;

int main() {
    Rabbit * rabbit = (Rabbit *) malloc(sizeof(Rabbit));

    RabbitPopulation * population = (RabbitPopulation *) malloc(sizeof(RabbitPopulation));
    RabbitPopulation * StandardPopulation  = (RabbitPopulation *) malloc(sizeof(RabbitPopulation) * 4);


}