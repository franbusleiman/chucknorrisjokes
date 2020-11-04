package franciscobusleiman.springmvc.ChuckNorrisJoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("jokeServiceImpl")
public class JokeServiceImpl implements JokeService{

    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
