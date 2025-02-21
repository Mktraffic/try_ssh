package co.edu.uptc.animals_rest.controllers;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.uptc.animals_rest.models.Animal;
import co.edu.uptc.animals_rest.services.AnimalService;

import static java.lang.Thread.sleep;


@RestController
@RequestMapping("/animal")
public class AnimalController {

 private static final Logger logger = LoggerFactory.getLogger(AnimalController.class);

   @Autowired
    private AnimalService animalService;


//    @GetMapping("/all")
//    public List<Animal> getAnimalAll() throws IOException {
//        logger.info("getAnimalAll called");
//        return animalService.getAnimalAll();
//    }
//
//    @GetMapping("/range")
//    public List<Animal> getAnimal(@RequestParam int from, @RequestParam int to) throws IOException {
//        logger.info("getAnimal called with parameters: from = {}, to = {}", from, to);
//        return animalService.getAnimalInRange(from, to);
//    }
   
   @GetMapping("/all")
   public List<Object> getAnimalAll() throws IOException, InterruptedException {
       logger.info("getAnimalAll called");
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return animalService.getAnimalAll();
   }

   @GetMapping("/range")
   public List<Object> getAnimal(@RequestParam int from, @RequestParam int to) throws IOException, InterruptedException {
       logger.info("getAnimal called with parameters: from = {}, to = {}", from, to);
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return animalService.getAnimalInRange(from, to);
   }

//    @GetMapping("/category/{category}")
//    public List<Animal> getAnimalsByCategory(@PathVariable String category) throws IOException {
//        logger.info("getAnimalsByCategory called with category: {}", category);
//        return animalService.getAnimalsByCategory(category);
//    }
//
//    @GetMapping("/name-length/{numberOfLetters}")
//    public List<Animal> getAnimalsByNameLength(@PathVariable int numberOfLetters) throws IOException {
//        logger.info("getAnimalsByNameLength called with length: {}", numberOfLetters);
//        return animalService.getAnimalsByNameLength(numberOfLetters);
//    }



}
