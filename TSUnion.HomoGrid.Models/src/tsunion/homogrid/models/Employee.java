package tsunion.homogrid.models;

import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.PortableObject;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import java.math.BigDecimal;

public class Employee implements PortableObject, Serializable {
    private int empId;
    private String lastname;
    private String firstname;
    private double salary;
    
        
    public Employee() {
    }

    public Employee(int empId1, String lastname1, String firstname1, 
                    double salary1) {
        super();
        this.empId = empId1;
        this.lastname = lastname1;
        this.firstname = firstname1;
        this.salary = salary1;
    }

    public void setEmpId(int param) {
        this.empId = param;
    }

    public int getEmpId() {
        return empId;
    }

    public void setLastname(String param) {
        this.lastname = param;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String param) {
        this.firstname = param;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setSalary(double param) {
        this.salary = param;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Employee)) {
            return false;
        }
        final Employee other = (Employee)object;
        if (empId != other.empId) {
            return false;
        }
        if (!(lastname == null ? other.lastname == null : lastname.equals(other.lastname))) {
            return false;
        }
        if (!(firstname == null ? other.firstname == null : firstname.equals(other.firstname))) {
            return false;
        }
        if (Double.compare(salary, other.salary) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((lastname == null) ? 0 : lastname.hashCode());
        result = PRIME * result + ((firstname == null) ? 0 : firstname.hashCode());
        long temp = Double.doubleToLongBits(salary);
        result = PRIME * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    
    public void readExternal(PofReader dataInput) throws IOException {
        this.empId = dataInput.readInt(0);    
        this.lastname = dataInput.readString(1);
        this.firstname = dataInput.readString(2);
        this.salary  = dataInput.readBigDecimal(3).doubleValue();

    }

    public void writeExternal(PofWriter dataOutput) throws IOException {
        dataOutput.writeInt(0, this.empId);
        dataOutput.writeString(1, this.lastname);
        dataOutput.writeString(2, this.firstname);
        dataOutput.writeBigDecimal(3, new BigDecimal(this.salary));
        
    }
}
