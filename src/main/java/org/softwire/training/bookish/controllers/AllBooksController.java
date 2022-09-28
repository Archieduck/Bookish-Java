package org.softwire.training.bookish.controllers;


import org.softwire.training.bookish.models.database.Books;
import org.softwire.training.bookish.models.page.AllBooksPageModel;
import org.softwire.training.bookish.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/allbooks")
public class AllBooksController {

    private final BookService bookService;

    @Autowired
    public AllBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("")
    ModelAndView allbooks() {

        List<Books> allBooks = bookService.getAllBooks();

        AllBooksPageModel allBooksPageModel = new AllBooksPageModel();
        allBooksPageModel.setBooks(allBooks);

        return new ModelAndView("allbooks", "model", allBooksPageModel);
    }

    @RequestMapping("/add-book")
    RedirectView addBook(@ModelAttribute Books book) {
        bookService.addBooks(book);

        return new RedirectView("/allbooks");
    }

    @RequestMapping("/delete-book")
    RedirectView deleteBook(@RequestParam int bookId) {
        bookService.deleteBooks(bookId);

        return new RedirectView("/allbooks");
    }

//    @RequestMapping("/update-book")
//    RedirectView updateBook(@ModelAttribute Books book) {
//        bookService.updateBooks(book, );
//
//        return new RedirectView("/allBooks");
//    }
}
