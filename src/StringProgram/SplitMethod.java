package StringProgram;

import java.util.Arrays;

public class SplitMethod {
		public static void main(String[] args) {
			String str="I'm Indian citizen..i live in Indai .India has 27 states";
			String [] s1= str.split(" ");
			System.out.println(Arrays.toString(s1)+" ,");
			for (int i=0;i<s1.length;i++) {
				int count=1;
				for(int j=i+1;j<s1.length;j++) {
					if(s1[i].equals(s1 [j])){
						count++;
					}
				}
				for(int k=i;k>0;k--) {
					if(s1[i].equals(s1[k-1])) {
						count=0;
					}
				}
				if(count>=1) {
					System.out.println(s1[i]+" "+count);
				}
			}
		}
		}


