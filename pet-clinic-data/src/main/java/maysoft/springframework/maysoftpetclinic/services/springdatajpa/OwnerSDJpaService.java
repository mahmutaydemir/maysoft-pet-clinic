package maysoft.springframework.maysoftpetclinic.services.springdatajpa;

import maysoft.springframework.maysoftpetclinic.model.Owner;
import maysoft.springframework.maysoftpetclinic.repositories.OwnerRepositories;
import maysoft.springframework.maysoftpetclinic.repositories.PetRepositories;
import maysoft.springframework.maysoftpetclinic.repositories.PetTypeRepositories;
import maysoft.springframework.maysoftpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepositories ownerRepositories;
    private final PetRepositories petRepositories;
    private final PetTypeRepositories petTypeRepositories;

    public OwnerSDJpaService(OwnerRepositories ownerRepositories, PetRepositories petRepositories,
                             PetTypeRepositories petTypeRepositories) {
        this.ownerRepositories = ownerRepositories;
        this.petRepositories = petRepositories;
        this.petTypeRepositories = petTypeRepositories;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepositories.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepositories.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepositories.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepositories.deleteById(aLong);
    }
}
