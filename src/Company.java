
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Class representing a company.
 */
public class Company {
    private List<Employee> employees;

    /**
     * Constructor for the Company class.
     *
     * @throws IOException if the file is not found
     */
    public Company() throws IOException {
        String fileName = "data/employees.csv";
        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
            employees = stream.parallel().map(this::readLine).toList();
        }
    }

    /**
     * Reads a line of employee information and returns an Employee object.
     *
     * @param line the line containing employee information
     * @return the Employee object
     */
    private Employee readLine(String line) {
        String[] parts = line.split(",");

        String firstName = parts[0].trim();
        String lastName = parts[1].trim();
        int age = Integer.parseInt(parts[2].trim());
        String socialSecurityNumber = parts[3].trim();
        int yearsOfExperience = Integer.parseInt(parts[4].trim());
        double efficiency = Double.parseDouble(parts[5].trim());

        return new Employee(firstName, lastName, age, socialSecurityNumber, yearsOfExperience, efficiency);
    }

    /**
     * Returns the list of employees in the company.
     *
     * @return the list of employees
     */
    public List<Employee> getEmployees() {
        return this.employees;
    }

    /**
     * Returns a stream of employees who are older than 25 years.
     *
     * @return a stream of employees older than 25
     */
    public Stream<Employee> getEmployeesOlderThan25() {
        return employees.stream()
                .filter(employee -> employee.getAge() > 25);
    }

    public static void main(String[] args) throws IOException {
        Company company = new Company();
        System.out.println(company.getEmployees());
    }
}

