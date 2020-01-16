package com.bridgelabz.fundooapi.services;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import com.bridgelabz.fundooapi.model.User;
import com.bridgelabz.fundooapi.model.UserLoginPair;


public interface UserService{

	
	
	public User findUserByUserName(String userName);

	public ResponseEntity<String>  registerUser(User user,BindingResult result);

	public long activateUserAccount(String token);

	public ResponseEntity<String> userLogin(UserLoginPair loginPair);   

	public ResponseEntity<String> verifyBeforeResetPassword(String email);
	
	public ResponseEntity<String> resetPassword(String newPassword,String token);

	
//	public boolean loginUser(String email, String password);
//	public boolean userExists(User user);
//	public User getUserByEmail(String email, User user);
//	public User getUserById(Integer id, User user);
//	public void activateUser(Integer id);
//	public void sendRegistrationVerificationLink(Integer id, String email)
//			throws FileNotFoundException, ClassNotFoundException, IOException;
//	public void sendLoginVerificationToken(User user, Token accessToken, HttpServletRequest request)
//			throws FileNotFoundException, ClassNotFoundException, IOException;
//	public void sendResetPasswordMail(User user, HttpServletRequest request, Token forgotToken)
//			throws FileNotFoundException, ClassNotFoundException, IOException;
//	public void resetPassword(User user);





}