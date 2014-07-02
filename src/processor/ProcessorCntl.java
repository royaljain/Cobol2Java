package processor;

public class ProcessorCntl {
	
	public ProcessorCntl(String intermed)
	{
		new MainClassMaker(intermed);
		new Sql( intermed);
	}
	
	
}
