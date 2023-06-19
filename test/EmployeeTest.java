import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructorAndGetters() {
        Employee employee = new Employee("John", "Doe", 30, "123-45-6789", 5, 0.75);

        Assertions.assertEquals("John", employee.getFirstName());
        Assertions.assertEquals("Doe", employee.getLastName());
        Assertions.assertEquals(30, employee.getAge());
        Assertions.assertEquals("123-45-6789", employee.getSocialSecurityNumber());
        Assertions.assertEquals(5, employee.getYearsOfExperience());
        Assertions.assertEquals(0.75, employee.getEfficiency(), 0.001);
    }

    @Test
    public void testEmployeeSetters() {
        Employee employee = new Employee("John", "Doe", 30, "123-45-6789", 5, 0.75);

        employee.setFirstName("Alice");
        employee.setLastName("Smith");
        employee.setAge(35);
        employee.setSocialSecurityNumber("987-65-4321");
        employee.setYearsOfExperience(6);
        employee.setEfficiency(0.82);

        Assertions.assertEquals("Alice", employee.getFirstName());
        Assertions.assertEquals("Smith", employee.getLastName());
        Assertions.assertEquals(35, employee.getAge());
        Assertions.assertEquals("987-65-4321", employee.getSocialSecurityNumber());
        Assertions.assertEquals(6, employee.getYearsOfExperience());
        Assertions.assertEquals(0.82, employee.getEfficiency(), 0.001);
    }
}
