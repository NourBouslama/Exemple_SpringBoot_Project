package com.backend.livre;

import com.backend.livre.entities.Livre;
import com.backend.livre.repos.LivreRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LivreApplicationTests {

	/*@Test
	void contextLoads() {
	}*/
	@Autowired
    private LivreRepository livreRepository;

	@Test
    public void testCreateLivre() {
    Livre prod = new Livre("apprendre à aimer",25,"fff");
    livreRepository.save(prod);
	}}
