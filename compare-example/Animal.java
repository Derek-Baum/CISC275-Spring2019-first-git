public abstract class Animal{
    String name;
    int numLegs;
    public Animal(String name,int numLegs){
	this.name=name;
	this.numLegs=numLegs;
    }
    public String getName(){
	return name;
    }
    public int getLegs(){
	return numLegs;
    }

}
