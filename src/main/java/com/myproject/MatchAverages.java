package com.myproject;

import java.io.Serializable;

public class MatchAverages implements Serializable{

    private int totalMatches;
    private int totalBaronKills;
    private int totalDragonKills;
    private int totalFirstBlood;
    private int totalTowerKills;
    private int totalWins;

    private long avgBaronKills;
    private long avgDragonKills;
    private long avgFirstBlood;
    private long avgTowerKills;
    private long svgTotalWins;

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public int getTotalBaronKills() {
        return totalBaronKills;
    }

    public void setTotalBaronKills(int totalBaronKills) {
        this.totalBaronKills = totalBaronKills;
    }

    public int getTotalDragonKills() {
        return totalDragonKills;
    }

    public void setTotalDragonKills(int totalDragonKills) {
        this.totalDragonKills = totalDragonKills;
    }

    public int getTotalFirstBlood() {
        return totalFirstBlood;
    }

    public void setTotalFirstBlood(int totalFirstBlood) {
        this.totalFirstBlood = totalFirstBlood;
    }

    public int getTotalTowerKills() {
        return totalTowerKills;
    }

    public void setTotalTowerKills(int totalTowerKills) {
        this.totalTowerKills = totalTowerKills;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public long getAvgBaronKills() {
        return avgBaronKills;
    }

    public void setAvgBaronKills(long avgBaronKills) {
        this.avgBaronKills = avgBaronKills;
    }

    public long getAvgDragonKills() {
        return avgDragonKills;
    }

    public void setAvgDragonKills(long avgDragonKills) {
        this.avgDragonKills = avgDragonKills;
    }

    public long getAvgFirstBlood() {
        return avgFirstBlood;
    }

    public void setAvgFirstBlood(long avgFirstBlood) {
        this.avgFirstBlood = avgFirstBlood;
    }

    public long getAvgTowerKills() {
        return avgTowerKills;
    }

    public void setAvgTowerKills(long avgTowerKills) {
        this.avgTowerKills = avgTowerKills;
    }

    public long getSvgTotalWins() {
        return svgTotalWins;
    }

    public void setSvgTotalWins(long svgTotalWins) {
        this.svgTotalWins = svgTotalWins;
    }
}

