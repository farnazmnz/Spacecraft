import java.util.Scanner; 
public class spacecraft {
	
	public static void main(String[] args)   {
//catch the info of meteorites		
		System.out.println("Enter input");
		
		Scanner Myobj= new Scanner(System.in);
 	    String input = Myobj.nextLine();
//the number of meteorites		 
		int n=input.charAt(0);
		n=n-48;
		 
		//create a loop for separating the numbers from another things and make a new string
	 	    int counter=0;
	 	    String h="";
	 	   float[] list=new float[input.length()];
	 	    for(int i=1;i<input.length();i++){
	 	      char f=input.charAt(i);
	 	      if( (f!=')')&&(f!='(')&&(f!=',')&&(f!='_')&&(f!=' ')) {   
	 	        char m = input.charAt(i)  ;  
	 	        h+=m;
	 	    }else {
	 	      if (h.length()==0) {
	 	  
	 	      }else {
	 	      list[counter]=Float.parseFloat(h);
	 	      h="";
	 	      counter++;
	 	      }
	 	    }
	 	  }
	 	  if (h.length()==0) {
	 	    
	 	  }else {
	 	//put float numbers in an array
	 	  list[counter]=Float.parseFloat(h);
	 	  h="";
	 	  counter++;
	 	  }
	 	/*  for(int j=0;j<list.length;j++) {
	 	    System.out.println(list[j])  ;
	 	  }*/
	 	  
	//catch the info of second line 	  
	 	 System.out.println("Enter input");	  
	 		Scanner myobj= new Scanner(System.in);
	 	    String input2 = myobj.nextLine();
			
			
//do all thing like what we do for first 			
			  
		 	    int count=0;
		 	    String s="";
		 	   float[] list2=new float[input2.length()];
		 	    for(int i=0;i<input2.length();i++){
		 	      char f=input2.charAt(i);
		 	      if(  (f!='_')&&(f!='-')&&(f!=' ')) {   
		 	        char m = input2.charAt(i)  ;  
		 	        s+=m;
		 	    }else {
		 	      if (s.length()==0) {
		 	  
		 	      }else {
		 	      list2[count]=Float.parseFloat(s);
		 	      s="";
		 	      count++;
		 	      }
		 	    }
		 	  }
		 	  if (s.length()==0) {
		 	    
		 	  }else {
		 	  list2[count]=Float.parseFloat(s);
		 	  s="";
		 	  count++;
		 	  }
		 /*	  for(int j=0;j<list2.length;j++) {
		 	    System.out.println(list2[j])  ;
		 	  }*/
	 	  
	//show output 	  
		 	 System.out.println("output:");
		 	 float time=0, v;
		 	 int deltax = 0;
		 	 float Tb = 0;	 
		 	 float   y,V,x;	  
		 	 
		 	 
		 	  int j1=1; 
		 	  int b=1;
		 	  int j=2;
		 	  int c=0;
		 	// make a loop for the times that spacecraft moves 
		 	 for(int a=0;a<=n;a++) { 
		 		

		 		
		 	 System.out.print("t=");
		 	  
		 	//show the time in decimal form 
		 	System.out.printf("%.1f",Tb);
		 	System.out.print("  ");
		 	System.out.print("R=( " +deltax); 
		 	System.out.print( "," );
		 	System.out.print(0);
		 	System.out.print(")"); 

		 	 b=1;
		 	 j=2;
		 	 c=0;
		 	 int p=0;

		 	for( int f=0;f<n;f++) {
		 	   int z=f+1;
		 	    x=list[c];
		 	    y=list[b]; 
		 	     V=list[j];
		 	      y=y-(V*Tb);
		 		System.out.print("  ");
		 		System.out.print("M" +z);
		 		System.out.print("=(" +x);
		 		System.out.print( "," );
		 		System.out.printf("%.2f",+y);
		 		System.out.print(")"); 
		 		
		 		j+=3;
		 		b+=3;
		 		c+=3;
		 		//find place where both spacecraft and meteorites are there
		 		if(deltax==x&&y==0) p++;
		 		
		 	}
		 		
		 	if(p==1) {System.out.print(" crashed !");}
		 	else {System.out.print(" safe :)");}

		 	System.out.println("\n"); 
//we do this to be sure the speed of space craft is changed or not		 	
if(deltax==list2[j1+1]) j1+=2;
		 	 
		 		deltax++;
		 		 
		 	  
		 			
		 			 v=list2[j1];
		 		//update time by movement formula 
		 			
		 			 time=1/v; 
		 			  Tb=Tb + time;
		 		 
		 	 
		 	 
		 		 } 	 
		 		
		 	
	
	
	}
	
}	
		 		
 
	 	  
