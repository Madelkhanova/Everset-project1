package com.example2.demo2.aa;
import com.example2.demo2.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

   private  AnimalService animalService;
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/getall")
    public List<Animal> getAllAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/{type}")
    public List<Animal> getClassProperties(@PathVariable AnimalType type) {
        return animalService.getAnimalsByType(type);


    }

    @GetMapping("/class/{animalName}")
    public String getClassByName(@PathVariable String animalName) throws ClassNotFoundException {
        return animalService.getAnimalClassByName(animalName);


    }

    @DeleteMapping("/remove/{animalName}")
    public void removeAnimalByName(@PathVariable String animalName) throws ClassNotFoundException {
        animalService.removeAnimalByName(animalName);


    }


    @PostMapping(value = "/fish")
    public List<Animal> addFish(@Valid @RequestBody Fish animal) {
        return animalService.addAnimal(animal);
    }

//    @PostMapping("/cats")
//    public Cat addCat(@RequestBody Cat cat) {
//        List<Cat> cats = new ArrayList<>();
//        cats.add(cat);
//        return cat;
//    }

    }

