public class PolymorphismApp {

    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Azkiya");
        employee.sayHello("Laili");

        employee = new Manager("Azkiya");
        employee.sayHello("Laili");

        employee = new VicePresident("Azkiya");
        employee.sayHello("Laili");

        
    }
}