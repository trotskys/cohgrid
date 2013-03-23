package tsunion.homogrid.algorithms;

import java.io.Serializable;
import tsunion.homogrid.models.SwapTrade;
import com.tangosol.util.InvocableMap;
import com.tangosol.util.processor.AbstractProcessor;

public class Swap192 extends AbstractProcessor implements Serializable   {

	/**
	 * 
	 */
	
	
	@Override
	 public Object process(InvocableMap.Entry entry) {
        SwapTrade pp = (SwapTrade) entry.getValue();
        pp.setName("troooooooooooooooooeeee");
       System.out.println(pp.getCapital()+":"+pp.getName());
        entry.setValue(pp);
        return null;
     }



}
