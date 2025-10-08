package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("humanHeart")
public class HumanHeart implements Heart {

	@Override
	public void pump() {
		
		System.out.println("        Inside Human Heart class because, Spring tried to inject dependency for Heart in QualifierTest.java it found 2 Classes HumanHeart.java and AnimalHeart.java."
				+ " So it will be confused in which bean it has to create, to overcome this we used @Qualifier ('humanHeart') which searched the @Component with name 'humanHeart' and created bean for it."
				+ " If we put 'animalHeart' in Qualifier annotation, then spring will create bean for AnimalHeart.java ");
	}

}
