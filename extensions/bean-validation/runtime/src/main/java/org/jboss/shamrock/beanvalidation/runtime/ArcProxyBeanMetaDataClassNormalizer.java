package org.jboss.shamrock.beanvalidation.runtime;

import org.hibernate.validator.metadata.BeanMetaDataClassNormalizer;
import org.jboss.protean.arc.Subclass;

/**
 * In the case of a proxy generated by Arc, return the parent class.
 */
public class ArcProxyBeanMetaDataClassNormalizer implements BeanMetaDataClassNormalizer {

    @Override
    public Class<?> normalize(Class<?> clazz) {
        if (Subclass.class.isAssignableFrom(clazz)) {
            return clazz.getSuperclass();
        }

        return clazz;
    }

}