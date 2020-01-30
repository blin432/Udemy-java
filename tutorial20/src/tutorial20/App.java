package tutorial20;

public class App {
	 public static void main(String[] args) {
		
		 
		 
		 //inefficient
		 
//		 String info = "";
//		 
//		 info+= "bob";
//		 info+= " ";
//		 info+= " is home";
//		 
//		 System.out.println(info);
		 
		 StringBuilder sb = new StringBuilder("");
		 
		 sb.append("hellow");
		 sb.append(" ");
		 sb.append("bob");
		 
		 System.out.println(sb.toString());
		 
		 StringBuilder s = new StringBuilder("");
		 s.append("hellow")
		 .append("cat");
		 
		 System.out.println(s.toString());
		 //formatting in strings
		 
		 System.out.println("helllow \t  cat here is next line \nasdf");
		 
		 System.out.printf("percent %10d",5);
	}
	
	
}
