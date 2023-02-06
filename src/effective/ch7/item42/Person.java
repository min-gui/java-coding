package effective.ch7.item42;

class Person
{
    private String name;
    private Integer age;

    public Person(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    // 기타 getter 및 setter

    @Override
    public String toString() {
        return "[" + name + ", " + String.valueOf(age) + "]";
    }

    public static Person max(Person x, Person y) {
        return x.getAge() > y.getAge() ? x : y;
    }
}
