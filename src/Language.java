class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The Language follows the word order: " + this.wordOrder);
    }

    public static void main (String[] args){
        Language italian = new Language("Italian", 68000000, "Italy, Switzerland, Solvenia, Coratia", "subject-verb-object");
        italian.getInfo();

        Language kiche = new Mayan("Ki'che'", 23330000);
        kiche.getInfo();

        Language mandarin = new SinopTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        Language burmese = new SinopTibetan("Burmese", 43000000);
        burmese.getInfo();
    }
}