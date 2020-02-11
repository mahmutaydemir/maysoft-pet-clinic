package maysoft.springframework.maysoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    //@RequestMapping({"/owners", "/owners/index","/owners/index.html"})    // slas lardan onceki yazilan owners lari yukari alabilirim.
    @RequestMapping({"","/", "/index","/index.html"})                       // yukardakinden farkli olarak bas tarafa bos bir tirnak ekleniyor ekstra.
    public String listOwners() {
        return "owners/index";
    }
}