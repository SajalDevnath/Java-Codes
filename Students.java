package com.javacodes;

public class Students {
    String name;
    int roll, mark[];
    double avg;

    Students(String name, int roll, int[]mark){
        this.roll = roll;
        this.name = name;
        this.mark = mark;
        avg = 0;
        this.getAvg();
    }
    void getAvg(){
        for(int i:mark){
            avg += i;
        }
        avg /= mark.length;
    }
    static Students findWinner(Students s[]) {
        Students winner = null;
        double highestMarks = 0;
        for (Students s1 : s) {
            if (s1.avg >= highestMarks) {
                highestMarks = s1.avg;
                winner = s1;
            }
        }

        return winner;
    }
    void show(){
        System.out.println("Name "+name+" is the Topper");
        System.out.println("Roll: "+roll);
        System.out.println("Avg: "+avg);
    }

    public static void main(String[] args) {
        Students[] stu = new Students[5];
        stu[0] = new Students("Varun", 33, new int[]{78,83,65});
        stu[1] = new Students("Abhi", 1, new int[]{66,77,56});
        stu[2] = new Students("Sneha", 20, new int[]{88,75,90});
        stu[3] = new Students("Sruthi", 22, new int[]{48,97,98});
        stu[4] = new Students("Tanvi", 28, new int[]{63,88,68});
        findWinner(stu).show();
    }
}

