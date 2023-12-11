class SinopTibetan extends Language {
    SinopTibetan(String languageName, int speakers) {
        super(languageName, speakers, "Asia", "subject-object-verb");
        if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
