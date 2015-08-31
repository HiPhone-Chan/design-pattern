package com.chf.design.pattern.structural.delegation.v2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Delegate {

    protected Object target;

    public void exe(String methodName, Object... args) throws Exception {
        List<Class<?>> parameterTypes = new ArrayList<>();
        if (args != null) {
            for (Object obj : args) {
                parameterTypes.add(obj.getClass());
            }
        }

        Class<?>[] clzArray = new Class[parameterTypes.size()];
        Method method = target.getClass().getDeclaredMethod(methodName,
                parameterTypes.toArray(clzArray));
        method.invoke(target, args);
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

}
