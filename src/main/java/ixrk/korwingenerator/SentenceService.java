package ixrk.korwingenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SentenceService {
    private final QuotesDAO quotesDAO;

    @Autowired
    public SentenceService(QuotesDAO quotesDAO) {
        this.quotesDAO = quotesDAO;
    }

    public String getRandomSentence() {
        List<List<String>> quotes = quotesDAO.getQuotesListOfLists();
        Random random = new Random();
        return quotes.stream()
                .map(quote -> quote.get(random.nextInt(6)))
                .collect(Collectors.joining(" "));
    }
}
