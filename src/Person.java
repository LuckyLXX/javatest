import java.util.Objects;

/**
 * ClassName:Person
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 19:17
 * @Author:857251389@qq.com
 */
public class Person  {

    private String name;

    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}
