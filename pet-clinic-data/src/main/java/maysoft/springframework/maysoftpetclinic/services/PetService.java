package maysoft.springframework.maysoftpetclinic.services;

import maysoft.springframework.maysoftpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet );

    Set<Pet> findAll();
}
