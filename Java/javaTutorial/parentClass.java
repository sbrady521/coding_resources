//parent Classes should typically be made abstract, since this means a parent
//object cannot be created
abstract public class parentClass{
    public void superPrint(){
        System.out.println("This function is part of the parent class, and thus the child classes");
    }

    //ABSTRACT METHODS:
    //Abstract methods can only be created in abstract classes
    //An abstract method is one which must be implemented or overwritten by
    //any class which inherits from this parent class
    //It does not require a body
    public abstract void message();
}
