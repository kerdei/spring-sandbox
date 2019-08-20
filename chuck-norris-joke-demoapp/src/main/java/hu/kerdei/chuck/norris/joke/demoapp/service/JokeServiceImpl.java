package hu.kerdei.chuck.norris.joke.demoapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public String getChuckNorrisJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
