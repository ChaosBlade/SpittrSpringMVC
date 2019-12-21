package spittr.spring.mvc.data;

import spittr.spring.mvc.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
