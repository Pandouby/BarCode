package ch.bbw.Barcodewebapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {


    @GetMapping("/decode")
    public String index(Model model) {
        model.addAttribute("barcode", new Barcode());
        return "decode";
    }

    @PostMapping("/decode")
    public String mySubmitMethod(Model model, @ModelAttribute Barcode barcode) {
        model.addAttribute("barcode", barcode);
        Barcontroller controller = new Barcontroller();
        model.addAttribute("user", controller.decode(barcode.getBarcode()));
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
        return "encode";
    }

    public void viewcode(User user) {
        Barcontroller barcontroller = new Barcontroller();
        Time time = new Time();
        JSONwriter jsoNwriter = new JSONwriter();
        user.setLastLoggedIn(time.getTime());
        jsoNwriter.createFileIfNotExits(user);
    }

}
