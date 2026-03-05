class Student {
    int id;
    String name;

    Student() {
        System.out.println("Default constructor");
    }

    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Rahul");
    }
}