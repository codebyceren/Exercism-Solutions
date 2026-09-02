class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char character : identifier.toCharArray()) {

            if (character == ' ') {
                result.append('_');

            } else if (character == '-') {
                capitalizeNext = true;

            } else if (character == '4') {
                result.append('a');

            } else if (character == '3') {
                result.append('e');

            } else if (character == '0') {
                result.append('o');

            } else if (character == '1') {
                result.append('l');

            } else if (character == '7') {
                result.append('t');

            } else if (Character.isLetter(character)) {

                if (capitalizeNext) {
                    result.append(Character.toUpperCase(character));
                    capitalizeNext = false;
                } else {
                    result.append(character);
                }
            }
        }

        return result.toString();
    }
}