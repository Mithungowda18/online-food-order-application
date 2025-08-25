package orderapp.Online_Food_Order_Application.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import orderapp.Online_Food_Order_Application.entity.User;

public interface UserService {

	User createUser(User user);

	User getUserById(Integer id);

	List<User> getAllUser();

	User updateUser(User user, Integer id);

	void deleteUser(Integer id);

	String uploadImage(MultipartFile file, Integer id) throws IOException;

	byte[] getImage(Integer id);

	void deleteImage(Integer id);
}
