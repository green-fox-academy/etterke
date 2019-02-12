package com.greenfoxacademy.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {

  private List<Book> books = new ArrayList<>();

  public BookController() {
    books.add(new Book ("Cat's Cradle", "Kurt Vonnegut", 1963));
    books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
    books.add(new Book ("Breakfast of Champions", "Kurt Vonnegut", 1973));
  }

//  @GetMapping("/books")
//  public String listBooks(Model model){
//    model.addAttribute("books", books);
//    return "index";
//  }

  @GetMapping("/books/{id}/details")
  public String getBookById(Model model, @PathVariable (name="id") int id){
    Book bookById = null;

    for (Book book : books) {
      if(book.getId() == id){
        bookById = book;
      }
    }

    if(bookById != null){
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No such book!");
    }

    return "details";
  }

  @GetMapping("/books")
  public String queriedBooks(Model model, @RequestParam (name="author") String author){
    List<Book> queriedBooks;

    if (author != null){
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = books;
    }

    model.addAttribute("books", queriedBooks);
    return "index";
  }

  private List<Book> filterBooksByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }
}
