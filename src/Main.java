

public class Main {

    public static void main(String[] args){
        Proxy proxy=new Proxy();
        HelloWorld p= (HelloWorld) proxy.bind(new HelloWorldImpl());
        System.out.println(p instanceof  HelloWorld);
        System.out.println(p instanceof java.lang.reflect.Proxy);
        System.out.println(p.getClass().getName());
        System.out.println(p.getClass().getSuperclass());
        System.out.println(p.getClass().getInterfaces()[0]);
        p.helloworld();
    }
}
