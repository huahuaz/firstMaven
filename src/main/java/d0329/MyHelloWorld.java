package d0329;

import java.lang.annotation.*;

//要声明它的特征  Target：表示这个注解可以加载类的哪个地方
//              Retention：表示这个注解在什么时候还保留(源码，字节码，运行)
// Target叫元注解，即注解的注解，用来描述一个注解的约束
//value={}  这表示组Target注解的属性  value赋了一个数组的值
@Target(value = {ElementType.TYPE, ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
//这个注解 MyHelloWorld什么时候保留
@Retention(value = RetentionPolicy.RUNTIME)
@Documented  //生成的 java doc文档中是否保留这个注解
@Inherited   //子类是否可以继承父类的注解
public @interface MyHelloWorld { //空注解
    public String name();  //这个 MyHelloWorld注解一定要有一个属性值 name

    public String age() default "20";  //带默认值

    public String[] ins();
}
