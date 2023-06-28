package lk.ijse.dep10.app.business.impl;

import lk.ijse.dep10.app.business.BookBO;
import lk.ijse.dep10.app.dao.custom.BookDAO;
import lk.ijse.dep10.app.dto.BookDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookBOImpl implements BookBO {

    private final BookDAO bookDAO;

    public BookBOImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Transactional(readOnly = true)
    @Override
    public List<BookDTO> getAllBooks() {
        return bookDAO.findAll();
    }

    @Override
    public void saveBook(BookDTO bookDTO) {

    }
}
