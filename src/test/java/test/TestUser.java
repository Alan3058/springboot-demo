package test;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ctosb.springboot.model.User;
import com.ctosb.springboot.service.UserService;

/**
 * TODO
 * @author liliangang-1163
 * @date 2017年9月20日下午12:10:27
 * @see
 */
public class TestUser extends BaseTest{

	@Autowired
	private UserService userService;

	@Test
	public void testGet() {
		List<User> users = userService.getByName("");
		Assert.assertTrue(users!=null);
	}
}
