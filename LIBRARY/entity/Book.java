package entity;
import java.lang.*;

public class Book
{
  private  int id;
  private  String title;
  private  String subtitle;
  private  String  authorName;
  private  String publisherName;
  private  double price;
  private  int noOfCopy;
  public  void setId(int id)
  {
    this.id=id;
  }
  public  void setTitle(String title)
  {
    this.title=title;
  }
  public  void setSubTitle(String subTitle)
  {
    this.subtitle=subTitle;
  }
  public  void setAuthor(String author)
  {
    this.authorName=author;
  }
  public  void setPublisher(String publisher)
  {
    this.publisherName=publisher;
  }
  public  void setPrice(double price)
  {
    this.price=price;
  }
  public  void setNoOfCopy(int noOfCopy)
  {
    this.noOfCopy=noOfCopy;
  }
  public  int getID()
  {
    return id;
  }
  public  String getTitle()
  {
    return title;
  }
  public  String getAuthorName()
  {
    return authorName;
  }
  public  String publisherName()
  {
    return publisherName;
  }
  public  Double getPrice()
  {
    return price;
  }
  public  int getNoOfCopy()
  {
    return noOfCopy;
  }
  public  String getsubTitle()
  {
    return subtitle;
  }

}
