public class Student extends Person implements Move,Study{
    public Student(){
        System.out.println("调用public Student");
    }

    public Student (String school){
        this.school = school;
        System.out.println("调用public Student (String school)");
    }

    private Student (String name, int age){
        this.school = school;
        this.age = age;
        System.out.println("调用private Student (String name, int age)");
    }

    public String school;

    public void showInfo(){
        System.out.println(this.school);
    }
    @Override
    public void moveType() {
        System.out.println("走");
    }

    @Override
    public void studyInfo() {
        System.out.println("学习中学知识");
    }

    private void test (String name){
        System.out.println("这个是test私有方法");
    }

    public String getSchool(){
        return this.school;
    }

    public void setInfo (String name, String school){
        this.name = name;
        this.school = school;
        System.out.println("这个是setInfo方法");
    }

    public void setInfo (int age){
        this.age = age;
        System.out.println("这个是setInfo的age方法");
    }
}
