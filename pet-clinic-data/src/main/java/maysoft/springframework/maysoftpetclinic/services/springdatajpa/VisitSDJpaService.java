package maysoft.springframework.maysoftpetclinic.services.springdatajpa;

import maysoft.springframework.maysoftpetclinic.model.Visit;
import maysoft.springframework.maysoftpetclinic.repositories.VisitRepositories;
import maysoft.springframework.maysoftpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepositories visitRepositories;

    public VisitSDJpaService(VisitRepositories visitRepositories) {
        this.visitRepositories = visitRepositories;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepositories.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepositories.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepositories.deleteById(aLong);
    }
}
