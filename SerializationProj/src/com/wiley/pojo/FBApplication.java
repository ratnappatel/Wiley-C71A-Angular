package com.wiley.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FBApplication {
	
	ObjectInputStream ois;
	ObjectOutputStream os;
	File file;
	Scanner sc;
	public FBApplication() {
		
		file=new File("facebookUsers.txt");
		sc=new Scanner(System.in);
	}
	
	public void storeUserDetails(FBUser user)
	{
		try
		{
			os=new ObjectOutputStream(new FileOutputStream(file,true));
			os.writeObject(user);
		} catch (Exception e) { e.printStackTrace();	}
	}
	public FBUser input()
	{
		FBUser user=new FBUser();
		
		System.out.println("Enter Id");
		user.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		user.setName(sc.next());
		
		System.out.println("Enter friends");
		user.setFriends(sc.nextInt());
		
		System.out.println("Enter Groups");
		user.setGroups(sc.nextInt());
		
		System.out.println("Enter Likes");
		user.setLikes(sc.nextInt());
		
		return user;
	}
	public void readUserDetails()
	{
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(file));
			FBUser user=null;
			while((user=(FBUser)ois.readObject())!=null)
					System.out.println(user);
	
			
		} catch (Exception e) { e.printStackTrace();		}
	}

	public static void main(String[] args) {

		FBApplication app=new FBApplication();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Would you like to store more users detail? (yes/no)");
			String s=sc.next();
			if(s.equalsIgnoreCase("yes"))
			{
				app.storeUserDetails(app.input());
			}
			else
				break;
		}while(true);
		
		app.readUserDetails();
	}

}
