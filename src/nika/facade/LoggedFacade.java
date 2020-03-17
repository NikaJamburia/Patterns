package nika.facade;

public class LoggedFacade implements Facade {
	private Facade facade;
	private String pattern;

	public LoggedFacade(Facade facade, String pattern) {
		this.facade = facade;
		this.pattern = pattern;
	}

	@Override
	public void compose() {
		System.out.println("\n-------------"+ pattern +"---------------");
		facade.compose();
	}
}
