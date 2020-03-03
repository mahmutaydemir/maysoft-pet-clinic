package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepositories extends CrudRepository<PetType, Long> {
}
