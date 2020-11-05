package franciscobusleiman.springmvc.ChuckNorrisJoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("jokeServiceImpl")
public class JokeServiceImpl implements JokeService{
private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
