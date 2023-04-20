public class f028_InterfaceCallBack {
	
	//  https://metanit.com/java/tutorial/3.16.php
	static final String cMethod = "Интерфесы в механизме обратного вызова";
	
	public static void main(String[] args) {
		final String cDelimiter = "**************************";
		System.out.printf("%s\n%s\n", cMethod, cDelimiter);
		
		Button button = new Button(new ButtonClickHandler());
		button.click();
		button.click();
		button.click();
		
		
	}
}


class ButtonClickHandler implements EventHandler {
	public void execute() {
		System.out.println("Кнопка нажата");
	}
}

interface EventHandler {
	void execute();
}

class Button{
	EventHandler handler;
	
	Button(EventHandler action) {
		this.handler = action;
	}
	
	public void click() {
		handler.execute();
	}
}
