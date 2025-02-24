package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("dao implementation v2  ");
        return 10;
    }
}
