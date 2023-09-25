package com.example2.demo2;

import com.example2.demo2.aa.AnimalType;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    static List<Animal> animals = new ArrayList<>();
    static {
        animals.add(new Cat("Fluffy", 3, 34.5f));
        animals.add(new Dog("Buddy", 2, 25.5f));
        animals.add(new Dog("Dubby", 3, 25.5f));
        animals.add(new Fish("Lazy", 3));
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public List<Animal> getAnimalsByType(AnimalType type){
        List<Animal> animalsByType = new ArrayList<>();
        switch (type){
            case DOG: {
//                for (int i=0; i< animals.size();i++){
//                    if(animals.get(i).getClass()== Dog.class){
//                        animalsByType.add(animals.get(i));
//                    }
//                }
//                break;
                return animals.stream()
                        .filter(a -> a.getClass() == Dog.class)
                        .collect(Collectors.toList());
            }
            case CAT: {
                for (int i=0; i< animals.size();i++){
                    if(animals.get(i).getClass()== Cat.class){
                        animalsByType.add(animals.get(i));
                    }
                }
                break;
            }
            case FISH: {
                for (int i=0; i< animals.size();i++){
                    if(animals.get(i).getClass()== Fish.class){
                        animalsByType.add(animals.get(i));
                    }
                }
                break;
            }

            default:
                throw new UnsupportedOperationException();

        }
        return animalsByType;

    }
    public String getAnimalClassByName(String animalName) throws ClassNotFoundException {
        for(Animal animal : animals) {
            if(animal.name.equals(animalName)){
                return animal.getClass().getName();
            }
        }
        throw new ClassNotFoundException();
    }

    public List<Animal> addAnimal(Animal animal) {
        if(Objects.isNull(animal.name) || animal.name.length() == 0) {
            throw new UnsupportedOperationException();
        }

        animals.add(animal);
        return animals;
    }

    public void removeAnimalByName (String animalName){
        Animal rbc = new Animal();
        for(Animal animal: animals) {
            if (animal.name.equals(animalName)) {
                rbc = animal;
            }
        }
        animals.remove(rbc);
    }
}
