import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws Exception {
       Class clazz = Class.forName("Student");
//
//        Class superClazz = clazz.getSuperclass();//获取父类
//
//        System.out.println(superClazz.getName());
//
//        Class[] interfaces = clazz.getInterfaces();//获取接口
//
//        for(Class c : interfaces){
//            System.out.println(c.getName());
//        }

//        Constructor[] cons = clazz.getConstructors();//获取类的共有构造方法
//
//        for (Constructor c : cons){
//            System.out.println(c.getName());//获取构造方法名称
//            System.out.println(c.getModifiers());//获取修饰符，返回数字1代表public
//
//            Class[] paramClazz = c.getParameterTypes();//参数类型
//            for(Class pc : paramClazz){
//                System.out.println(pc.getName());
//            }
//
//        }
//
//        Constructor[] cons1 = clazz.getDeclaredConstructors();//获取类的所有构造方法，包括共有私有
//
//        for (Constructor c : cons1){
//            System.out.println(c.getName());//获取构造方法名称
//            System.out.println(c.getModifiers());//获取修饰符，返回数字1代表public，返回数字2代表private
//
//            Class[] paramClazz = c.getParameterTypes();
//            for(Class pc : paramClazz){
//                System.out.println(pc.getName());
//            }
//        }

//        Object obj = clazz.getDeclaredConstructor().newInstance();//java9之后弃用了.newInstance()
//        Student stu = (Student)obj;
//        System.out.println(stu.school);//相当于调用Student类的无参公有构造
//
//        Constructor c = clazz.getConstructor(String.class);//指定获取一个有参数且为String类型的共有构造方法
//        Student stu1 = (Student)c.newInstance("diyi");//newInstance实例化对象，相当于调用public Student (String school)
//        System.out.println(stu1.school);
//
//        //通过反射机制强制调用私有构造方法
//        Constructor c1 = clazz.getDeclaredConstructor(String.class,int.class);//指定获取有两个参数的私有构造
//
//        c1.setAccessible(true);//解除私有封装，接下来可以对这个私有方法强制调用
//
//        Student stu2 = (Student)c1.newInstance("diyi",12);

//        Method[] ms = clazz.getMethods();//获取所有的公有方法

//        Method [] ms = clazz.getDeclaredMethods();//获取所有方法，包括公有和私有
//
//        for(Method m :ms){
//            System.out.println(m.getName());
//            System.out.println(m.getReturnType());
//            System.out.println(m.getModifiers());
//
//            Class[] pcs = m .getParameterTypes();//获取方法的参数类型，返回值是一个数组，方法有几个参数就返回几个数据
//            if(pcs != null && pcs.length > 0){
//                for(Class pc : pcs){
//                    System.out.println(pc.getName());
//                }
//            }
//
//        }

//        //无论是反射调用setInfo还是test方法，都是调用的obj对象的方法，实际上obj对象就是Student对象
//        Constructor con = clazz.getConstructor();//获取无参构造
//        Object obj = con.newInstance();//使用无参构造创建对象
//        Method m = clazz.getMethod("setInfo", String.class, String.class);//得到名称叫setInfo,
//        m.invoke(obj,"zym","diyi");//参数1是需要实例化的对象，参数2是调用当前方法的实际参数
//
//        //调用私有方法
//        Method m1 = clazz.getDeclaredMethod("test", String.class);//获取方法名为test，参数类型为String类型的方法
//
//        m1.setAccessible(true);//解除私有封装
//
//        m1.invoke(obj,"ffs");
//
//        //调用重载方法
//        Method m2 = clazz.getMethod("setInfo", int.class);
//        m2.invoke(obj,1);
//
//        //有返回值的方法
//        Method m3 = clazz.getMethod("getSchool");
//        String school = (String) m3.invoke(obj);
//        System.out.println(school);

        //反射创建一个对象
        Constructor con = clazz.getConstructor();
        Student stu = (Student)con.newInstance();

        Field f = clazz.getField("school");//获取名称为school的属性

        f.set(stu, "disan");//对stu对象的school属性设置值
        String school = (String)f.get(stu);//获取stu对象的school属性值
        System.out.println(school);

    }
}
