package com.eve.core.client;

import com.eve.core.common.Config;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by xieyang on 20/1/3.
 */
public class ServiceConfig implements Config,FactoryBean{

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
