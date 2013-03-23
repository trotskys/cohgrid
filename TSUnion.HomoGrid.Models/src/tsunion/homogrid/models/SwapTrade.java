package tsunion.homogrid.models;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;

import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.PortableObject;

public class SwapTrade  implements Serializable, PortableObject {

	  private String code;
	  private String name;
	  private String capital;
	  private String currencySymbol;
	  private String currencyName;
	  
	  
	  public SwapTrade() {
	  }
	  public SwapTrade(String code, String name, String capital,
	                 String currencySymbol, String currencyName) {
	    this.code           = code;
	    this.name           = name;
	    this.capital        = capital;
	    this.currencySymbol = currencySymbol;
	    this.currencyName   = currencyName;
	  }
	  public String getCode() {
	    return code;
	  }
	  public void setCode(String code) {
		    this.code = code;
		  }
		  public String getName() {
		    return name;
		  }
		  public void setName(String name) {
		    this.name = name;
		  }
		  public String getCapital() {
		    return capital;
		  }
		  public void setCapital(String capital) {
		    this.capital = capital;
		  }
		  public String getCurrencySymbol() {
			    return currencySymbol;
			  }
			  public void setCurrencySymbol(String currencySymbol) {
			    this.currencySymbol = currencySymbol;
			    }
			  
			  public String getCurrencyName() {
				    return currencyName;
				  }
				  public void setCurrencyName(String currencyName) {
				    this.currencyName = currencyName;
				  }
				  
				  
				  public String toString() {
				    return "Country(" +
				                    "Code = " + code + ", " +
				                    "Name = " + name + ", " +
				                    "Capital = " + capital + ", " +
				                    "CurrencySymbol = " + currencySymbol + ", " +
				                    "CurrencyName = " + currencyName + ")";
				  }
				  
				  
	  
	  
	
				  public void readExternal(PofReader dataInput) throws IOException {
//					  private String code;
//					  private String name;
//					  private String capital;
//					  private String currencySymbol;
//					  private String currencyName;
					  
				        this.code = dataInput.readString(0);    
				        this.name = dataInput.readString(1);
				        this.capital = dataInput.readString(2);
				        this.currencySymbol  = dataInput.readString(3);
				        this.currencyName  = dataInput.readString(4);
				        

				    }

				    public void writeExternal(PofWriter dataOutput) throws IOException {
				        dataOutput.writeString(0, this.code);
				        dataOutput.writeString(1, this.name);
				        dataOutput.writeString(2, this.capital);
				        dataOutput.writeString(3,this.currencySymbol);
				        dataOutput.writeString(4,this.currencyName);
				        
				        
				    }

}
