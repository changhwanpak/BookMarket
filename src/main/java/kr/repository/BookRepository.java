package kr.repository;

import kr.domain.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
