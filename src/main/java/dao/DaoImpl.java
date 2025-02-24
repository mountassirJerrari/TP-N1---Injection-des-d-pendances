package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("dao")
@Primary
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("dao implementation de base  ");

        return 0;
    }
}
