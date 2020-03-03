package maysoft.springframework.maysoftpetclinic.services.springdatajpa;

import maysoft.springframework.maysoftpetclinic.model.Specialty;
import maysoft.springframework.maysoftpetclinic.repositories.SpecialtyRepositories;
import maysoft.springframework.maysoftpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialtyRepositories specialtyRepositories;

    public SpecialitySDJpaService(SpecialtyRepositories specialtyRepositories) {
        this.specialtyRepositories = specialtyRepositories;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepositories.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepositories.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepositories.deleteById(aLong);
    }
}
