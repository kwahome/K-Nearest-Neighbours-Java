/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knnproject;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author wahome
 */
public class KnnProject {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        
        // TODO code application logic here\
        
        
         String size;
        int i;
        int j;
        int row_test=1;
        int col_test=13;
        int sizeArray=4;
        int cluster_size;
          int [][] dataTo=new int [row_test][col_test];
          GroupData dataToTestget= new GroupData();
          
          int [][]setsfortest=dataToTestget.getDataToTest(row_test,col_test);
          
//          34
          System.out.println("Your set is\n");
           
//            for(i=0;i<row_test;i++){
//                for(j=0;j<col_test;j++){
//                System.out.println("Values in array are "+setsfortest[i][j]);
               
//                }
//              
//            }
            System.out.println("Enter the size of the cluster");
            Scanner input=new Scanner(System.in);
            cluster_size=input.nextInt();
            
            
       
        
         int row=69;
         int col=14;
         int [][] getdata= new int [row][col];
         
         getdata= getNumberOfItems();
         GroupData dataToTest= new GroupData();
         int sets=dataToTest.groupData(getdata);
         
         int rowdis =69;
         int coldis=15;
         int [][] ecdistance= new int [rowdis][coldis];
         
         ecdistance=calculateDistance(setsfortest,getdata);
         
//         System.out.println("After calculating the eclidean distaone\n");
//         for(int m=0;m<69;m++){
//             for(int k=0;k<15;k++){
//                 System.out.println(ecdistance[m][k]);
//             }
//         }
         
        
         
         GroupData copyArray =new GroupData();
            int []diSorted =copyArray.copyArray(ecdistance);
            
            for(i=0;i<69;i++){
//             System.out.println("Values of unSorted array are  "+diSorted[i]);
  
            }
            GroupData sortdis=new GroupData();
            int []sortedArray=sortdis.sortArray(diSorted);
            for(i=0;i<69;i++){
//             System.out.println("Values of Sorted array are  "+sortedArray[i]);
  
            }
            
             GroupData vote=new GroupData();
             vote.votePro(ecdistance,sortedArray,cluster_size);
            
    }
  public static int[][] getNumberOfItems() throws FileNotFoundException
  {

       
       int row1=69;
       int col1=15;
       int[][] spaces=new int [row1][col1];
        try{

               FileReader ConnectionToFile = new FileReader("trial.txt");
             BufferedReader reader = new BufferedReader(ConnectionToFile);
 
//             int[][] spaces = new int[10][10];
             String line = null;
             int row = 0;
             while ((line = reader.readLine()) != null)
             {
                 String[] array = line.split(" ");
                 for (int i = 0; i < array.length; i++)
                 {
//                     spaces[row][i] = (float) Integer.parseInt(array[i]);
                     spaces[row][i]=(int) (float) Float.parseFloat(array[i]);
                 }
                 row++;
             }

                 
               
} // you know what goes afterwards
            catch (Exception e) 
             {
                 // error logging
             } 
        return spaces;
           
 } 
  public static int  [][]calculateDistance(int [][]setsfortest,int [][]getdata)
  {
      int m;
      for(m=0;m<69;m++){
               
                 
                 getdata[m][14] =(int) ((int) Math.pow(((getdata [m][0])-setsfortest[0][0]),2.0)+Math.pow((getdata[m][1]-setsfortest[0][1]),2.0)+Math.pow((getdata[m][2]-setsfortest[0][2]),2.0)+Math.pow((getdata[m][3]-setsfortest[0][3]),2.0)+Math.pow((getdata[m][4]-setsfortest[0][4]),2.0)+Math.pow((getdata[m][5]-setsfortest[0][5]),2.0)+Math.pow((getdata[m][6]-setsfortest[0][6]),2.0)+Math.pow((getdata[m][7]-setsfortest[0][7]),2.0)+Math.pow((getdata[m][8]-setsfortest[0][8]),2.0)+Math.pow((getdata[m][9]-setsfortest[0][9]),2.0)+Math.pow((getdata[m][10]-setsfortest[0][10]),2.0)+Math.pow((getdata[m][11]-setsfortest[0][11]),2.0)+Math.pow((getdata[m][12]-setsfortest[0][12]),2.0));
                   
                
            }
      return getdata;
  }
  
}
