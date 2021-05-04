
public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# +Angular)","Engin Demiroð");
		
		
		Category category2=new Category(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)","Engin Demiroð");
		
		
		Category category3=new Category(2,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð");
		
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);
		categoryManager.addCategory(category3);
		
		categoryManager.deleteCategory(category3);
		
		
		
	}

}
