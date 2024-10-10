package feedback_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	public Form(int id, String email, String phone, String message) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String email;
	String phone;
	String message;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Form(String email, String phone, String message) {
		super();
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
	
}
