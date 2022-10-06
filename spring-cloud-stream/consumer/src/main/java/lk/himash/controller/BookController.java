package lk.himash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.entity.Book;

@RestController
public class BookController {

	private Logger logger = LoggerFactory.getLogger(BookController.class);

	
    @SuppressWarnings("deprecation")
	@StreamListener("input")
    public void consumeBookDetails(Book book) {
        logger.info("Consume payload : " + book);
    }
	
}
