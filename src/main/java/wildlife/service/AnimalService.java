package wildlife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wildlife.model.Animal;
import wildlife.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {
    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService (AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal findById (Long id) {
        return animalRepository.getOne(id);
    }

    public List<Animal> findAll () {
        return animalRepository.findAll();
    }

    public Animal saveAnimal (Animal animal) {
        return animalRepository.save(animal);
    }

    public void deleteById (Long id) {
        animalRepository.deleteById(id);

    }
}
