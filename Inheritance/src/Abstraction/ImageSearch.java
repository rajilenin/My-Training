package Abstraction;

public class ImageSearch extends Google {
	public int search() {
		System.out.println("Search all images");
		return 0;
	}

	public static void main(String[] args) {
		ImageSearch obj=new ImageSearch();
		obj.display();
		obj.search();
	}

}
