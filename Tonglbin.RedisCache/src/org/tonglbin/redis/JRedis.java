package org.tonglbin.redis;

import java.util.Collection;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  
  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
  
import redis.clients.jedis.BinaryClient.LIST_POSITION;  
import redis.clients.jedis.Jedis;  
import redis.clients.jedis.JedisPool;  
import redis.clients.jedis.JedisShardInfo;  
import redis.clients.jedis.ShardedJedis;  
import redis.clients.jedis.ShardedJedisPipeline;  
import redis.clients.jedis.ShardedJedisPool;  
import redis.clients.jedis.SortingParams;  
import redis.clients.jedis.Tuple;  

public class JRedis {

	 private static final Logger LOGGER = LoggerFactory.getLogger(JRedis.class);  
	  
	    /** ֧��Redis��Ⱥ����Ƭ���ӳ� */  
	    private static ShardedJedisPool shardedJedisPool;  
	  
	    /** ֧�ֵ�̨Redis�ķ���Ƭ���ӳ� */  
	    private static JedisPool jedisPool;  
	  
	    /** 
	     * ����Springע��ShardedJedisPool 
	     *  
	     * @param shardedJedisPool 
	     */  
	    public void setShardedJedisPool(ShardedJedisPool shardedJedisPool) {  
	    	JRedis.shardedJedisPool = shardedJedisPool;  
	    }  
	  
	    /** 
	     * ����Springע��JedisPool 
	     *  
	     * @param jedisPool 
	     */  
	    public void setJedisPool(JedisPool jedisPool) {  
	    	JRedis.jedisPool = jedisPool;  
	    }  
	  
	    /** 
	     * ��ShardedJedisPool�л�ȡShardedJedis 
	     *  
	     * @return ShardedJedis 
	     */  
	    public static ShardedJedis getShardedJedis() {  
	        return shardedJedisPool.getResource();  
	    }  
	  
	    /** 
	     * ��JedisPool�л�ȡJedis 
	     *  
	     * @return Jedis 
	     */  
	    public static Jedis getJedis() {  
	        return jedisPool.getResource();  
	    }  
	  
	    /** =============================����Redis�������ķ���============================= */  
	  
