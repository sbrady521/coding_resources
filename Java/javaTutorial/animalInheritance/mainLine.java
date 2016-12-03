public class mainLine{
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog();
        Fish f = new Fish();
        animalList AL = new animalList();

        AL.addAnimal(d);
        AL.addAnimal(d2);
        AL.addAnimal(f);
    }
}
