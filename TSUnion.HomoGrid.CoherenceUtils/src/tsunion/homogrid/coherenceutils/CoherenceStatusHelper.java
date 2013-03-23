package tsunion.homogrid.coherenceutils;


import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.util.filter.AlwaysFilter;
import com.tangosol.util.filter.LikeFilter;
import java.util.*;

import tsunion.homogrid.algorithms.Swap192;
import tsunion.homogrid.models.SwapTrade;

public class CoherenceStatusHelper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Startin to insert data");
		 NamedCache countries = CacheFactory.getCache("countries");
		    // first, we need to put some countries into the cache
		    countries.put(1, new SwapTrade("USA", "United States",
		                  "Washington", "USD", "Dollar"));
		    countries.put(2, new SwapTrade("GBR", "United Kingdom",
		                  "London", "GBP", "Pound"));
		    countries.put(3, new SwapTrade("RUS", "Russia", "Moscow", 
		                  "RUB", "Ruble"));
		    countries.put(4, new SwapTrade("CHN", "China", "Beijing", 
		                  "CNY", "Yuan"));
		    countries.put(5, new SwapTrade("JPN", "Japan", "Tokyo", 
		                  "JPY", "Yen"));
		    countries.put(6, new SwapTrade("DEU", "Germany", "Berlin", 
		                  "EUR", "Euro"));
		    countries.put(7, new SwapTrade("FRA", "France", "Paris",
		                  "EUR", "Euro"));
		    System.out.print("Data inserted");
		   // Set<Map.Entry> entries = countries.entrySet(
            //        new LikeFilter("getName", "United%"), null);
		    
		   countries.invokeAll(AlwaysFilter.INSTANCE, new Swap192());
		    
	    //  System.out.println(entries.size());
	 
	      CacheFactory.shutdown();
	}

}
