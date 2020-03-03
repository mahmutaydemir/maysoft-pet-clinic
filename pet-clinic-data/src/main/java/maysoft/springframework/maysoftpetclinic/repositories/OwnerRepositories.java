package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepositories extends CrudRepository<Owner, Long> {
}
