package franciscobusleiman.springmvc.ChuckNorrisJoke.controllers;

import franciscobusleiman.springmvc.ChuckNorrisJoke.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }
    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "JokeWeb";
    }

}
