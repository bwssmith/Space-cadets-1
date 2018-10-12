import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainBit 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email ID: ");
		String ID = sc.next();
		try 
		{
			URL address = new URL("https://www.ecs.soton.ac.uk/people/"+ID);
			BufferedReader br = new BufferedReader(new InputStreamReader(address.openStream()));
			String inputLine = "";
	        //while ((inputLine = br.readLine()) != null)d
	        //    System.out.println(inputLine);
			for(int x = 0; x <= 8; x++) inputLine = br.readLine();
			String a ="";
			int x = 11;
			while(inputLine.charAt(x)!='|')
			{
				a+=inputLine.charAt(x);
				x++;
			}
	        br.close();
			System.out.print(a);
		} 
		catch (IOException e) 
		{
			System.out.print("Well that was dreadful");
			e.printStackTrace();
		}
		//String URL = "https://www.ecs.soton.ac.uk/people/"+ID;
		//BufferedReader reader = new BufferedReader(URL);
	}
}

