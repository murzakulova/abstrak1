public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(67,3,"female","kara");
        Cow cow1 = new Cow(80,4,"male","white");
        Cow cow2 = new Cow(92,5,"male","Ada");
        Cow cow3 = new Cow(64,3,"female","Altaika");
        Cow cow4 = new Cow(91,7,"male","Verba");
        Cow[] cows = {cow,cow1,cow2,cow3,cow4};
        Cow[] cows1 = {cow};
        Horse horse = new Horse(167,4,"male","Agant","black");
        Horse horse1 = new Horse(180,5,"male","Orion","gray");
        Horse[] horses = {horse,horse1};
        Horse[] horses1 = {horse1};
        Sheep sheep = new Sheep(24,4,"female","black");
        Sheep sheep1 = new Sheep(34,5,"male","gray");
        Sheep sheep2 = new Sheep(32,3,"female","white");
        Sheep[] sheeps = {sheep,sheep1,sheep2};
        Sheep[] sheep3 = {sheep1};


        System.out.println();

        Farm farm = new Farm    (" Seleksionnyi aiyly ","Тургенева", cows, horses, sheeps);
        Farm farm1 = new Farm(" Kok-Jar ","Токтогула", cows1,horses1,sheep3);
        System.out.println(farm1);
        System.out.println(farm);
    }
}