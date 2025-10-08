package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Component;

@Component ("animalHeart")
public class AnimalHeart implements Heart {

	@Override
	public void pump() {
		System.out.println("        Inside Animal Heart class because, Spring tried to inject dependency for Heart in QualifierTest.java it found 2 Classes HumanHeart.java and AnimalHeart.java."
				+ " So it will be confused which bean it has to create, to overcome this we used @Qualifier ('animalHeart') which searched the @Component with name 'animalHeart' and created bean for it."
				+ " If we put 'humanHeart' in Qualifier annotation, then spring will create bean for HumanHeart.java ");
	}

}
