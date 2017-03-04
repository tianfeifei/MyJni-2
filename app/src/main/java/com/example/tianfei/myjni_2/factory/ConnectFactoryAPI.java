package com.example.tianfei.myjni_2.factory;


import com.example.tianfei.myjni_2.strategy.ConnectAPI;

/**
 * 抽象工厂父类
 * Created by TianFei on 2017/3/4.
 */

public abstract class ConnectFactoryAPI {
    /**
     * 创建具体连接类
     * @param clz 具体产品类的class
     * @return （具体产品类）
     */
    public abstract <T extends ConnectAPI> T createConnect(Class<T> clz);
}
