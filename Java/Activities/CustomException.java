package activitiies;

public class CustomException extends Exception{
	
private String message;

public CustomException(String custom_message) {
	this.message=custom_message;
}

@Override
public String getMessage() {
    return message;
}

}
