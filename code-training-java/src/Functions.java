public class Functions {

    public static int sumOfTwoInts(int a, int b){
        return a+b;
    }

    public static int minutesToSeconds(int minutes){
        return minutes*60;
    }

    public static int[] arrayOfMultiples(int num, int length){
        int[] multiples = new int[length];
        for(int i=1; i<=length; i++){
            multiples[i-1] = num*i;
        } 
        return multiples;
    }

	public static String sevenBoom(int[] arr) {
		for(int i = 0; i<arr.length; i++){
            if(Integer.toString(arr[i]).contains("7")) return "Boom!";
        }
        return "there is no 7 in the array";
	}

    public static long getHammingDistSum(String s, int k) {
        // Write your code here
            
            String s1 ="", s2="";
            for(int i = 0; i<s.length()-k; i++){
                s1=s.substring(i, i+k);
                s2=s.substring(i+1, i+k+1);
                System.out.println(s1+ "/n" + s2);
            }
            
            
            
            
            return 0;
        }

    public static void main(String[] args) throws Exception {
        //System.out.println(sumOfTwoInts(3, 7));
        //System.out.println(minutesToSeconds(3));
        //arrayOfMultiples(7, 5);

        getHammingDistSum("abccc", 2);
    }
}
