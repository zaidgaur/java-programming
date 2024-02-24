package advance;
import java.util.Arrays;
class Array{
	Object []arr;
     Integer index;
	public Array(int length) {
		arr=new Object[length];
		index=0;
	}
	protected void print(){
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	protected void add(Object obj){
		if (index<arr.length) {
			arr[index]=obj;
			index++;
			
		} else {
			Object arr1[] =new Object[2*arr.length];
	     for (int i = 0; i < arr.length; i++) {
	    	 arr1[i]=arr[i];
		}
	     arr=arr1;
	     arr[index]=obj;
	     index++;
	      }
	 }
}
public class Main {

	public static void main(String[] args) {
		Array array=new Array(5);
		array.add(10);
		array.add(20.12);
		array.add('c');
		array.add(true);
		array.add("hahaahahaha");
		array.add("hey its obejct type array");
		array.add(78);
		array.add(60);
		array.add(90);
		array.add(100);
		array.add(110);
		array.add(120);
		array.print();
		
		
		
		
		

	}

}
