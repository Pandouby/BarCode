package ch.bbw.Barcodewebapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    Sessionusers Session = new Sessionusers();
    @GetMapping("/decode")
    public String index(Model model) {
        model.addAttribute("barcode", new Barcode());
        model.addAttribute("user", new User());
        return "decode";
    }

    @PostMapping("/decode")
    public String mySubmitMethod(Model model, @ModelAttribute Barcode barcode) {
        model.addAttribute("barcode", barcode);
        Barcontroller controller = new Barcontroller();
        User user = controller.decode(barcode.getBarcode());
        model.addAttribute("user", user);
        Time time = new Time();
        user.setLastLoggedIn(time.getTime());
        if (Session.isregisterd(user.getFirstname(),user.getLastname()) == true) {
            System.out.println("is registerd");
            JSONwriter.createFileIfNotExits(user);
        }
        else {
            System.out.println("Not registerd");
        }
        return "decode";
    }

    @GetMapping("/encode")
    public String encode(Model model) {
        model.addAttribute("user", new User());
        return "encode";
    }

    @PostMapping("/encode")
    public String postencode(Model model, @ModelAttribute User user) {
        Barcontroller barcontroller = new Barcontroller();
        user.setLastLoggedIn(Time.getTime());
        model.addAttribute("user", user);
        model.addAttribute("encoded", barcontroller.encode(user));
        Session.registeruser(user.getFirstname(),user.getLastname());
        return "encode";
    }

}
