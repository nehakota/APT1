
public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) {
		char compare = nuc.charAt(0);
		int m = 0;
        int len = 0;
        String ans = "";
        for (int k=0; k<strands.length; k++) {
    	   		for (int j=0; j<strands[k].length(); j++) {
    	   			int count = 0;
    	   			if (strands[k].charAt(j) == compare) {
    	   				count ++;
    	   				int alen = strands[k].length();
    	   				if(count==m) {
    	   					if(alen>len) {
    	   						len = alen;
    	   						m = count;
    	   						ans = strands[k];
    	   					}
    	   				}
    	   				else if (count>m){
    	   					len = alen;
    	   					m = count;
    	   					ans = strands[k];
    	   					
    	   				}
    	   			}
    	   		}
  }
       return ans;
}
	
}
