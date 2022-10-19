package SearchEngine;

import java.util.*;

public class SearchEngine {


static Scanner search = new Scanner(System.in);
static Scanner search_url = new Scanner(System.in);
static boolean yes = true;
static Stack userInput = new Stack();

public static void main(String[] args)
{

	SearchEngine.homePage();

	SearchEngine.userHistory();


}

public static void homePage()
{
while(true)
{
System.out.println("IF u WANT search enter YES otherwise enter NO");
String userwise = search.nextLine();

if(userwise.trim().equalsIgnoreCase("yes"))
{
	System.out.println("SEARCH :");
String url = search_url.nextLine();

SearchEngine.userInputUrl(url);
}
else if(userwise.trim().equalsIgnoreCase("no"))
{
System.out.println("Thank U");
break;
}
else
{
System.out.println("Please FOLLOW Proper GUIDANCE");

}

}
try{
for(int i =0;i<userInput.size();i++)
{
for(int j = i+1;j<userInput.size();j++)
{

if(userInput.get(i).equals(userInput.get(j)))
{
userInput.remove(i);
 i=-1;
}

}
}}
catch(Exception e)
{
System.err.println("404 Error");
}

}

public static void userInputUrl(String url)
{
userInput.push(url);
}

public static void userHistory()
{
System.err.println("     * Resend Search History *");
System.out.println("----------------------------------");
int count = 0;
while(!userInput.isEmpty())
{
System.err.println(++count+"  "+"WWW."+userInput.pop()+".COM");

}
}


}
