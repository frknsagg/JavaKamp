
public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# +Angular)","Engin Demiro�");
		
		
		Category category2=new Category(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)","Engin Demiro�");
		
		
		Category category3=new Category(2,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�");
		
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);
		categoryManager.addCategory(category3);
		
		categoryManager.deleteCategory(category3);
		
		
		
	}

}
