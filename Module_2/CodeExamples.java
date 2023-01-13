package CodeExamples;

public class CodeExamples
{
    public static void main(String[] args) {

    }
}
package CodeExamples;

public class Dog {
    // this is the data field I am encapsulating default value is johnDoe
    private String dogName = "johnDoe"
    // this is the getter method to access this data field
    public String getDogName(){
        return dogName;
    }
    // setter for dogName
    public void setDogName(String dogName){
        this.dogName=dogName;
    }

}
package CodeExamples;

public class ObjectArray {
    // Declares an array of 3 dog objects
    Dog[] dogArray =  New Dog[3];
    // inits values into the objects in dogArray
    for (int i = 0; i < dogArray.length; i++){
        dogArray[i] = new Dog();
    }

    
}
