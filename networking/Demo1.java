package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

class Demo1 {

	public static void main(String[] args) {
		try {
			InetAddress inet = InetAddress.getByName("www.google.com");
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		// Reading web data from URL
		try {
			URL url = new URL("https://mobinarshad.github.io/portfolio/");
			URLConnection urlConnection = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String str;
			while((str=br.readLine()) != null) {
				sb.append(str+"\n");
			}			
			System.out.println(sb);
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
