package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepositories extends CrudRepository<Pet, Long> {
}
