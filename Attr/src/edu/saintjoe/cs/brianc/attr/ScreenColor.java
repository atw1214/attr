package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	// A ScreenColor object has two fields (data members)
	private int colorValue;
	private String description;

	
	// emil exists to show how parameter names are arbitrary
	public ScreenColor(Object emil) {
		description = (String) emil;
	    colorValue = encode(emil);
	    }
	  
	// foo does too!
	private int encode(Object foo) {
		  if (foo.equals("transparent"))
			  // This is a bogus value!!
			  return (colorValue = 0x000000);
		  else if (foo.equals("red"))
			  // green, yellow, blue
			  return (colorValue = 0xff0000);
		  else if (foo.equals("green"))
		  		return (colorValue  = 0x00cc00);
		  else if (foo.equals("yellow"))
			  	return (colorValue = 0x999900);
		  
		  // We have to return something; this isn't really the right way to do it!
		  return 0;
	  }
	  public String toString() {
		  return description;
	  }

	}
