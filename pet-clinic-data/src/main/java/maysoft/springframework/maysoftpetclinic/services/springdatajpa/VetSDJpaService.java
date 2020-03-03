package maysoft.springframework.maysoftpetclinic.services.springdatajpa;

import maysoft.springframework.maysoftpetclinic.model.Vet;
import maysoft.springframework.maysoftpetclinic.repositories.VetRepositories;
import maysoft.springframework.maysoftpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepositories vetRepositories;

    public VetSDJpaService(VetRepositories vetRepositories) {
        this.vetRepositories = vetRepositories;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepositories.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepositories.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepositories.deleteById(aLong);
    }
}
