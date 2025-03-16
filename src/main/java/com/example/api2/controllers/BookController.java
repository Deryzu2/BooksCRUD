package com.example.api2.controllers;
import com.example.api2.exceptions.BookNotFoundException;
import com.example.api2.models.entities.Book;
import com.example.api2.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/levantaronelporton")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public void getBook() {
        System.out.println();
    }


    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.save(book);
    }


    @PutMapping("/{id}/p")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existingBook = bookService.findById(id);
            if (existingBook != null) {
                existingBook.setTitle(book.getTitle());
                existingBook.setAuthor(book.getAuthor());
                return bookService.save(existingBook);
            } else {
                throw new BookNotFoundException("cualquier cosa");
            }
    }

    @DeleteMapping("/{id}/d")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }
}
