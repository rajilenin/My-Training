package Abstraction;

public class SearchAll extends Google {
	public int search()
	{
		System.out.println("Search all");
		return 1;
	}

	public static void main(String[] args) {
		
		SearchAll obj1=new SearchAll();
		obj1.display();
		obj1.search();
	}

}
