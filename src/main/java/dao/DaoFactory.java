package dao;

public class DaoFactory {
    private static CatsDao catsDao;
    private static Config config = new Config();

    public static CatsDao getCatsDao() {
        if (catsDao == null) {
            catsDao = new CatsDao(config);
        }
        return catsDao;
    }
}
