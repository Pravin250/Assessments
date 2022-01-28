package com.pravin.training;

public class WorkingWithInnerClasses {

	public static void main(String[] args) {
		outer.inner op = new outer.inner();
		op.add(10, 20);
	
   }

}
class outer{
	static class inner{
		public void add(int a, int b) {
			int c = a + b;
			
			System.out.println("Add = " + c);
			
		}
		
	}
}