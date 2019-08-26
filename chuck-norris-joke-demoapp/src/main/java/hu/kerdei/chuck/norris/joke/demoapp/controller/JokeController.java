package hu.kerdei.chuck.norris.joke.demoapp.controller;

import hu.kerdei.chuck.norris.joke.demoapp.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class JokeController {

    final JokeService jokeServiceImpl;

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeServiceImpl.getChuckNorrisJoke());
        return "joke";
    }


}
