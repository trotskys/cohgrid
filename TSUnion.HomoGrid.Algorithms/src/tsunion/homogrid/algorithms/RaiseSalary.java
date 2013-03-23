package tsunion.homogrid.algorithms;

import tsunion.homogrid.models.Employee;

import com.tangosol.util.InvocableMap.Entry;
import com.tangosol.util.processor.AbstractProcessor;


public class RaiseSalary extends AbstractProcessor {
    
    
    @Override
    public Object process(Entry entry ) {
        Employee emp = (Employee)entry.getValue();
        emp.setSalary(emp.getSalary() * 1.10);
        entry.setValue(emp);
        return null;
    }

	
	
	
}