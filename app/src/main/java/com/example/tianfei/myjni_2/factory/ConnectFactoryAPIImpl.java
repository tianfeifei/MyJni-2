
package com.example.tianfei.myjni_2.factory;

import com.example.tianfei.myjni_2.strategy.ConnectAPI;

/**
 * 具体工厂类
 * Created by TianFei on 2017/3/4.
 */

public class ConnectFactoryAPIImpl extends ConnectFactoryAPI {
    @Override
    public <T extends ConnectAPI> T createConnect(Class<T> clz) {
        ConnectAPI connect = null;

        try {
            // TODO: 为何不直接 clz.newInstance();
            connect = (ConnectAPI) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) connect;
    }
}
/**
 * 具体工厂类,如果确定工厂就一个，那么就使用下面简化
 * Created by TianFei on 2017/3/4.
 */
//public class ConnectFactoryAPIImpl {
//
//    public static <T extends ConnectAPI> T createConnect(Class<T> clz) {
//        ConnectAPI connect = null;
//
//        try {
//            // TODO: 为何不直接 clz.newInstance();
//            connect = (ConnectAPI) Class.forName(clz.getName()).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return (T) connect;
//    }
//}