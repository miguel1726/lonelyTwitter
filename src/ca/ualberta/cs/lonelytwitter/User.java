package ca.ualberta.cs.lonelytwitter;
import java.io.IOException;
public abstract class User extends Object implements Userlike{//abstract says that now their is no such thing as a pain user, interfacesa are used by using implements
	protected String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String x) throws IOException;
	//every type of user has to have a setname method has one argument thatis a string, must be publicly accesible
	public User(String name) {
		super();
		this.name = name;
	}
	//good use of constructors is to provide a value, so that whenever
	//something is created its starts with a name
	public User(){
		super();
		this.name = "anonymous";
	}//everything is a pointer
	//it takes a pointer to a string not a string, 
	//the dot operator deferences that pointer
}
