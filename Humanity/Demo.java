package Humanity;

public class Demo {

	public static void main(String[] args) {
	
		Human Tonia = new Woman("Тоня","Михайленко", 168,55,false);
		Human Helen = new Woman("Лена","Матвеева", 160,52,false);
		Human Alex = new Man("Алекс","Потати", 180,85,true);
		Human Jamse = new Man("Джимми","Бонд", 185,90,true);
	/*Human h =TestCompatibility.testCompatibility(Tonia, Helen);
		System.out.println(h.toString());*/
		
		
		
		
		Human child =TestCompatibility.testCompatibility(Tonia, Alex);
        if (child == null){
            System.out.println("Razbezalish");
        } 
        else System.out.println(child.toString());
        
        Human child1 =TestCompatibility.testCompatibility(Tonia, Jamse);
        if (child1 == null){
            System.out.println("Razbezalish");
        } 
        else System.out.println(child1.toString());

        
        
        
        
		//System.out.println(TestCompatibility.testCompatibility(Tonia, Alex).toString());
		/*
		System.out.println(TestCompatibility.testCompatibility(Helen, Jamse).toString());
		System.out.println(TestCompatibility.testCompatibility(Alex, Jamse).toString());*/
		
	}

}
