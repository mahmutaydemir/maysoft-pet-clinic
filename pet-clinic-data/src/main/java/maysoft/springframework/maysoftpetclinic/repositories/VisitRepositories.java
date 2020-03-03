package maysoft.springframework.maysoftpetclinic.repositories;

import maysoft.springframework.maysoftpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepositories extends CrudRepository<Visit, Long> {
}
