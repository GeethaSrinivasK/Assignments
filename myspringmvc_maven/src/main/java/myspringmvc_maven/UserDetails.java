package myspringmvc_maven;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetails {

	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + "]";
	}
	@NotNull(message="Field required")
	@Size(min=1,message="please enter username")
	private String username;
	
	@NotNull(message="field required")
	@Size(min=1,message="please enter password")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetails() {
		super();
	}
	public UserDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}
