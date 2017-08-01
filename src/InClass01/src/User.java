import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class User implements Comparator<User>{

	String f_name;
	String m_name;
	String l_name;
	String address;
	//String filename;
	ArrayList<User> userList = new ArrayList<User>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
		result = prime * result + ((userList == null) ? 0 : userList.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (m_name == null) {
			if (other.m_name != null)
				return false;
		} else if (!m_name.equals(other.m_name))
			return false;
		return true;
	}


	public User(String f_name, String m_name, String l_name, String address) {
		super();
		this.f_name = f_name;
		this.m_name = m_name;
		this.l_name = l_name;
		this.address = address;
		//this.filename = filename;
	}
	
	
	@Override
	public String toString() {
		return "User [f_name=" + f_name + ", m_name=" + m_name + ", l_name=" + l_name + ", address=" + address + "]";
	}


	public void parseUser(String filename) {
		 // Lets make sure the file path is not empty or null
		 if (filename == null || filename.isEmpty()) {
		 
		 System.out.println("Invalid File Path");
		 return;
		 }
		 String filePath = System.getProperty("user.dir") + "/" + filename;
		 BufferedReader inputStream = null;
		 // We need a try catch block so we can handle any potential IO errors
		 try {
		 try {
		 inputStream = new BufferedReader(new FileReader(filePath));
		 String lineContent = null;
		 // Loop will iterate over each line within the file.
		// It will stop when no new lines are found.
		while ((lineContent = inputStream.readLine()) != null) {
		// System.out.println("Found the line: " + lineContent);
		 String[] resultingTokens = lineContent.split(",");
		 String first_name = "";
		 String middle_name = "";
		 String last_name = "";
		 String s_address = "";
		 for (int i = 0; i < resultingTokens.length; i++){
		  System.out.println(resultingTokens [i].trim());
		   
		 first_name = resultingTokens[0];
		 middle_name = resultingTokens[1];
		 last_name = resultingTokens[2];
		 s_address = resultingTokens[3].concat(" ").concat(resultingTokens[4]).concat(" ").concat(resultingTokens[5]);
		  }
		 User u = new User(first_name,middle_name,last_name,s_address);
		
		 userList.add(u);
		 
		 }
		 }
		 // Make sure we close the buffered reader.
		 finally {
		 if (inputStream != null)
		 inputStream.close();
		 }
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 }// en


	

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		int i = o1.l_name.compareTo(o2.l_name);
		int k =0;
		if(i<0)
		{
			k= -1;
		}
		else if(i>0)
		{
			k= 1;
		}
		else if(i==0)
		{
			k= 0;
		}
		return k; 
	
	}


	
}
