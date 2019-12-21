package spittr.spring.mvc.data;

import org.springframework.stereotype.Repository;
import spittr.spring.mvc.Spitter;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository{

    @Override
    public Spitter save(Spitter spitter) {
        return new Spitter(spitter.getUsername(), spitter.getPassword(), spitter.getFirstName(), spitter.getLastName(), spitter.getEmail());
    }

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter("yliang", "yliang", "yong", "liang", "yong.liang@hawaii.gov");
    }

}
