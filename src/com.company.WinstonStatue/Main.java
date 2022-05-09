package com.company.WinstonStatue;

import java.util.*;
import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {
        //setup variables
        final int bathCapacity = 60;
        ArrayList<Problem> problems = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("problems.txt"));
        Scanner sc = new Scanner(System.in);
        TimerTask game = new Game(bathCapacity, problems);
        Timer time = new Timer();

        ReadFile(problems, br);
        time.scheduleAtFixedRate(game,1000, 1000);

        // System.out.println(problems);
    }




    private static void ReadFile(ArrayList<Problem> problems, BufferedReader br) throws IOException {
        //puts the problems from the text file into the ArrayList of problems
        br.readLine();
        while(br.ready()){
            String[] daves = br.readLine().split(",");
            int points = Integer.parseInt(daves[0]);
            double answer = Double.parseDouble(daves[1]);
            int time = Integer.parseInt(daves[2]);
            Problem dave = new Problem(points,answer,time,daves[3]);
            problems.add(dave);
        }
    }



}