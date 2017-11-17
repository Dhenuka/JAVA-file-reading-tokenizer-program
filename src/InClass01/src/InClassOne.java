//Assignment Number : InClass01
//FileName : InClassOne.java
//Name: Dhenuka Bhargavi Rangam

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class InClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String filename = "userList1.txt";
		String name = "dhenuka";
		User user = new User("","","","");
		//user.parseUser("userList1.txt");
		
		
		
		HashSet<User> duplicates = new HashSet<User>();
		for(int i=0 ; i<user.userList.size();i++){
			User u = user.userList.get(i);
			for(int j=0;j<user.userList.size();j++)
			{
				if(j!=i)
				{
					if(u.equals(user.userList.get(j)))
					{
						duplicates.add(u);
					}
				}
			}
		}
		
		
		List duplicatesList = new ArrayList<>(duplicates);
		System.out.println("hiee");
		
		Collections.sort(duplicatesList);
		
		for(Object u : duplicatesList)
		{
			System.out.println(u.toString());
		}
		
		
		
	}

}
