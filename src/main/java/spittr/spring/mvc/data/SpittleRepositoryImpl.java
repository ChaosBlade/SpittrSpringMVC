package spittr.spring.mvc.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import spittr.spring.mvc.Spittle;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository{

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        spittles.add(new Spittle("test3", new Date()));
        spittles.add(new Spittle("test4", new Date()));
        return spittles;
    }

    @Override
    public List<Spittle> findRecentSpittles() {
        List<Spittle> spittles = new ArrayList<Spittle>();
        spittles.add(new Spittle("test1", new Date()));
        spittles.add(new Spittle("test2", new Date()));
        return spittles;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle("test " + id, new Date());
    }

    @Override
    public void save(Spittle spittle) {
        System.out.println("Saving...");
    }

}
