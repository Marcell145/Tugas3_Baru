public class Tugas1 {
    public static void main(String[] args) {
        // Membuat objek Person menggunakan autocomplete
        Person person = new Person("John", 25);

        // Menampilkan informasi objek menggunakan live template
        System.out.println("Person Information:");
        System.out.println("-------------------");
        displayInfo(person);
    }

    // Custom live template untuk menampilkan informasi objek
    private static void displayInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    // Implementasi kelas Person dengan fitur autocomplete
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
