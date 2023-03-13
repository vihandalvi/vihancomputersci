package General;

public class Person {

    private String _name;
    private int _age;

    public Person() {
        _name = "";
        _age = 0;
    }

    public Person(String name, int age) {
        _name = name;
        _age = age;
    }

    public String GetName() {
        return _name;
    }

    public void SetName(String name) {
        _name = name;
    }

    public int GetAge() {
        return _age;
    }

    public void SetAge(int age) {
        _age = age;
    }

}
