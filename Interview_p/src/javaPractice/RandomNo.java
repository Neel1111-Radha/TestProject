package javaPractice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNo {

	public static void main(String[] args) {
		// Generate Random No. 
		
		Random random = new Random();
		int rand = random.nextInt(100);
		System.out.println(rand);
		
		double rando = random.nextDouble();
		System.out.println(rando);
		
		
		String jar = RandomStringUtils.randomNumeric(10);
		System.out.println(jar);
		
		
		String rand_str = RandomStringUtils.randomAlphabetic(10);
		System.out.println(rand_str);
		

	}

}
