package maysoft.springframework.maysoftpetclinic.controllers;

import maysoft.springframework.maysoftpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //@RequestMapping({"/owners", "/owners/index","/owners/index.html"})    // slas lardan onceki yazilan owners lari yukari alabilirim.
    @RequestMapping({"", "/", "/index", "/index.html"})
    // yukardakinden farkli olarak bas tarafa bos bir tirnak ekleniyor ekstra.
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
