package hu.kerdei.chuck.norris.joke.demoapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JokeServiceImpl implements JokeService {

    final ChuckNorrisQuotes chuckNorrisQuotes;

    public String getChuckNorrisJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
