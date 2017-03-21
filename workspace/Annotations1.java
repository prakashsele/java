package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
@BeforeMethod

public void UserIdGeneration()
{
System.out.println("UserIdGenreation");

}
@BeforeTest
public void Deletecookies()
{
System.out.println("Delete the cookies before the test");

}
@AfterTest
public void DeleteCookies()
{
System.out.println("Delete the cookies after the test");
}




@Test
public void OpeningBrowser()
{

System.out.println("Opening Browser");


}
@Test
public void FlightBooking()
{
System.out.println("Flight Booking");
}

}
