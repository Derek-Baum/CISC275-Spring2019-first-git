public class Dog extends Animal{

    public Dog(String name,int numLegs){
	super(name,numLegs);
    }

    public String toString(){
	return super.getName() + " has " + super.getLegs() + " legs.";
    }
}
