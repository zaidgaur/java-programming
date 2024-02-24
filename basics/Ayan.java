
class Ayan {
	public static void main(String[] args) {
		String st="zaid";
		st.concat("gaur");
		System.out.println(st);
		StringBuffer st1=new StringBuffer("ayan");
		st1.append("mohd");
		System.out.println(st1);
		StringBuilder st2=new StringBuilder("mohd aleem");
		StringBuilder st3=st2.append("gaur");
		System.out.println(st2);
		System.out.println(st.length());
	}
}