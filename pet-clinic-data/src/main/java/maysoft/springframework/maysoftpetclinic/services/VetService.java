package maysoft.springframework.maysoftpetclinic.services;

import maysoft.springframework.maysoftpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
