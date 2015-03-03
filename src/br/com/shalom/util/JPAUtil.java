package br.com.shalom.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class JPAUtil {

    public static Session getSession() {

            Configuration conf = new Configuration();
            conf.configure();
            org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                    .applySettings(conf.getProperties()).buildServiceRegistry();
            SessionFactory sessionfactory = conf.buildSessionFactory(serviceRegistry);
       
            return sessionfactory.openSession();
    }

}
