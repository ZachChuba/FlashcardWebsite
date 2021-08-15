package dataobjects;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	private @Id @GeneratedValue Long id;
	private String username;
	private String hashedPassword;
	private String email;

	private User() {
	}

	public User(String username, String hashedPassword, String email) {
		this.username = username;
		this.hashedPassword = hashedPassword;
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(id, user.id) &&
				Objects.equals(username, user.username) && Objects.equals(hashedPassword, user.hashedPassword)
				&& Objects.equals(email, user.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, email);
	}

	public String getEmail() {
		return email;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username=" + username + ", email=" + email;
	}

}
