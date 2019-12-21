package spittr.spring.mvc.data;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import spittr.spring.mvc.Spittle;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    List<Spittle> findRecentSpittles();
    Spittle findOne(long id);
    void save(Spittle spittle);
}
