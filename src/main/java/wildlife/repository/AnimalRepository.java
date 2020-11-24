package wildlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wildlife.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
