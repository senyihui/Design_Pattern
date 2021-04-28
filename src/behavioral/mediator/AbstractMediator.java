package behavioral.mediator;

public abstract class AbstractMediator {
    protected MysqlDatabase mysqlDatabase;
    protected RedisDatabase redisDatabase;
    protected EsDatabase esDatabase;

    public abstract void sync(String databaseName, String data);

    public abstract void setMysqlDatabase(MysqlDatabase mysqlDatabase);

    public abstract void setRedisDatabase(RedisDatabase redisDatabase);

    public abstract void setEsDatabase(EsDatabase esDatabase);
}
