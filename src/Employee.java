public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String socialSecurityNumber;
    private int yearsOfExperience;
    private double efficiency;

    /**
     * Constructor for the Employee class.
     *
     * @param firstName            the employee's first name
     * @param lastName             the employee's last name
     * @param age                  the employee's age
     * @param socialSecurityNumber the employee's social security number
     * @param yearsOfExperience    the number of years of experience of the employee
     * @param efficiency           the employee's efficiency (a value between 0 and 1)
     */
    public Employee(String firstName, String lastName, int age, String socialSecurityNumber, int yearsOfExperience, double efficiency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.efficiency = efficiency;
    }

    // Getters and Setters

    /**
     * Returns the employee's first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the employee's first name.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the employee's last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the employee's last name.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the employee's age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the employee's age.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the employee's social security number.
     *
     * @return the social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the employee's social security number.
     *
     * @param socialSecurityNumber the social security number to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Returns the employee's years of experience.
     *
     * @return the years of experience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Sets the employee's years of experience.
     *
     * @param yearsOfExperience the years of experience to set
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Returns the employee's efficiency.
     *
     * @return the efficiency (a value between 0 and 1)
     */
    public double getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the employee's efficiency.
     *
     * @param efficiency the efficiency to set (a value between 0 and 1)
     */
    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
}
