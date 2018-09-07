package com.khbr.onlineclinic.util;

import org.apache.commons.beanutils.ConvertUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.Enumeration;

/**
 * Created by Administrator on 2018/9/7 0007.
 */
public class DynamicParamsConverter {
    public static <T> T paramsFill(HttpServletRequest req, String classLocation) {
        T tInstance = null;
        try {
            Class<T> tClass = (Class<T>) Class.forName(classLocation);
            tInstance = tClass.newInstance();
            Field[] fields = tClass.getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                Enumeration<String> keys = req.getParameterNames();

                while (keys.hasMoreElements()) {
                    String inputName = keys.nextElement();
                    Class<?> fType = f.getType();
                    if (inputName.equals(f.getName())) {
                        Object convert = ConvertUtils.convert(req.getParameter(inputName), fType);
                        f.set(tInstance, convert);
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return tInstance;
    }

}
