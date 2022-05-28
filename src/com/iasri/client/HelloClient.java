package com.iasri.client;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService service=new HelloService();
		Hello hello=service.getHelloPort();
		String response=hello.greeting("Avanaksh Singh Sambyal");
		System.out.println("Response from WebserviceServer : " +response);
	}

}
