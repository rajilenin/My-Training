package Abstraction;

public class SearchVideo extends Google {
	public int search()
	{
		System.out.println("Search all video");
		return 2;
	}

	public static void main(String[] args) {
		
		SearchVideo obj2=new SearchVideo();
		obj2.display();
		obj2.search();
	}

}
