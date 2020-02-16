package maysoft.springframework.maysoftpetclinic.bootstrap;

import maysoft.springframework.maysoftpetclinic.model.*;
import maysoft.springframework.maysoftpetclinic.services.OwnerService;
import maysoft.springframework.maysoftpetclinic.services.PetTypeService;
import maysoft.springframework.maysoftpetclinic.services.SpecialityService;
import maysoft.springframework.maysoftpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loaddata();
        }
    }

    private void loaddata() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);
//-----------------------------------------------------------------------------------------
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);
//-----------------------------------------------------------------------------------------
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Umraniye Umran Sk. No:40");
        owner1.setCity("Istanbul");
        owner1.setTelephone("12323234567");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);
//-----------------------------------------------------------------------------------------
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenane");
        owner1.setAddress("Umraniye Umran Sk. No:40");
        owner1.setCity("Istanbul");
        owner1.setTelephone("12323234567");

        Pet fionesCat = new Pet();
        fionesCat.setName("Just Cat");
        fionesCat.setOwner(owner2);
        fionesCat.setBirthDate(LocalDate.now());
        fionesCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionesCat);
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");
//-----------------------------------------------------------------------------------------
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessica");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
