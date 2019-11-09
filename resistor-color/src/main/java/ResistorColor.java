class ResistorColor {
    int colorCode(String color) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (int i = 0; i <= 10; i++){
            if (this.colors()[i].equals(color)) return i;
        }
        return -1;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
     return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
