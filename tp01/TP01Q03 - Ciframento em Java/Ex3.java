class Ex3{

    public static boolean isFim(String word) {
		if (word.equals("FIM"))
			return false;
		else 
			return true;
	}

    public static String cypher(String word, char[] scrambled) {
        char tmp;
        int key = 3;
        for (int i = 0; i < word.length(); i++) {
            tmp = word.charAt(i);
            tmp += key;
            scrambled[i] = tmp;
        }

        String awns = new String(scrambled);
        return awns;
    }

	public static void main(String[] args) {
        String word;
        String awns;
        char[] scrambled;
        
        word = MyIO.readLine();

        while (isFim(word)) {
            scrambled = new char[word.length()];

            awns = cypher(word, scrambled);

            System.out.println(awns);

            word = MyIO.readLine();
        }
    }
}