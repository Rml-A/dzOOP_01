package dzOOP_01;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework {
    public static void main(String[] args) {
        Dog Reks = new Dog("Reks", 2);
        Dog Shark = new Dog("Shark",3);
        Cat Murzik = new Cat("Murzik", 5);
        Cat Murka = new Cat("Murka", 3);
    
        List<Animal> Group = new ArrayList<>();
        Group.add(Reks);  
        Group.add(Shark);
        Group.add(Murzik);
        Group.add(Murka);
    
        Iterator<Animal> iter = Group.iterator();
        while (iter.hasNext()){
            Animal animal = iter.next();
            printAnimal(animal);  
            animal.eat();  
            animal.play(); 
            printAnimal(animal);    
        }
        }    
    
        private static void printAnimal(Animal animal) {
            System.out.println("Animal = " + animal.getClass() + ", name = " + animal.name + ", age = " + animal.age 
             + ", satiety = " + animal.getSatiety() + ", mood = " + animal.getMood() + 
              ", voice = " + animal.getVoice());
        }
        
}
