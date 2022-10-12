package constructor;


	public class Trainee {
	    private String  name;
	    private String  pathway;
	    private boolean hired = false;

	    public Trainee(String name, String pathway)
	    {
	        this.name = name;
	        this.pathway = pathway;
	    }

	    public Trainee(String name, String pathway, boolean hired){
	        this.name = name;
	        this.pathway = pathway;
	        this.hired = hired;
	    }
	}
	
	


