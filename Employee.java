
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;

@Entity
@Cacheable(true)
@NamedQuery(name="findAllEmployeeWithName",query="SELECT e FROM Employee e WHERE e.name LIKE :empName",hints={@QueryHint(name="org.hibernate.cacheable", value="true")})
public class Employee  {
 

    @Id
    private int id;

    private String name;

    private String address;

    private HashSet<Employee> directReports;

    public String getName() {
        return name;
    }

    public Set<Employee> getDirectReports() {
        return directReports;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

