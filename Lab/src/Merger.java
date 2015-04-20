public class Merger {

// wrong

public int[] merge(int[] fst, int[] snd) {  
																	
	int[] result = new int[fst.length + snd.length];     
	int fstIndex = 0;                               
	int sndIndex = 0;
		while (fstIndex + sndIndex != result.length) {    
			if (fstIndex < sndIndex) {														
				result[fstIndex + sndIndex] = fst[fstIndex++]; 
			} else {
				result[fstIndex + sndIndex] = snd[sndIndex++];  
		}
	}
	return result;
}
}