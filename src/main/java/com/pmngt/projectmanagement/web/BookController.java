package com.pmngt.projectmanagement.web;


import com.pmngt.projectmanagement.web.exception.BookIdMismatchException;
import com.pmngt.projectmanagement.web.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

//    @Autowired
//    private BookRepository bookRepository;
//
//    public BookController(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    @GetMapping("/all")
//    public Iterable<Book> findAll() {
//        return bookRepository.findAll();
//    }
//
//    @GetMapping("/title/{bookTitle}")
//    public List<Book> findByTitle(@PathVariable String bookTitle) {
//        return bookRepository.findByTitle(bookTitle);
//    }
//
//    @GetMapping("/{id}")
//    public Book findOne(@PathVariable long id) {
//        return bookRepository.findById(id)
//                .orElseThrow(BookNotFoundException::new);
//    }
//
////    @GetMapping("/create")
////    public String bookForm(Model model) {
////        model.addAttribute("book", new Book());
////        return "create";
////    }
////    @PostMapping("/create")
////    @ResponseStatus(HttpStatus.CREATED)
////    public Book createBook(@ModelAttribute Book book, Model model) {
////        Book book1 = bookRepository.save(new Book(book.getTitle(),book.getAuthor()));
////        model.addAttribute("book", book);
////        return book1;
////    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable long id) {
//        bookRepository.findById(id)
//                .orElseThrow(BookNotFoundException::new);
//        bookRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public Book updateBook(@RequestBody Book book, @PathVariable long id) {
//        if (book.getId() != id) {
//            throw new BookIdMismatchException();
//        }
//        bookRepository.findById(id)
//                .orElseThrow(BookNotFoundException::new);
//        return bookRepository.save(book);
//    }
////    @PostMapping("/create")
////    @ResponseStatus(HttpStatus.CREATED)
////    public String createBook(@ModelAttribute Book book, Model model) {
////        Book book1 = bookRepository.save(new Book(book.getTitle(),book.getAuthor()));
////        model.addAttribute("book", book1);
////        return "home";
////    }
}