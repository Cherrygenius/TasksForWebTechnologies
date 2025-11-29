class Kata {
    static String alphabetPosition(String text) {
if (text != null) {
            char[] chars = text.toUpperCase().replaceAll("[^a-zA-Z]", "").toCharArray();
  if (chars.length != 0) {
              StringBuilder s = new StringBuilder();
            s.append(((int)chars[0]) - 64);
            for (int i = 1; i < chars.length; i++) {
                s.append(" ");
                s.append(((int)chars[i]) - 64);
            }
      return String.valueOf(s);
  }
    }
      return "";
}
}