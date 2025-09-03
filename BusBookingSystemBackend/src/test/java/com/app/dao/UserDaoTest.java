package com.app.dao;

import com.app.entities.User;
import com.app.entities.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UserDaoTest {
	// dep
	@Autowired
	private UserDao userRepo;

	@Autowired
	private PasswordEncoder enc;

	@Test
	void testAddUsers() {
		System.out.println("----Password is----");
		System.out.println(enc.encode("12345"));
//		List<User> list = List.of(
//				new User("a1", "b1", "a1@gmail.com", enc.encode("12345"), UserRole.ROLE_ADMIN),
//				new User("a2", "b2", "a2@gmail.com", enc.encode("2345"), UserRole.ROLE_CUSTOMER),
//				new User("a3", "b3", "a3@gmail.com", enc.encode("1345"), UserRole.ROLE_USER));
//		List<User> list2 = userRepo.saveAll(list);
//		assertEquals(3, list2.size());

	}

}
