package ixrk.korwingenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KorwinController {

    @GetMapping("/korwin")
    public String sentence(Model model) {
        model.addAttribute("sentence", Quotes.getRandomSentence());
        return "quote";
    }
}
