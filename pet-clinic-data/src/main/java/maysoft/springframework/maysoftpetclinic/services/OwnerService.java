package maysoft.springframework.maysoftpetclinic.services;

import maysoft.springframework.maysoftpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
