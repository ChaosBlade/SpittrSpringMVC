package spittr.spring.mvc.data;

import java.util.List;
import spittr.spring.mvc.Spittle;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
