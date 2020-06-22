public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
        Class clazz = p.getClass();//clazz对象中就包含了对象p所属Person类的所有信息

        Class c0 = Person.class;//通过类名.class创建指定类的Class实例

        Class c1 = p.getClass();//通过一个类的实例对象的getClass()方法获取对应实例类的Class实例

        Class c2 = Class.forName("src.Person");//通过Class的静态方法forName来获取一个类的Class实例，常用


    }
}
