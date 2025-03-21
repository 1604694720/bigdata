package com.yang.J2SE.arr;

public class TestArrayMap {
    static int[][] map = new int[11][11];
    static int count = 1;
    public static void setMap(int row, int col,int player) {
        if(map[row][col]==0) {
            map[row][col]=player;
            vctory(row,col);
            getMap();
        }
        else {
            System.out.println("此处已经落子。");
            getMap();
        }
    }
    public static void getMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "-");
            }
            System.out.println();
        }
    }
    public static void vctory(int row, int col) {
        for (int i = col; i < map.length; i++) {
            if((i+1!=map.length)&&map[row][col] == map[row][i+1]) {
                count++;
            }else {
                break;
            }
        }
        for (int i = col; i >= 0; i--) {
            if((i-1>=0)&&map[row][col]==map[row][i-1]) {
                count++;
            }else {
                break;
            }
        }
        if (count >= 5) {
            return ;
        }else count=1;
        for (int i = row; i < map.length; i++) {
            if((i+1!=map.length)&&map[row][col]==map[i+1][col]) {
                count++;
            }else {
                break;
            }
        }
        for (int i = row; i >= 0; i--) {
            if((i-1>=0)&&map[row][col]==map[i-1][col]) {
                count++;
            }else {
                break;
            }
        }
        if (count >= 5) {
            return ;
        }else count=1;
        for (int i = row,j=col; i < map.length; i++,j++) {
            if((i+1!=map.length)&&(j+1!=map.length)&&map[row][col]==map[i+1][j+1]) {
                count++;
            }else {
                break;
            }
        }
        for (int i = row,j=col; i >=0; i--,j--) {
            if((i-1>=0)&&(j-1>=0)&&map[row][col]==map[i+1][j+1]) {
                count++;
            }else {
                break;
            }
        }
        if (count >= 5) {
            return ;
        }else count=1;

    }
}
