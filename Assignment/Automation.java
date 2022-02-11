package week3.day1.Assignment;
public class Automation extends MultipleLangauge implements Language,TestTool
{
	public static void main(String[] args) {
		final String lang="Language need to known for Automation";
		System.out.println(lang);
		Automation auto = new Automation();
		auto.Java();
		Automation.python();
		ruby();
		
		
}
	public static void python()
	{
	
		System.out.println("PYTHON is not Required");
	}

	@Override
	public void Java() {
		
		System.out.println("JAVA");
		this.Selenium();
	
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
		super.python();
		}
	}
 
 interface Language {
	 public void Java();

}
 interface TestTool {
	 void Selenium();

}
 abstract class MultipleLangauge {

		public static void python()
			{
				System.out.println("PYTHON is optional");
			}
			static void ruby()
			{
				
			}
			
		}

 
