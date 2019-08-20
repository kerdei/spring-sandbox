package hu.kerdei.chuck.norris.joke.demoapp.controller;

import hu.kerdei.chuck.norris.joke.demoapp.service.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class JokeController {

    JokeService jokeServiceImpl;

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeServiceImpl.getChuckNorrisJoke());
        return "joke";
    }


}
