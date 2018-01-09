package own.junit.testGoTo;

import org.junit.Test;

public class GoToTest {
	@Test
	public void testGoTo(){
		int z=1;
		outer:
		for(int j=0;j<10;j++){
			
			for(int i=0;i<10;i++){
			z++;
			break outer;
			}
		}
		System.out.println(z);
		
	}
}
