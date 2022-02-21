package com.javacodes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;
public class Sectors {
    String filename;
    BufferedReader br;
    List<String> uniqueSectors;
    HashMap<String,Integer> companyCount;

    Sectors(String fn){
        filename = fn;
        uniqueSectors = new ArrayList<String>();
        companyCount = new HashMap<String,Integer>();
    }
    static String[] customSplit(String s, int n){
        String[] output = new String[n];
        boolean inBetweenWord = false;
        String word = "";
        int index = 0;
        s+=",";
        for(char ch : s.toCharArray()){
            if(ch == '\"')
                inBetweenWord = inBetweenWord ? false : true;
            else if(ch ==',' && !inBetweenWord){
                output[index++] = word;
                word ="";
            }
            else
                word+=ch;
        }
        return output;
    }
    void getUniqueSectorList() throws IOException{
        br = new BufferedReader(new FileReader(filename));
        int columns = br.readLine().split(",").length;
        Stream<String>lines = br.lines();
        uniqueSectors = lines
                .map(s-> customSplit(s,columns)[2])
                .distinct()
                .toList();
        br.close();
        lines.close();
    }
    void getCompanyCount(String sector) throws IOException{
        br = new BufferedReader(new FileReader(filename));
        int columns = br.readLine().split(",").length;
        Stream<String>lines = br.lines();
        int count = (int)lines
                .filter(s -> sector.equalsIgnoreCase(customSplit(s,
                        columns)[2]))
                .count();
        companyCount.put(sector,count);
        br.close();
        lines.close();
    }
    IntSummaryStatistics getStats(String sector, int col) throws IOException{
        br = new BufferedReader(new FileReader(filename));
        int columns = br.readLine().split(",").length;
        Stream<String>lines = br.lines();
        return lines
                .filter(s-> sector.equalsIgnoreCase(customSplit(s, columns)[2]))
                .mapToInt(s-> Integer.parseInt(customSplit(s,columns)[col]))
                .summaryStatistics();
    }
    void printSectorStats(String sector) throws IOException {
        IntSummaryStatistics statRevenue, statProfits, statEmployees;
        statRevenue = this.getStats(sector,5);
        statProfits = this.getStats(sector,6);
        statEmployees = this.getStats(sector,7);
        System.out.println("Mean, Max, Min of" + sector);
        System.out.printf("\tRevenue: (%.2f, %d, %d) \n", statRevenue.getAverage(),statRevenue.getMax(),statRevenue.getMin());
        System.out.printf("\tProfits : (%.2f, %d, %d) \n", statProfits.getAverage(),statProfits.getMax(),statProfits.getMin());
        System.out.printf("\tEmployees : (%.2f, %d, %d) \n", statEmployees.getAverage(),statEmployees.getMax(),statEmployees.getMin());
    }

    public static void main(String[] args) throws IOException{
        Sectors s = new Sectors("Fortune1000.csv");
        s.getUniqueSectorList();
        System.out.println("Number of unique sectors = "+s.uniqueSectors.size());
        System.out.println("\nList of unique sectors: ");
        for (String str : s.uniqueSectors)
            System.out.println(str);
        for(String sector: s.uniqueSectors){
            s.getCompanyCount(sector);
        }
        System.out.println("\nNumber of companies in each sector: ");
        for(String sector : s.uniqueSectors){
            System.out.println(sector + ":" + s.companyCount.get(sector));
        }
        System.out.println();
        for(String sector : s.uniqueSectors){
            s.printSectorStats(sector);
        }
    }
}
