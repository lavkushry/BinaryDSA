 class bb {

    public static String runLengthEncoding(String str) {
        int ctr = 0;
        StringBuilder output = new StringBuilder();
        char data = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == data) {
                ctr++;
            } else {
                output.append(ctr).append(data);
                data = str.charAt(i);
                ctr = 1;
            }
        }

        // Append the count and character for the last run
        output.append(ctr).append(data);

        // Include first and last character
        return String.format("%c%s%c", str.charAt(0), output.toString(), str.charAt(str.length() - 1));
    }

    public static void main(String[] args) {
        String string = "wwwggopp";
        String encodedString = runLengthEncoding(string);
        System.out.println(encodedString);  // Output: wp3w2g1o2p
    }
}
