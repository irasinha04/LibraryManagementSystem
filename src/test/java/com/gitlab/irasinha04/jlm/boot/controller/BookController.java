package com.gitlab.irasinha04.jlm.boot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.boot.dto.BookDTO;
import com.gitlab.irasinha04.jlm.service.BookManagementService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

	private final BookManagementService bms = new BookManagementService();

	@RequestMapping(value = "/create", method = RequestMethod.PUT)
	public Integer create(@RequestBody(required = true) BookDTO bookDTO) {
		return bms.create(bookDTO.getTitle(), bookDTO.getGenre(), bookDTO.getAuthor(), bookDTO.getRating());
	}

	@RequestMapping(value = "/read/id/{id}", method = RequestMethod.GET)
	public Book read(@PathVariable(value = "id") Integer id) {
		return bms.readDetails(id);
	}

	@RequestMapping(value = "/update/id/{id}/title", method = RequestMethod.POST)
	public void updateTitle(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String title) {
		bms.updateTitle(id, title);
	}

	@RequestMapping(value = "/update/id/{id}/author", method = RequestMethod.POST)
	public void updateAuthor(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String author) {
		bms.updateAuthor(id, author);
	}

	@RequestMapping(value = "/update/id/{id}/genre", method = RequestMethod.POST)
	public void updateGenre(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String genre) {
		bms.updateGenre(id, genre);
	}

	@RequestMapping(value = "/update/id/{id}/rating", method = RequestMethod.POST)
	public void updateRating(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String rating) {
		bms.updateRating(id, Integer.valueOf(rating));
	}
	
	@RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Integer id) {
		bms.delete(id);
	}

}
