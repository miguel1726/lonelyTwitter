package ca.ualberta.cs.lonelytwitter;

public class Author extends User {

	public Author() {
		super();//thuis code will run and it wil cal the constructor of the superclass if no name is given or name given so it accesses the  
		// TODO Auto-generated constructor stub
		name= "anonymous author";
	}
	public Author (String string){
		super(string);
	}
	public void setName(String x){
		name=x;
	}
}
//why do i keep having an error about the abstract?