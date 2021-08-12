package in.ashokit.beans;

import in.ashokit.security.PasswordService;

public class User {

	public static void main(String[] args) {
		
		PasswordService passService = new PasswordService();
		String testEncodedPwd = passService.encodePwd("chandan@12345");
		String testDecodedPwd = passService.decodePwd(testEncodedPwd);
		System.out.println("Encoded Pwd :: "+testEncodedPwd);
		System.out.println("Decoded Pwd ::" +testDecodedPwd);

	}

}
