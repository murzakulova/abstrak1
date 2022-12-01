public class Animal {
   private int weight;
   private int age;
   private String gender;
   private String nickName;

    public Animal(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "\nweight='" + weight + '\'' +
                "\n age=" + age +
                "\n gender='" + gender + '\'' +
                "\n nickName='" + nickName + '\'' +
                '}';
    }
}
