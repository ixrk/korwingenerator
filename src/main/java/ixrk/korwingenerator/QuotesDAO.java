package ixrk.korwingenerator;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Repository
public class QuotesDAO {
    public List<List<String>> getQuotesListOfLists() {
        InputStreamReader in = new InputStreamReader(getClass().getResourceAsStream("/quotes.json"));
        BufferedReader reader = new BufferedReader(in);
        return new Gson().fromJson(reader, List.class);
    }
}
