public class animalList{
    private Animal[] theList = new Animal[5];
    private int pos;

    public void addAnimal(Animal a){
        if(pos < theList.length){
            theList[pos] = a;
            System.out.println("animal added to index " + pos);
            pos++;

        } else{
            System.out.println("List full");
        }
    }


}
