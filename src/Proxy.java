import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {
    private Object target=null;

    public Object bind(Object target){
        this.target=target;
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(target,args);
        System.out.println("after");
        return null;
    }
}
