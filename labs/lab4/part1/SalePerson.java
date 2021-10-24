package labs.lab4.part1;

public class SalePerson implements Comparable<Object> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %d", lastName, firstName, totalSales);
    }

    public boolean equals(Object o) {
        if (o instanceof SalePerson) {
            SalePerson sp = (SalePerson) o;
            return sp.firstName.equals(this.firstName)
                && sp.lastName.equals(this.lastName);
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof SalePerson) {
            SalePerson sp = (SalePerson) o;
            return this.totalSales != sp.totalSales
                ? this.totalSales - sp.totalSales
                : sp.lastName.equals(this.lastName)
                    ? sp.firstName.compareTo(this.firstName)
                    : sp.lastName.compareTo(this.lastName);
        }
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
