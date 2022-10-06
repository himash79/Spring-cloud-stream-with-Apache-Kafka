package lk.himash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.entity.Book;

@RestController
public class BookController {

	@Autowired
	private MessageChannel output;
	
	@PostMapping("/publish")
	public Book addBook(@RequestBody Book book) {
		output.send(MessageBuilder.withPayload(book).build());
		return book;
	}
	
}
