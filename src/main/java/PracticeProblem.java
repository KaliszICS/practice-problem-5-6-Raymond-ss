
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] names, int[] ages, String name) {
	int age = 0;
    for (int i = 0; i < names.length; i++) {
        if (name.equals(names[i])) {
            return ages[i];
        }
    }
    return 0; 
	}	

	public static int[] createLengthArray(String[] names){
		int[] lengths = new int[names.length];

		for (int i = 0; i < names.length; i++){
			lengths[i] = names[i].length();
		}
		return lengths;
	}

	public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
		int first = -1;
		int second = -1;

		for (int i = 0; i < names.length; i++) {
			if (first == -1 && names[i].equals(name1)) {
				first = i;
			}
			else if (second == -1 && names[i].equals(name2)) {
				second = i;
			}
		}

		String tempName = names[first];
	 	names[first] = names [second];
		names[second] = tempName;

		int tempAge = ages [first];
		ages[first] = ages[second];
		ages[second] = tempAge;
		

	}

}
