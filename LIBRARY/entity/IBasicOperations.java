package entity;

import java.lang.*;
import entity.*;

public interface IBasicOperations
{

  public void borrow(Patron p, Book b);
  public  void returns(Patron p, Book b);
  public void fine(Patron p, double amount);


}
