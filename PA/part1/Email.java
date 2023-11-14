package part1;


public class Email {
	private String subject;
	private Integer id;
	private String message;
	private int time;
	private boolean read;
	
	 public Email(String subject, Integer id, String message, int time) {
	        this.subject = subject;
	        this.id = id;
	        this.message = message;
	        this.time = time;
	        this.read = false; 
	    }
	
	public void setSubject (String subject){
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setId(int id ) {
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setTime(int time) {
		this.time=time;
	}
	
	public int getTime() {
		return time;
	}
	
	public boolean isRead() {
		return read;
	}
	
	public void markAsRead() {
	    read = true;
   }
}




