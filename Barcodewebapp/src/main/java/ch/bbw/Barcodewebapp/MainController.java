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
        viewcode(barcode);
        return "decode";
    }


    public void viewcode(Barcode barcode) {
        Barcontroller barcontroller = new Barcontroller();
        Time time = new Time();
        JSONwriter jsoNwriter = new JSONwriter();
        User user = barcontroller.decode(barcode.getBarcode());
        user.setLastLoggedIn(time.getTime());
        jsoNwriter.createFileIfNotExits(user);
    }

}
