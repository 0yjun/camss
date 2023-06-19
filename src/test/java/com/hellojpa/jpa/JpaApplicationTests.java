package com.hellojpa.jpa;

import com.hellojpa.jpa.entities.Part;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaApplicationTests {
	private PartRepository partRepository;
	@Test
	void contextLoads() {
		System.out.println("test run");
		Part part = new Part();
		part.setId(1L);
		part.setNm("A파트");

		partRepository.save(part);

	}

}
