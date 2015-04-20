
public class NewMerger {
	public static int[] mergeNew(int[] fst, int[] snd) {
		int[] result = new int[fst.length + snd.length];
		int fstIndex = 0;
		int sndIndex = 0;

		while (fstIndex + sndIndex <= result.length) {
			if (fstIndex == fst.length) {
				System.arraycopy(snd, sndIndex, result, fstIndex + sndIndex, (snd.length - sndIndex));

				break;
			}
			if (sndIndex == snd.length) {
				System.arraycopy(fst, fstIndex, result, fstIndex + sndIndex, (fst.length - fstIndex));
				break;
			}
			if (fst[fstIndex] == snd[sndIndex]) {
				result[fstIndex + sndIndex] = fst[fstIndex];
				fstIndex++;
			} else {
				result[fstIndex + sndIndex] = snd[sndIndex];
				sndIndex++;
			}
		}

		return result;
	}
}
