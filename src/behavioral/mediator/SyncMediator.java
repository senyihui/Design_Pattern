package behavioral.mediator;

public class SyncMediator extends AbstractMediator {
    @Override
    public void sync(String databaseName, String data) {
        if (AbstractDatabase.MYSQL.equals(databaseName)) {
            // mysql 同步到 redis 和 Elasticsearch
            this.redisDatabase.addData(data);
            this.esDatabase.addData(data);
        } else if (AbstractDatabase.REDIS.equals(databaseName)) {
            // redis 缓存同步，不需要同步到其他数据库
        } else if (AbstractDatabase.ELASTICSEARCH.equals(databaseName)) {
            // Elasticsearch 同步到 Mysql
            this.mysqlDatabase.addData(data);
        }
    }

    @Override
    public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
        this.mysqlDatabase = mysqlDatabase;
    }

    @Override
    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    @Override
    public void setEsDatabase(EsDatabase esDatabase) {
        this.esDatabase = esDatabase;
    }


}