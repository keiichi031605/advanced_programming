package KeiichiJunit;
import week4.User;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserTest {

	@Test
	public void testUsernameIsNull() {

		Throwable exception = assertThrows(
			IllegalArgumentException.class, () -> {
				User user = new User();
				user.setName(null);
				}
			);
		assertEquals("Username cannot be blank", exception.getMessage());

	}
}