	    /** 
	     * ʹ�ÿͻ����� ��ǰRedis����������һ�� PING ��������������������Ļ����᷵��һ�� PONG�� 
	     * ͨ�����ڲ�����������������Ƿ���Ȼ��Ч���������ڲ����ӳ�ֵ�� 
	     *  
	     * @return result ������������ͷ���һ�� PONG �����򷵻�һ�����Ӵ��� 
	     */  
	    public static String ping() {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.ping();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �л�����ǰRedisָ�������ݿ⣬���ݿ�������index������ֵָ������0��Ϊ��ʼ����ֵ��Ĭ��ʹ��0�����ݿ⡣ 
	     *  
	     * @param index 
	     *            ���ݿ������� 
	     * @return result OK 
	     */  
	    public static String select(int index) {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.select(index);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��յ�ǰ���ݿ��е�����key�� 
	     *  
	     * @return result OK 
	     */  
	    public static String flushDB() {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.flushDB();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���������ǰ Redis ������������(ɾ���������ݿ������ key )�� 
	     *  
	     * @return result OK 
	     */  
	    public static String flushAll() {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.flushAll();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ص�ǰ���ݿ�� key �������� 
	     *  
	     * @return result ��ǰ���ݿ�� key �������� 
	     */  
	    public static Long dbSize() {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.dbSize();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �����������ӵ���ǰ�������Ŀͻ�����Ϣ��ͳ�����ݡ� 
	     * ���ز����������http://redisdoc.com/server/client_list.html 
	     *  
	     * @return result �ͻ�����Ϣ��ͳ�����ݡ� 
	     */  
	    public static String clientList() {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.clientList();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع��� ��ǰRedis �������ĸ�����Ϣ��ͳ����ֵ�� <br> 
	     * ���ز����������http://redisdoc.com/server/info.html 
	     *  
	     * @return result ��������Ϣ�� 
	     */  
	    public static String info() {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.info();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ===============================����Key�ķ���=============================== */  
	  
	    /** 
	     * ���ҵ�ǰ���ݿ������з��ϸ���ģʽ pattern �� key �� <br> 
	     * KEYS * ƥ�����ݿ������� key �� <br> 
	     * KEYS h?llo ƥ�� hello �� hallo �� hxllo �ȡ� <br> 
	     * KEYS h*llo ƥ�� hllo �� heeeeello �ȡ� <br> 
	     * KEYS h[ae]llo ƥ�� hello �� hallo ������ƥ�� hillo �� <br> 
	     * ��������� \ ����<br> 
	     *  
	     * ע�⣺KEYS ���ٶȷǳ��죬����һ��������ݿ���ʹ������Ȼ��������������⣬�������Ҫ��һ�����ݼ��в����ض��� key�� ����û����� 
	     * Redis �ļ��Ͻṹ(set)�����档 
	     *  
	     * @param pattern 
	     *            ���ϸ���ģʽ�� key �б� 
	     */  
	    public static Set<String> keys(String pattern) {  
	        Set<String> result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.keys(pattern);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key �������ֵ�����͡� 
	     *  
	     * @param key 
	     * @return none(key������)��string(�ַ���)��list(�б�)��set(����)��zset(����)��hash(��ϣ��) 
	     */  
	    public static String type(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.type(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key �������ֵ�����͡� 
	     *  
	     * @param key 
	     * @return none(key������)��string(�ַ���)��list(�б�)��set(����)��zset(����)��hash(��ϣ��) 
	     */  
	    public static String type(byte[] key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.type(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * Ϊ���� key ��������ʱ�䣬�� key ����ʱ(����ʱ��Ϊ 0 )�����ᱻ�Զ�ɾ���� 
	     *  
	     * @param key 
	     * @param seconds 
	     *            ����Ϊ��λ��ʱ�� 
	     * @return result ���óɹ����� 1 �� �� key �����ڻ��߲���Ϊ key ��������ʱ��ʱ(�����ڵ��� 2.1.3 �汾�� 
	     *         Redis ���㳢�Ը��� key ������ʱ��)������ 0 �� 
	     */  
	    public static Long expire(String key, int seconds) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.expire(key, seconds);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * Ϊ���� key ��������ʱ�䣬�� key ����ʱ(����ʱ��Ϊ 0 )�����ᱻ�Զ�ɾ���� 
	     *  
	     * @param key 
	     * @param seconds 
	     *            ����Ϊ��λ��ʱ�� 
	     * @return result ���óɹ����� 1 �� �� key �����ڻ��߲���Ϊ key ��������ʱ��ʱ(�����ڵ��� 2.1.3 �汾�� 
	     *         Redis ���㳢�Ը��� key ������ʱ��)������ 0 �� 
	     */  
	    public static Long expire(byte[] key, int seconds) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.expire(key, seconds);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * EXPIREAT �����ú� EXPIRE ���ƣ�������Ϊ key ��������ʱ�䡣 ��ͬ���� EXPIREAT ������ܵ�ʱ������� UNIX 
	     * ʱ���(unix timestamp)�� ���Ǿ���Ԫ�����������α�׼ʱ�� 1970 �� 1 �� 1 �յ� 00:00:00���������������ƫ������ 
	     *  
	     * @param key 
	     * @param unixTime 
	     *            UNIXʱ��� 
	     * @return result �������ʱ�����óɹ������� 1 �� �� key �����ڻ�û�취��������ʱ�䣬���� 0 �� 
	     */  
	    public static Long expireAt(String key, long unixTime) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.expireAt(key, unixTime);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * EXPIREAT �����ú� EXPIRE ���ƣ�������Ϊ key ��������ʱ�䡣 ��ͬ���� EXPIREAT ������ܵ�ʱ������� UNIX 
	     * ʱ���(unix timestamp)�� ���Ǿ���Ԫ�����������α�׼ʱ�� 1970 �� 1 �� 1 �յ� 00:00:00���������������ƫ������ 
	     *  
	     * @param key 
	     * @param unixTime 
	     *            UNIXʱ��� 
	     * @return result �������ʱ�����óɹ������� 1 �� �� key �����ڻ�û�취��������ʱ�䣬���� 0 �� 
	     */  
	    public static Long expireAt(byte[] key, long unixTime) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.expireAt(key, unixTime);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ����Ϊ��λ�����ظ��� key ��ʣ������ʱ��(TTL, time to live)�� 
	     *  
	     * @param key 
	     * @return result �� key ������ʱ������ -2 �� �� key ���ڵ�û������ʣ������ʱ��ʱ������ -1 �� 
	     *         ��������Ϊ��λ������ key ��ʣ������ʱ�䡣 
	     */  
	    public static Long ttl(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.ttl(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ����Ϊ��λ�����ظ��� key ��ʣ������ʱ��(TTL, time to live)�� 
	     *  
	     * @param key 
	     * @return result �� key ������ʱ������ -2 �� �� key ���ڵ�û������ʣ������ʱ��ʱ������ -1 �� 
	     *         ��������Ϊ��λ������ key ��ʣ������ʱ�䡣 
	     */  
	    public static Long ttl(byte[] key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.ttl(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ���ǰ���ݿ��и��� key ������ʱ�䣬����� key �ӡ���ʧ�ġ�(������ʱ�� key )ת���ɡ��־õġ�(һ����������ʱ�䡢�������ڵ� 
	     * key )�� 
	     *  
	     * @param key 
	     * @return result ������ʱ���Ƴ��ɹ�ʱ������ 1 . ��� key �����ڻ� key û����������ʱ�䣬���� 0 �� 
	     */  
	    public static Long persist(String key) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.persist(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ���ǰ���ݿ��и��� key ������ʱ�䣬����� key �ӡ���ʧ�ġ�(������ʱ�� key )ת���ɡ��־õġ�(һ����������ʱ�䡢�������ڵ� 
	     * key )�� 
	     *  
	     * @param key 
	     * @return result ������ʱ���Ƴ��ɹ�ʱ������ 1 . ��� key �����ڻ� key û����������ʱ�䣬���� 0 �� 
	     */  
	    public static Long persist(byte[] key) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.persist(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ɾ����ǰ���ݿ��и�����һ������ key �������ڵ� key �ᱻ���ԡ� 
	     *  
	     * @param keys 
	     * @return result ��ɾ�� key �������� 
	     */  
	    public static Long del(String... keys) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.del(keys);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ɾ����ǰ���ݿ��и�����һ������ key �������ڵ� key �ᱻ���ԡ� 
	     *  
	     * @param keys 
	     * @return result ��ɾ�� key �������� 
	     */  
	    public static Long del(byte[]... keys) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.del(keys);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ɾ����Ⱥ�����и�����һ��key �������ڵ� key �ᱻ���ԡ� 
	     *  
	     * @param key 
	     * @return result ��ɾ�� key �������� 
	     */  
	    public static Long del(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.del(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ɾ����Ⱥ�����и�����һ��key �������ڵ� key �ᱻ���ԡ� 
	     *  
	     * @param key 
	     * @return result ��ɾ�� key �������� 
	     */  
	    public static Long del(byte[] key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.del(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ������ key �Ƿ���ڡ� 
	     *  
	     * @param key 
	     * @return result �� key ���ڣ����� 1 �����򷵻� 0 �� 
	     */  
	    public static Boolean exists(String key) {  
	        Boolean result = false;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.exists(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ������ key �Ƿ���ڡ� 
	     *  
	     * @param key 
	     * @return result �� key ���ڣ����� 1 �����򷵻� 0 �� 
	     */  
	    public static Boolean exists(byte[] key) {  
	        Boolean result = false;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.exists(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ����ǰ���ݿ�� key �ƶ������������ݿ� db ���С� <br> 
	     * �����ǰ���ݿ�(Դ���ݿ�)�͸������ݿ�(Ŀ�����ݿ�)����ͬ���ֵĸ��� key ������ key �������ڵ�ǰ���ݿ⣬��ô MOVE û���κ�Ч���� 
	     *  
	     * @param key 
	     * @param dbIndex 
	     *            ���ݿ������� 
	     * @return result �ƶ��ɹ����� 1 ��ʧ���򷵻� 0 �� 
	     */  
	    public static Long move(String key, int dbIndex) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.move(key, dbIndex);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ػ򱣴�����б����ϡ����򼯺� key �о��������Ԫ�ء�����Ĭ����������Ϊ����ֵ������Ϊ˫���ȸ�������Ȼ����бȽϡ� 
	     *  
	     * @param key 
	     * @return result �����б���ʽ�������� 
	     */  
	    public static List<String> sort(String key) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.sort(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ػ򱣴�����б����ϡ����򼯺� key �о��������Ԫ�ء�����Ĭ����������Ϊ����ֵ������Ϊ˫���ȸ�������Ȼ����бȽϡ�<br> 
	     * ��򵥵� SORT ʹ�÷����� SORT key �� SORT key DESC <br> 
	     * ��Ϊ SORT ����Ĭ���������Ϊ���֣� ����Ҫ���ַ�����������ʱ�� ��Ҫ��ʽ���� SORT ����֮����� ALPHA ���η�<br> 
	     * ����֮�󷵻�Ԫ�ص���������ͨ�� LIMIT ���η��������ƣ� ���η����� offset(Ҫ������Ԫ������) �� count(���� offset 
	     * ��ָ����Ԫ��֮��Ҫ���ض��ٸ�����) ��������<br> 
	     *  
	     * �ο���http://redisdoc.com/key/sort.html 
	     *  
	     * @param key 
	     * @param sortingParameters 
	     *            ������� 
	     * @return result �����б���ʽ�������� 
	     */  
	    public static List<String> sort(String key, SortingParams sortingParameters) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.sort(key, sortingParameters);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ========================�Դ洢�ṹΪString���ַ��������͵Ĳ���======================== */  
	  
	    /** 
	     * ���ַ���ֵ value ������ key ����� key �Ѿ���������ֵ�� SET �͸�д��ֵ���������͡� 
	     *  
	     * @param key 
	     * @param value 
	     * @return result SET�����ò����ɹ����ʱ���ŷ��� OK ��������ò���δִ�У���ô����ؿ������ظ���NULL Bulk 
	     *         Reply���� 
	     */  
	    public static String set(String key, String value) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            // result = shardedJedis.set(SafeEncoder.encode(key),  
	            // SafeEncoder.encode(value));  
	            result = shardedJedis.set(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ַ���ֵ value ������ key ����� key �Ѿ���������ֵ�� SET �͸�д��ֵ���������͡�<br> 
	     * EX second �����ü��Ĺ���ʱ��Ϊ second �롣 SET key value EX second Ч����ͬ�� SETEX key 
	     * second value ��<br> 
	     * PX millisecond �����ü��Ĺ���ʱ��Ϊ millisecond ���롣 SET key value PX millisecond 
	     * Ч����ͬ�� PSETEX key millisecond value ��<br> 
	     * NX ��ֻ�ڼ�������ʱ���ŶԼ��������ò����� SET key value NX Ч����ͬ�� SETNX key value ��<br> 
	     * XX ��ֻ�ڼ��Ѿ�����ʱ���ŶԼ��������ò����� 
	     *  
	     * @param key 
	     * @param value 
	     * @param value 
	     *            nxxx ���� 
	     * @return result SET�����ò����ɹ����ʱ���ŷ��� OK ��������ò���δִ�У���ô����ؿ������ظ���NULL Bulk 
	     *         Reply���� 
	     */  
	    public static String set(String key, String value, String nxxx) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.set(key, value, nxxx);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key ��ֵ��Ϊ value �����ҽ��� key �����ڡ� <br> 
	     * �������� key �Ѿ����ڣ��� SETNX �����κζ����� 
	     *  
	     * @param key 
	     * @param value 
	     *            ֵ 
	     * @return ���óɹ������� 1 �� ����ʧ�ܣ����� 0 �� 
	     */  
	    public static Long setnx(String key, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setnx(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key ��ֵ��Ϊ value �����ҽ��� key �����ڡ� <br> 
	     * �������� key �Ѿ����ڣ��� SETNX �����κζ����� 
	     *  
	     * @param key 
	     * @param value 
	     *            ֵ 
	     * @return ���óɹ������� 1 �� ����ʧ�ܣ����� 0 �� 
	     */  
	    public static Long setnx(byte[] key, byte[] value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setnx(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key ���������ַ���ֵ��GET ֻ�����ڴ����ַ���ֵ�� 
	     *  
	     * @param key 
	     * @return result �� key ������ʱ������ nil �����򣬷��� key ��ֵ�� ��� key �����ַ������ͣ���ô����һ������ 
	     */  
	    public static String get(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.get(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ص�ǰ���ݿ�������(һ������)���� key ��ֵ�� <br> 
	     * ��������� key ���棬��ĳ�� key �����ڣ���ô��� key ��������ֵ nil ����ˣ�����������ʧ�ܡ� 
	     *  
	     * @param keys 
	     * @return һ���������и��� key ��ֵ���б� 
	     */  
	    public static List<String> mget(String... keys) {  
	        List<String> result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.mget(keys);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �ڵ�ǰ���ݿ���ͬʱ����һ������ key-value �ԡ� <br> 
	     * ���ĳ������ key �Ѿ����ڣ���ô MSET ������ֵ����ԭ���ľ�ֵ������ⲻ������ϣ����Ч�����뿼��ʹ�� MSETNX �����ֻ�������и��� 
	     * key �������ڵ�����½������ò����� 
	     *  
	     * @param keys 
	     * @return ���Ƿ��� OK (��Ϊ MSET ������ʧ��) 
	     */  
	    public static String mset(String... keysvalues) {  
	        String result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.mset(keysvalues);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �ڵ�ǰ���ݿ���ͬʱ����һ������ key-value �ԣ����ҽ������и��� key �������ڡ� <br> 
	     * ��ʹֻ��һ������ key �Ѵ��ڣ� MSETNX Ҳ��ܾ�ִ�����и��� key �����ò����� 
	     *  
	     * @param keys 
	     * @return ������ key ���ɹ����ã����� 1 �� ������и��� key ������ʧ��(������һ�� key �Ѿ�����)����ô���� 0 �� 
	     */  
	    public static Long msetnx(String... keysvalues) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.msetnx(keysvalues);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key ��������ַ���ֵ�ĳ��ȡ� �� key ����Ĳ����ַ���ֵʱ������һ������ 
	     *  
	     * @param keys 
	     * @return �ַ���ֵ�ĳ��ȡ� �� key ������ʱ������ 0 �� 
	     */  
	    public static Long strlen(String key) {  
	        Long result = null;  
	  
	        Jedis jedis = getJedis();  
	        if (jedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = jedis.strlen(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            jedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ������ key ��ֵ��Ϊ value �������� key �ľ�ֵ(old value)�� 
	     *  
	     * @param key 
	     * @param value 
	     * @return ���ظ��� key �ľ�ֵ�� �� key û�о�ֵʱ��Ҳ���ǣ� key ������ʱ������ nil �� 
	     */  
	    public static String getSet(String key, String value) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getSet(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ������ key ��ֵ��Ϊ value �������� key �ľ�ֵ(old value)�� 
	     *  
	     * @param key 
	     * @param value 
	     * @return ���ظ��� key �ľ�ֵ�� �� key û�о�ֵʱ��Ҳ���ǣ� key ������ʱ������ nil �� 
	     */  
	    public static byte[] getSet(byte[] key, byte[] value) {  
	        byte[] result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getSet(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key ��������ַ���ֵ�����û����ָ��ƫ�����ϵ�λ(bit)�� 
	     *  
	     * @param key 
	     * @param offset 
	     *            ƫ������offset����������ڻ���� 0 ��С�� 2^32 (bit ӳ�䱻������ 512 MB ֮��)�� 
	     * @param value 
	     *            λ�����û����ȡ���� value ������������ 0 Ҳ������ 1 �� 
	     * @return result ָ��ƫ����ԭ�������λ�� 
	     */  
	    public static boolean setbit(String key, long offset, boolean value) {  
	        boolean result = false;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setbit(key, offset, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key ��������ַ���ֵ����ȡָ��ƫ�����ϵ�λ(bit)�� 
	     *  
	     * @param key 
	     * @param offset 
	     *            ƫ���� 
	     * @return result ָ��ƫ����ԭ�������λ�� 
	     */  
	    public static boolean getbit(String key, long offset) {  
	        boolean result = false;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getbit(key, offset);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� value ������д(overwrite)���� key ��������ַ���ֵ����ƫ���� offset ��ʼ��<br> 
	     * ��:String str="hello world";<br> 
	     * ��str������setrange(key,6,Redis)��str="hello Redis";<br> 
	     * �����ڵ� key �����հ��ַ�������<br> 
	     * redis> SETRANGE empty_string 5 "Redis!" # �Բ����ڵ� key ʹ�� SETRANGE <br> 
	     * redis> GET empty_string # �հ״���"\x00"��� 
	     *  
	     * @param key 
	     * @param offset 
	     *            ƫ���� 
	     * @param value 
	     *            ֵ 
	     * @return result ���޸�֮���ַ����ĳ��ȡ� 
	     */  
	    public static Long setrange(String key, long offset, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setrange(key, offset, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key ���ַ���ֵ�����ַ������ַ����Ľ�ȡ��Χ�� start �� end ����ƫ��������(���� start �� end ����)��<br> 
	     * ����ƫ������ʾ���ַ������ʼ������ -1 ��ʾ���һ���ַ��� -2 ��ʾ�����ڶ������Դ����ơ� 
	     *  
	     * @param key 
	     * @param startOffset 
	     *            ��ʼλ��(����) 
	     * @param endOffset 
	     *            ����λ��(����) 
	     * @return result ��ȡ�ó������ַ����� 
	     */  
	    public static String getrange(String key, long startOffset, long endOffset) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getrange(key, startOffset, endOffset);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���� key ���ַ���ֵ�����ַ������ַ����Ľ�ȡ��Χ�� start �� end ����ƫ��������(���� start �� end ����)��<br> 
	     * ����ƫ������ʾ���ַ������ʼ������ -1 ��ʾ���һ���ַ��� -2 ��ʾ�����ڶ������Դ����ơ� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ��(����) 
	     * @param end 
	     *            ����λ��(����) 
	     * @return result ��ȡ�ó������ַ����� 
	     */  
	    public static String substr(String key, int start, int end) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.substr(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��ֵ value ������ key ������ key ������ʱ����Ϊ seconds (����Ϊ��λ)��<br> 
	     * ��� key �Ѿ����ڣ� SETEX �����д��ֵ�� 
	     *  
	     * @param key 
	     * @param seconds 
	     *            ����ʱ�䣬����Ϊ��λ 
	     * @param value 
	     *            ֵ 
	     * @return result ���óɹ�ʱ���� OK �� �� seconds �������Ϸ�ʱ������һ������ 
	     */  
	    public static String setex(String key, int seconds, String value) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setex(key, seconds, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��ֵ value ������ key ������ key ������ʱ����Ϊ seconds (����Ϊ��λ)�� <br> 
	     * ��� key �Ѿ����ڣ� SETEX �����д��ֵ�� 
	     *  
	     * @param key 
	     * @param seconds 
	     *            ����ʱ�䣬����Ϊ��λ 
	     * @param value 
	     *            ֵ 
	     * @return result ���óɹ�ʱ���� OK �� �� seconds �������Ϸ�ʱ������һ������ 
	     */  
	    public static String setex(byte[] key, int seconds, byte[] value) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.setex(key, seconds, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��key��Ӧ��value��ȥָ����ֵ��ֻ��value����תΪ����ʱ�÷����ſ��á� <br> 
	     * ��� key �����ڣ���ô key ��ֵ���ȱ���ʼ��Ϊ 0 ��Ȼ����ִ�� DECRBY ������ 
	     *  
	     * @param key 
	     * @param integer 
	     *            Ҫ��ȥ��ֵ 
	     * @return ��ȥ֮���ֵ 
	     */  
	    public static Long decrBy(String key, long integer) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.decrBy(key, integer);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��key��Ӧ��value��ȥָ����ֵ��ֻ��value����תΪ����ʱ�÷����ſ��á�<br> 
	     * ��� key �����ڣ���ô key ��ֵ���ȱ���ʼ��Ϊ 0 ��Ȼ����ִ�� DECRBY ������ 
	     *  
	     * @param key 
	     * @param integer 
	     *            Ҫ��ȥ��ֵ 
	     * @return ��ȥ֮���ֵ 
	     */  
	    public static Long decrBy(byte[] key, long integer) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.decrBy(key, integer);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key �д��������ֵ��һ�� ��� key �����ڣ���ô key ��ֵ���ȱ���ʼ��Ϊ 0 ��Ȼ����ִ�� DECR ������ 
	     *  
	     * @param key 
	     * @return result ִ�� DECR ����֮�� key ��ֵ�� 
	     */  
	    public static Long decr(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.decr(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key �������ֵ�������� integer �� ��� key �����ڣ���ô key ��ֵ���ȱ���ʼ��Ϊ 0 ��Ȼ����ִ�� INCRBY ��� 
	     *  
	     * @param key 
	     * @param integer 
	     *            Ҫ���ӵ�ֵ 
	     * @return result ���� integer ֮�� key ��ֵ�� 
	     */  
	    public static Long incrBy(String key, long integer) {  
	        Long result = null;  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.incrBy(key, integer);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �� key �д��������ֵ��һ�� ��� key �����ڣ���ô key ��ֵ���ȱ���ʼ��Ϊ 0 ��Ȼ����ִ�� INCR ������ 
	     *  
	     * @param key 
	     * @return result ִ�� INCR ����֮�� key ��ֵ�� 
	     */  
	    public static Long incr(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.incr(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��� key �Ѿ����ڲ�����һ���ַ����� APPEND ��� value ׷�ӵ� key ԭ����ֵ��ĩβ�� <br> 
	     * ��� key �����ڣ� APPEND �ͼ򵥵ؽ����� key ��Ϊ value ������ִ�� SET key value һ���� 
	     *  
	     * @param key 
	     * @param value 
	     * @return result ׷�� value ֮�� key ���ַ����ĳ��ȡ� 
	     */  
	    public static Long append(String key, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.append(key, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ========================�Դ洢�ṹΪHash����ϣ�����͵Ĳ���======================== */  
	  
	    /** 
	     * ����ϣ�� key �е��� field ��ֵ��Ϊ value �� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @param value 
	     *            ֵ 
	     * @return result ��� field �ǹ�ϣ���е�һ���½��򣬲���ֵ���óɹ������� 1 �� �����ϣ������ field 
	     *         �Ѿ������Ҿ�ֵ�ѱ���ֵ���ǣ����� 0 �� 
	     */  
	    public static Long hset(String key, String field, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hset(key, field, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ����ϣ�� key �е��� field ��ֵ����Ϊ value �����ҽ����� field �����ڡ� <br> 
	     * ���� field �Ѿ����ڣ��ò�����Ч�� ��� key �����ڣ�һ���¹�ϣ��������ִ�� HSETNX ��� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @param value 
	     *            ֵ 
	     * @return result ���óɹ������� 1 �� ����������Ѿ�������û�в�����ִ�У����� 0 �� 
	     */  
	    public static Long hsetnx(String key, String field, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hsetnx(key, field, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ͬʱ����� field-value (��-ֵ)�����õ���ϣ�� key �С� ������Ḳ�ǹ�ϣ�����Ѵ��ڵ������ key 
	     * �����ڣ�һ���չ�ϣ��������ִ�� HMSET ������ 
	     *  
	     * @param key 
	     * @param hash 
	     * @return result �������ִ�гɹ������� OK �� �� key ���ǹ�ϣ��(hash)����ʱ������һ������ 
	     */  
	    public static String hmset(String key, Map<String, String> hash) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hmset(key, hash);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key �и����� field ��ֵ�� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @return result �������ֵ�� �������򲻴��ڻ��Ǹ��� key ������ʱ������ nil �� 
	     */  
	    public static String hget(String key, String field) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hget(key, field);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key �У�һ�������������ֵ�� ����������򲻴����ڹ�ϣ����ô����һ�� nil ֵ�� 
	     *  
	     * @param key 
	     * @param fields 
	     *            ���б� 
	     * @return result һ���������������Ĺ���ֵ�ı���ֵ������˳��͸��������������˳��һ���� 
	     */  
	    public static List<String> hmget(String key, String... fields) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hmget(key, fields);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * Ϊ��ϣ�� key �е��� field ��ֵ�������� value ������Ҳ����Ϊ�������൱�ڶԸ�������м��������� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @param value 
	     * @return result ִ�� HINCRBY ����֮�󣬹�ϣ�� key ���� field ��ֵ�� 
	     */  
	    public static Long hincrBy(String key, String field, long value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hincrBy(key, field, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �鿴��ϣ�� key �У������� field �Ƿ���ڡ� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @return result �����ϣ���и����򣬷��� 1 �� �����ϣ�����и����򣬻� key �����ڣ����� 0 �� 
	     */  
	    public static Boolean hexists(String key, String field) {  
	        Boolean result = false;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hexists(key, field);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ɾ����ϣ�� key �е�һ������ָ���򣬲����ڵ��򽫱����ԡ� 
	     *  
	     * @param key 
	     * @param field 
	     *            �� 
	     * @return result ���ɹ��Ƴ�����������������������Ե��� 
	     */  
	    public static Long hdel(String key, String field) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hdel(key, field);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key ����������� 
	     *  
	     * @param key 
	     * @return result ��ϣ������������� �� key ������ʱ������ 0 �� 
	     */  
	    public static Long hlen(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hlen(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key �е������� 
	     *  
	     * @param key 
	     * @return result һ��������ϣ����������ı� �� key ������ʱ������һ���ձ� 
	     */  
	    public static Set<String> hkeys(String key) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hkeys(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key ���������ֵ�� 
	     *  
	     * @param key 
	     * @return result һ��������ϣ��������ֵ�ı� �� key ������ʱ������һ���ձ� 
	     */  
	    public static List<String> hvals(String key) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hvals(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ع�ϣ�� key �У����е����ֵ�� <br> 
	     * �ڷ���ֵ�����ÿ������(field name)֮�������ֵ(value)�����Է���ֵ�ĳ����ǹ�ϣ���С�������� 
	     *  
	     * @param key 
	     * @return result ���б���ʽ���ع�ϣ���������ֵ�� �� key �����ڣ����ؿ��б� 
	     */  
	    public static Map<String, String> hgetAll(String key) {  
	        Map<String, String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.hgetAll(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	        return result;  
	    }  
	  
	    /** ========================�Դ洢�ṹΪList���б����͵Ĳ���======================== */  
	  
	    /** 
	     * ��һ������ֵ value ���뵽�б� key �ı�β(���ұ�)�� ����ж�� value ֵ����ô���� value 
	     * ֵ�������ҵ�˳�����β��뵽��β�������һ�����б� mylist ִ�� RPUSH mylist a b c ���ó��Ľ���б�Ϊ a b c 
	     * ����ͬ��ִ������ RPUSH mylist a �� RPUSH mylist b �� RPUSH mylist c �� <br> 
	     * ��� key �����ڣ�һ�����б�ᱻ������ִ�� RPUSH ������ <br> 
	     * �� key ���ڵ������б�����ʱ������һ������ 
	     *  
	     * @param key 
	     * @param string 
	     *            һ������stringֵ 
	     * @return result ִ�� RPUSH �����󣬱�ĳ��ȡ� 
	     */  
	    public static Long rpush(String key, String... string) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.rpush(key, string);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��ֵ value ���뵽�б� key �ı�β�����ҽ��� key ���ڲ�����һ���б� <br> 
	     * �� RPUSH �����෴���� key ������ʱ�� RPUSHX ����ʲôҲ������ 
	     *  
	     * @param key 
	     * @param string 
	     *            һ������stringֵ 
	     * @return result RPUSHX ����ִ��֮�󣬱�ĳ��ȡ� 
	     */  
	    public static Long rpushx(String key, String... string) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.rpushx(key, string);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��һ������ֵ value ���뵽�б� key �ı�ͷ ����ж�� value ֵ����ô���� value ֵ�������ҵ�˳�����β��뵽��ͷ�� 
	     * ����˵���Կ��б� mylist ִ������ LPUSH mylist a b c ���б��ֵ���� c b a �����ͬ��ԭ���Ե�ִ�� LPUSH 
	     * mylist a �� LPUSH mylist b �� LPUSH mylist c �������<br> 
	     * ��� key �����ڣ�һ�����б�ᱻ������ִ�� LPUSH ������ <br> 
	     * �� key ���ڵ������б�����ʱ������һ������ 
	     *  
	     * @param key 
	     * @param string 
	     *            һ������stringֵ 
	     * @return result ִ�� LPUSH ������б�ĳ��ȡ� 
	     */  
	    public static Long lpush(String key, String... string) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lpush(key, string);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��ֵ value ���뵽�б� key �ı�ͷ�����ҽ��� key ���ڲ�����һ���б�<br> 
	     * �� LPUSH �����෴���� key ������ʱ�� LPUSHX ����ʲôҲ������ 
	     *  
	     * @param key 
	     * @param string 
	     *            һ������stringֵ 
	     * @return result ִ�� LPUSHX ������б�ĳ��ȡ� 
	     */  
	    public static Long lpushx(String key, String... string) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lpushx(key, string);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �����б� key �ĳ��ȡ�<br> 
	     * ��� key �����ڣ��� key ������Ϊһ�����б����� 0 .<br> 
	     * ��� key �����б����ͣ�����һ������ 
	     *  
	     * @param key 
	     * @return result �б� key �ĳ��ȡ� 
	     */  
	    public static Long llen(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.llen(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �����б� key ��ָ�������ڵ�Ԫ�أ�������ƫ���� start �� stop ָ����<br> 
	     * �±�(index)���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ�б�ĵ�һ��Ԫ�أ��� 1 ��ʾ�б�ĵڶ���Ԫ�أ��Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ�б�����һ��Ԫ�أ� -2 ��ʾ�б�ĵ����ڶ���Ԫ�أ��Դ����ơ�<br> 
	     * ������Χ���±�ֵ����������� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ�� 
	     * @param end 
	     *            �������Ϊ��������β����ʼ���� 
	     * @return result һ���б�����ָ�������ڵ�Ԫ�ء� 
	     */  
	    public static List<String> lrange(String key, long start, long end) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lrange(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��һ���б�����޼�(trim)������˵�����б�ֻ����ָ�������ڵ�Ԫ�أ�����ָ������֮�ڵ�Ԫ�ض�����ɾ����<br> 
	     * �±�(index)���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ�б�ĵ�һ��Ԫ�أ��� 1 ��ʾ�б�ĵڶ���Ԫ�أ��Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ�б�����һ��Ԫ�أ� -2 ��ʾ�б�ĵ����ڶ���Ԫ�أ��Դ����ơ�<br> 
	     * �� key �����б�����ʱ������һ������<br> 
	     * ������Χ���±�ֵ����������� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ�� 
	     * @param end 
	     *            ����λ�ã���β����ʼ���� 
	     * @return result ����ִ�гɹ�ʱ������ ok �� 
	     */  
	    public static String ltrim(String key, long start, long end) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.ltrim(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �����б� key �У��±�Ϊ index ��Ԫ�ء�<br> 
	     * �±�(index)���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ�б�ĵ�һ��Ԫ�أ��� 1 ��ʾ�б�ĵڶ���Ԫ�أ��Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ�б�����һ��Ԫ�أ� -2 ��ʾ�б�ĵ����ڶ���Ԫ�أ��Դ����ơ�<br> 
	     * ��� key �����б����ͣ�����һ������ 
	     *  
	     * @param key 
	     * @param index 
	     *            �±� 
	     * @return result �б����±�Ϊ index ��Ԫ�ء� ��� index ������ֵ�����б�����䷶Χ�ڣ����� nil �� 
	     */  
	    public static String lindex(String key, long index) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lindex(key, index);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���б� key �±�Ϊ index ��Ԫ�ص�ֵ����Ϊ value ��<br> 
	     * �� index ����������Χ�����һ�����б�( key ������)���� LSET ʱ������һ������<br> 
	     * �����б��±�ĸ�����Ϣ����ο� LINDEX ��� 
	     *  
	     * @param key 
	     * @param index 
	     *            �±� 
	     * @param value 
	     *            ֵ 
	     * @return result �����ɹ����� ok �����򷵻ش�����Ϣ�� 
	     */  
	    public static String lset(String key, long index, String value) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lset(key, index, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ݲ��� count ��ֵ���Ƴ��б�������� value ��ȵ�Ԫ�ء�<br> 
	     * count ��ֵ���������¼��֣�<br> 
	     * count > 0 : �ӱ�ͷ��ʼ���β�������Ƴ��� value ��ȵ�Ԫ�أ�����Ϊ count ��<br> 
	     * count < 0 : �ӱ�β��ʼ���ͷ�������Ƴ��� value ��ȵ�Ԫ�أ�����Ϊ count �ľ���ֵ��<br> 
	     * count = 0 : �Ƴ����������� value ��ȵ�ֵ�� 
	     *  
	     * @param key 
	     * @param count 
	     *            Ҫɾ�������������Ϊ�������List��β����鲢ɾ�����ϵļ�¼ 
	     * @param value 
	     *            Ҫƥ��ɾ����ֵ 
	     * @return result ���Ƴ�Ԫ�ص������� ��Ϊ�����ڵ� key �������ձ�(empty list)�����Ե� key ������ʱ�� LREM 
	     *         �������Ƿ��� 0 �� 
	     */  
	    public static Long lrem(String key, long count, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lrem(key, count, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ��������б� key ��ͷԪ�ء� 
	     *  
	     * @param key 
	     * @return result �б��ͷԪ�ء� �� key ������ʱ������ nil �� 
	     */  
	    public static String lpop(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.lpop(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ��������б� key ��βԪ�ء� 
	     *  
	     * @param key 
	     * @return result �б��βԪ�ء� �� key ������ʱ������ nil �� 
	     */  
	    public static String rpop(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.rpop(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ��ֵ value ���뵽�б� key ���У�λ��ֵ pivot ֮ǰ��֮��<br> 
	     * �� pivot ���������б� key ʱ����ִ���κβ�����<br> 
	     * �� key ������ʱ�� key ����Ϊ���б���ִ���κβ�����<br> 
	     * ��� key �����б����ͣ�����һ������ 
	     *  
	     * @param key 
	     * @param where 
	     *            ǰ������������ 
	     * @param pivot 
	     *            ���λ�õ����� 
	     * @param value 
	     *            ��������� 
	     * @return result �������ִ�гɹ������ز���������֮���б�ĳ��ȡ� ���û���ҵ� pivot ������ -1 �� ��� key 
	     *         �����ڻ�Ϊ���б����� 0 �� 
	     */  
	    public static Long linsert(String key, LIST_POSITION where, String pivot, String value) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.linsert(key, where, pivot, value);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ========================�Դ洢�ṹΪSet�����ϣ����͵Ĳ���======================== */  
	  
	    /** 
	     * ��һ������ member Ԫ�ؼ��뵽���� key ���У��Ѿ������ڼ��ϵ� member Ԫ�ؽ������ԡ�<br> 
	     * ���� key �����ڣ��򴴽�һ��ֻ���� member Ԫ������Ա�ļ��ϡ�<br> 
	     * �� key ���Ǽ�������ʱ������һ������ 
	     *  
	     * @param key 
	     * @param member 
	     *            Ԫ�� 
	     * @return result ����ӵ������е���Ԫ�ص������������������Ե�Ԫ�ء� 
	     */  
	    public static Long sadd(String key, String... member) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.sadd(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ؼ��� key �е����г�Ա�� �����ڵ� key ����Ϊ�ռ��ϡ� 
	     *  
	     * @param key 
	     * @return result �����е����г�Ա�� 
	     */  
	    public static Set<String> smembers(String key) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.smembers(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ����� key �е�һ������ member Ԫ�أ������ڵ� member Ԫ�ػᱻ���ԡ� 
	     *  
	     * �� key ���Ǽ������ͣ�����һ������ 
	     *  
	     * @param key 
	     * @param member 
	     *            Ԫ�� 
	     * @return result ���ɹ��Ƴ���Ԫ�ص������������������Ե�Ԫ�ء� 
	     */  
	    public static Long srem(String key, String member) {  
	        ShardedJedis shardedJedis = getShardedJedis();  
	  
	        Long result = null;  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.srem(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	  
	        } finally {  
	            shardedJedis.close();  
	        }  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ������ؼ����е�һ�����Ԫ�ء�<br> 
	     * ���ֻ���ȡһ�����Ԫ�أ��������Ԫ�شӼ����б��Ƴ��Ļ�������ʹ�� SRANDMEMBER ��� 
	     *  
	     * @param key 
	     * @return result ���Ƴ������Ԫ�ء� �� key �����ڻ� key �ǿռ�ʱ������ nil �� 
	     */  
	    public static String spop(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.spop(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ؼ����е�һ�����Ԫ�ء� 
	     *  
	     * @param key 
	     * @return result ����һ��Ԫ�أ��������Ϊ�գ����� nil �� 
	     */  
	    public static String srandmember(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.srandmember(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ؼ����е�count�����Ԫ�ء�<br> 
	     * ��� count Ϊ��������С�ڼ��ϻ�������ô�����һ������ count ��Ԫ�ص����飬�����е�Ԫ�ظ�����ͬ����� count 
	     * ���ڵ��ڼ��ϻ�������ô�����������ϡ�<br> 
	     * ��� count Ϊ��������ô�����һ�����飬�����е�Ԫ�ؿ��ܻ��ظ����ֶ�Σ�������ĳ���Ϊ count �ľ���ֵ�� 
	     *  
	     * @param key 
	     * @param count 
	     *            Ԫ�ظ��� 
	     * @return result ����һ�����飻�������Ϊ�գ����ؿ����顣 
	     */  
	    public static List<String> srandmember(String key, int count) {  
	        List<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.srandmember(key, count);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * ���ؼ��� key �Ļ���(������Ԫ�ص�����)�� 
	     *  
	     * @param key 
	     * @return result ���ϵĻ����� �� key ������ʱ������ 0 �� 
	     */  
	    public static Long scard(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.scard(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �ж� member Ԫ���Ƿ񼯺� key �ĳ�Ա�� 
	     *  
	     * @param key 
	     * @param member 
	     *            Ԫ�� 
	     * @return result ���memberԪ���Ǽ��ϵĳ�Ա������ 1����� memberԪ�ز��Ǽ��ϵĳ�Ա���� key�����ڣ����� 0�� 
	     */  
	    public static Boolean sismember(String key, String member) {  
	        Boolean result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.sismember(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ====================�Դ洢�ṹΪSortedSet�����򼯺ϣ����͵Ĳ���==================== */  
	  
	    /** 
	     * ��һ������ member Ԫ�ؼ��� score ֵ���뵽���� key ���С�<br> 
	     * ���ĳ�� member �Ѿ������򼯵ĳ�Ա����ô������� member �� score ֵ����ͨ�����²������ member Ԫ�أ�����֤�� 
	     * member ����ȷ��λ���ϡ�<br> 
	     * score ֵ����������ֵ��˫���ȸ�������<br> 
	     * ��� key �����ڣ��򴴽�һ���յ����򼯲�ִ�� ZADD ������ 
	     *  
	     * @param key 
	     * @param score 
	     * @param member 
	     *            ��Ա 
	     * @return result ���ɹ���ӵ��³�Ա����������������Щ�����µġ��Ѿ����ڵĳ�Ա�� 
	     */  
	    public static Long zadd(String key, double score, String member) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zadd(key, score, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У�ָ�������ڵĳ�Ա�� ���г�Ա��λ�ð� score ֵ����(��С����)������<br> 
	     * �±���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ���򼯵�һ����Ա���� 1 ��ʾ���򼯵ڶ�����Ա���Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ���һ����Ա�� -2 ��ʾ�����ڶ�����Ա���Դ����ơ�<br> 
	     * ������Χ���±겢����������� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ�� 
	     * @param end 
	     *            ����λ�� 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrange(String key, int start, int end) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrange(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У�ָ�������ڵĳ�Ա�� ���г�Ա��λ�ð� score ֵ�ݼ�(�Ӵ�С)�����С�<br> 
	     * �±���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ���򼯵�һ����Ա���� 1 ��ʾ���򼯵ڶ�����Ա���Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ���һ����Ա�� -2 ��ʾ�����ڶ�����Ա���Դ����ơ�<br> 
	     * ������Χ���±겢����������� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ�� 
	     * @param end 
	     *            ����λ�� 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrevrange(String key, int start, int end) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrange(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ����� key �е�һ��������Ա�������ڵĳ�Ա�������ԡ� �� key ���ڵ�������������ʱ������һ������ 
	     *  
	     * @param key 
	     * @param member 
	     *            ��Ա 
	     * @return result ���ɹ��Ƴ��ĳ�Ա�������������������Եĳ�Ա�� 
	     */  
	    public static Long zrem(String key, String... member) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrem(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * Ϊ���� key �ĳ�Ա member �� score ֵ�������� ��<br> 
	     * �� key �����ڣ��� member ���� key �ĳ�Աʱ�� ZINCRBY key increment member ��ͬ�� ZADD key 
	     * increment member ��<br> 
	     * �� key ������������ʱ������һ������ 
	     *  
	     * @param key 
	     * @param score 
	     *            score ֵ����������ֵ��˫���ȸ������� 
	     * @param member 
	     *            ��Ա 
	     * @return result member��Ա���� score ֵ�����ַ�����ʽ��ʾ�� 
	     */  
	    public static Double zincrby(String key, double score, String member) {  
	        Double result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zincrby(key, score, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �г�Ա member ���������������򼯳�Ա�� score ֵ����(��С����)˳�����С�<br> 
	     * ������ 0 Ϊ�ף�Ҳ����˵�� score ֵ��С�ĳ�Ա����Ϊ 0 �� 
	     *  
	     * @param key 
	     * @param member 
	     *            ��Ա 
	     * @return result ��� member ������ key �ĳ�Ա������ member �������� ��� member �������� key 
	     *         �ĳ�Ա������ nil �� 
	     */  
	    public static Long zrank(String key, String member) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrank(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �г�Ա member ���������������򼯳�Ա�� score ֵ�ݼ�(�Ӵ�С)����<br> 
	     * ������ 0 Ϊ�ף�Ҳ����˵�� score ֵ���ĳ�Ա����Ϊ 0 �� 
	     *  
	     * @param key 
	     * @param member 
	     *            ��Ա 
	     * @return result ��� member ������ key �ĳ�Ա������ member �������� ��� member �������� key 
	     *         �ĳ�Ա������ nil �� 
	     */  
	    public static Long zrevrank(String key, String member) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrank(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �Ļ����� 
	     *  
	     * @param key 
	     * @return result �� key ����������������ʱ���������򼯵Ļ����� �� key ������ʱ������ 0 �� 
	     */  
	    public static Long zcard(String key) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zcard(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У���Ա member �� score ֵ��<br> 
	     * ��� member Ԫ�ز������� key �ĳ�Ա���� key �����ڣ����� nil �� 
	     *  
	     * @param key 
	     * @param member 
	     *            ��Ա 
	     * @return result member ��Ա�� score ֵ�����ַ�����ʽ��ʾ�� 
	     */  
	    public static Double zscore(String key, String member) {  
	        Double result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zscore(key, member);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У����� score ֵ���� min �� max ֮��(�������� min �� max )�ĳ�Ա�����򼯳�Ա�� score 
	     * ֵ����(��С����)�������С� 
	     *  
	     * @param key 
	     * @param min 
	     *            ��С��ֵ 
	     * @param max 
	     *            ����ֵ 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrangeByScore(String key, double min, double max) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrangeByScore(key, min, max);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У����� score ֵ���� min �� max ֮��(�������� min �� max )�ĳ�Ա�����򼯳�Ա�� score 
	     * ֵ����(��С����)�������С�<br> 
	     * ��ѡ�� LIMIT ����ָ�����ؽ��������������(����SQL�е� SELECT LIMIT offset, count )��ע�⵱ offset 
	     * �ܴ�ʱ����λ offset �Ĳ���������Ҫ�����������򼯣��˹�������Ӷ�Ϊ O(N) ʱ�䡣 
	     *  
	     * @param key 
	     * @param min 
	     *            ��С��ֵ 
	     * @param max 
	     *            ����ֵ 
	     * @param offset 
	     *            Ҫ������Ԫ������ 
	     * @param count 
	     *            ����offset��ָ����Ԫ��֮��Ҫ���ض��ٸ����� 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrangeByScore(String key, double min, double max, int offset, int count) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrangeByScore(key, min, max, offset, count);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У� score ֵ�� min �� max ֮��(Ĭ�ϰ��� score ֵ���� min �� max )�ĳ�Ա�������� 
	     *  
	     * @param key 
	     * @param min 
	     *            ��С��ֵ 
	     * @param max 
	     *            ����ֵ 
	     * @return result score ֵ�� min �� max ֮��ĳ�Ա�������� 
	     */  
	    public static Long zcount(String key, double min, double max) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zcount(key, min, max);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У� score ֵ���� max �� min ֮��(Ĭ�ϰ������� max �� min )�����еĳ�Ա�����򼯳�Ա�� score 
	     * ֵ�ݼ�(�Ӵ�С)�Ĵ������С� 
	     *  
	     * @param key 
	     * @param min 
	     *            ��С��ֵ 
	     * @param max 
	     *            ����ֵ 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrevrangeByScore(String key, double max, double min) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrangeByScore(key, max, min);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �������� key �У� score ֵ���� max �� min ֮��(Ĭ�ϰ������� max �� min )�����еĳ�Ա�����򼯳�Ա�� score 
	     * ֵ�ݼ�(�Ӵ�С)�Ĵ������С� 
	     *  
	     * @param key 
	     * @param min 
	     *            ��С��ֵ 
	     * @param max 
	     *            ����ֵ 
	     * @param offset 
	     *            Ҫ������Ԫ������ 
	     * @param count 
	     *            ����offset��ָ����Ԫ��֮��Ҫ���ض��ٸ����� 
	     * @return result ָ�������ڣ����� score ֵ(��ѡ)�����򼯳�Ա���б� 
	     */  
	    public static Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {  
	        Set<String> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrangeByScore(key, max, min, offset, count);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ����� key �У�ָ������(rank)�����ڵ����г�Ա��<br> 
	     * ����ֱ����±���� start �� stop ָ�������� start �� stop ���ڡ�<br> 
	     * �±���� start �� stop ���� 0 Ϊ�ף�Ҳ����˵���� 0 ��ʾ���򼯵�һ����Ա���� 1 ��ʾ���򼯵ڶ�����Ա���Դ����ơ�<br> 
	     * ��Ҳ����ʹ�ø����±꣬�� -1 ��ʾ���һ����Ա�� -2 ��ʾ�����ڶ�����Ա���Դ����ơ� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼλ�� 
	     * @param end 
	     *            ����λ�� 
	     * @return result ���Ƴ���Ա�������� 
	     */  
	    public static Long zremrangeByRank(String key, int start, int end) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zremrangeByRank(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** 
	     * �Ƴ����� key �У����� score ֵ���� min �� max ֮��(�������� min �� max )�ĳ�Ա�� 
	     *  
	     * @param key 
	     * @param start 
	     *            ��ʼ��ֵ 
	     * @param end 
	     *            ������ֵ 
	     * @return result ���Ƴ���Ա�������� 
	     */  
	    public static Long zremrangeByScore(String key, double start, double end) {  
	        Long result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zremrangeByScore(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    /** ===============================��������=============================== */  
	  
	    public static Set<Tuple> zrangeWithScores(String key, int start, int end) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrangeWithScores(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Set<Tuple> zrevrangeWithScores(String key, int start, int end) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrangeWithScores(key, start, end);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrangeByScoreWithScores(key, min, max);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrangeByScoreWithScores(key, max, min);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrangeByScoreWithScores(key, min, max, offset, count);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {  
	        Set<Tuple> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.zrevrangeByScoreWithScores(key, max, min, offset, count);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Jedis getShard(String key) {  
	        Jedis result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getShard(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static JedisShardInfo getShardInfo(String key) {  
	        JedisShardInfo result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getShardInfo(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static String getKeyTag(String key) {  
	        String result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getKeyTag(key);  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Collection<JedisShardInfo> getAllShardInfo() {  
	        Collection<JedisShardInfo> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getAllShardInfo();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static Collection<Jedis> getAllShards() {  
	        Collection<Jedis> result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.getAllShards();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  
	  
	    public static ShardedJedisPipeline pipelined() {  
	        ShardedJedisPipeline result = null;  
	  
	        ShardedJedis shardedJedis = getShardedJedis();  
	        if (shardedJedis == null) {  
	            return result;  
	        }  
	  
	        try {  
	            result = shardedJedis.pipelined();  
	        } catch (Exception e) {  
	            LOGGER.error(e.getMessage(), e);  
	        } finally {  
	            shardedJedis.close();  
	        }  
	  
	        return result;  
	    }  

}
