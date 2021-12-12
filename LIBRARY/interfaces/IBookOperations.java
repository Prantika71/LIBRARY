package interfaces;

import java.lang.*;
import entity.*;


public interface IBookOperations
{

  void insertBook(Book b);
  void removeBook(Book b);
  Book getBook(int bookId);
  void showAllBooks( );


}
