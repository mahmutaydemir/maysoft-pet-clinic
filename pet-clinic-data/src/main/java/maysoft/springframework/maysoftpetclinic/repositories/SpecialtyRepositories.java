package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepositories extends CrudRepository<Specialty, Long> {
}
