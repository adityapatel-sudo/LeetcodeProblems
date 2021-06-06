package com.company.SchoolProblems;


import com.company.DrawingPanel;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Savitsky {
    public static void main (String [] args) throws FileNotFoundException{
        DrawingPanel dp = new DrawingPanel(800,400);
        Graphics graphic = dp.getGraphics();
        Scanner scanner = new Scanner(new File("D:\\IdeaProjects\\LeetcodeProblems\\src\\com\\company\\SchoolProblems\\Savitsky.txt"));
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner sysScanner = new Scanner(System.in);
        System.out.println("how many months in moving average?");
        int ave = sysScanner.nextInt();
        ArrayList<Double> averageLine = new ArrayList<>();
        double avetracker = 0;
        ArrayList<Double> derivatives = new ArrayList<>();

        for (int i = 0 ; i < 697 ;i++){
            list.add(scanner.nextDouble());
        }
        for(int i =0 ; i < 697-ave;i++){
            int temp = 0;
            for(int ii = 0 ; ii < ave; ii++){
                temp += list.get(i+ii);
            }
            averageLine.add((double) temp/ave);
        }
        for(int i = 0 ; i < averageLine.size()-1;i++){
            derivatives.add((averageLine.get(i+1)-averageLine.get(i))/12);
        }
        for(int i = 0 ; i < 697 ; i+=1){
            graphic.drawOval((i)+14,400-((int) Math.round(list.get(i)-310)*4),1,1);
        }
        for(int i = 0; i < 696-ave ; i++){
            graphic.setColor(Color.blue);
            graphic.drawLine(i+1+ave,400-((int)Math.round(averageLine.get(i+1))-310)*4,i+ave,400-((int)Math.round(averageLine.get(i))-310)*4);
        }
        for(int i = 0; i < 696-ave-1 ; i++){
            graphic.setColor(Color.red);
            graphic.drawLine(i+1+ave,(int) (400-derivatives.get(i+1)*10000),i+ave,(int) (400-derivatives.get(i)*10000));
            System.out.println((int) (400-derivatives.get(i+1)*10000));
        }
        for (int i=10; i<799; i+=24){
            graphic.setFont(new Font("SansSerif", Font.PLAIN, 9));
            graphic.drawString(""+(1958+i/12),i-5,397);
            graphic.drawLine(i,390,i,380);
        }
        System.out.println(averageLine);
        System.out.println(derivatives);
    }
}
