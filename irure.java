public String decipherer(String message) {
    StringBuilder decryptedMessage = new StringBuilder();
    StringBuilder numberString = new StringBuilder();

    for (int i = 0; i < message.length(); i++) {
        char c = message.charAt(i);

        if (Character.isDigit(c)) {
            numberString.append(c);
        } else {
            if (numberString.length() > 0) {
                int number = Integer.parseInt(numberString.toString());
                int decryptedChar = number % 26;
                char decryptedCharValue = (char) ('a' + decryptedChar);
                decryptedMessage.append(decryptedCharValue);
                numberString.setLength(0);
            }
        }
    }

    return decryptedMessage.toString();
}
