package com.example.tianfei.myjni_2.strategy;


import com.example.tianfei.myjni_2.factory.ConnectFactoryAPI;
import com.example.tianfei.myjni_2.factory.ConnectFactoryAPIImpl;

/**
 * 对连接的封装，连接管理类，调用连接方法都要从这个类调用
 * Created by TianFei on 2017/3/4.
 */

public class ConnctManager {
    /**
     * 连接工厂类
     */
    private static ConnectFactoryAPI factory = new ConnectFactoryAPIImpl();
    /**
     * 初始化连接类
     */
    private ConnectAPI connect = factory.createConnect(BleConnect.class);

    /**
     * 禁止构造
     */
    private ConnctManager() {
        //nihao
    }

    /**
     * 获得单例
     *
     * @return
     */
    public static ConnctManager getInstance() {
        return InstanceHolder.INSTANCE;
        //随便
    }

    /**
     * 连接方法
     */
    public void connect() {
        connect.connect();
    }

    /**
     * 设置连接方式，不设置默认ble模式
     * @param clz
     * @param <T>
     */
    public <T extends ConnectAPI> void setConnect(Class<T> clz) {
        this.connect = factory.createConnect(clz);
    }

    /**
     * 清理资源
     */
    public void clear() {
        connect=null;
        factory=null;
    }

    /**
     * 单例持有器
     */
    private static final class InstanceHolder {
        private static final ConnctManager INSTANCE = new ConnctManager();
    }

}
