package ixrk.korwingenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KorwinController {
    private SentenceService sentenceService;

    @Autowired
    public KorwinController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }

    @GetMapping("/")
    public String sentence(Model model) {
        model.addAttribute("sentence", sentenceService.getRandomSentence());
        return "quote";
    }
}
