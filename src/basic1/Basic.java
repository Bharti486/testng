package basic1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basic {

@Test
public void m1() {
	System.out.println("name");
}

@AfterTest
public void m2() {
	System.out.println("m2");
}
}
