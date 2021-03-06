package jp.co.rakus.stockmanagement.domain;



import java.util.Date;

/**
 * 書籍情報を保持するエンティティ.
 * @author rakus
 * 
 */
public class Book {
	/** id */
	private Integer id;
	/** 書籍名 */
	private String name;
	/** 著者 */
	private String author;
	/** 出版社 */
	private String publisher;
	/** 価格 */
	private int price;
	/** ISBNコード */
	private String isbncode;
	/** 発売日 */
	private Date saledate;
	/** 説明 */
	private String explanation;
	/** 画像 */
	private String image;
	/** 在庫数 */
	private Integer stock;
	
	//コンストラクタ
	public Book() {}
	public Book(Integer id, String name, String author, String publisher, int price, String isbncode, Date saledate,
			String explanation, String image, Integer stock) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.isbncode = isbncode;
		this.saledate = saledate;
		this.explanation = explanation;
		this.image = image;
		this.stock = stock;
	}
	
	//getter setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbncode() {
		return isbncode;
	}
	public void setIsbncode(String isbncode) {
		this.isbncode = isbncode;
	}
	public Date getSaledate() {
		return saledate;
	}
	public void setSaledate(Date saledate) {
		this.saledate = saledate;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
