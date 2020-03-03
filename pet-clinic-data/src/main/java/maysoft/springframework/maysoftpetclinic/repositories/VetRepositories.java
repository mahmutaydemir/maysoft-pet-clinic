package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepositories extends CrudRepository<Vet, Long> {
}
