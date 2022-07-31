package model;

import java.util.List;

public class DataAnalize {
    private String dataName;
    private String[] dataArrays;
    private List<String> victimSysProperties;
    private int dataSize;

    public DataAnalize(String dataName) {
        this.dataName = dataName;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String[] getDataArrays() {
        return dataArrays;
    }

    public void setDataArrays(String[] dataArrays) {
        this.dataArrays = dataArrays;
    }

    public List<String> getVictimSysProperties() {
        return victimSysProperties;
    }

    public void setVictimSysProperties(List<String> victimSysProperties) {
        this.victimSysProperties = victimSysProperties;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }
}
