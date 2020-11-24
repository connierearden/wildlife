package wildlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wildlife.model.Animal;
import wildlife.service.AnimalService;

import java.util.List;


@Controller
public class AnimalController {
    private AnimalService animalService;

    @Autowired
    public AnimalController (AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public String findAll (Model model) {
        List<Animal> animals =  animalService.findAll();
        model.addAttribute("animals", animals);
        return "animal-list";
    }
}
