package builder_pattern;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Недопустимый возраст");
        }
        this.age = age;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Недостаточно данных");
        } else {
            if (age == 0) {
                return new Person(name, surname);
            }
            return new Person(name, surname, age);
        }
    }
}
