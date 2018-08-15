package com.zjb.demo;

public class RandomlyAssignedGroup {

    public static void main(String[] args) {
        String[] members = {"Kobe", "James", "Westbrook", "Durant", "Yao", "Wade"};
        int groupNum = 3;
        randomlyAssignedGroup(members, groupNum);
    }

    public static void randomlyAssignedGroup(String[] members, int groupNum) {
        int membersNum = members.length;
        int[] membersRandom = new int[membersNum];
        if (members == null || membersNum < 1) {
            System.out.println("Members can not be empty!");
            return;
        }
        if (membersNum % groupNum != 0) {
            System.out.println("There are extra members in the group!");
            return;
        }
        
        int grpMemberNum = membersNum / groupNum;
        System.out.println("Before sort:");
        for (int i = 0; i < membersNum; i++) {
            membersRandom[i] = (int) (Math.random() * 10000);
            System.out.print(membersRandom[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < membersNum; i++) {
            System.out.print(members[i] + ", ");
        }

        System.out.println("\n\nAfter sort:");
        bubbleSort(membersRandom, members);
        for (int i = 0; i < membersRandom.length; i++) {
            System.out.print(membersRandom[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i] + ", ");
        }

        System.out.println();
        assignedGroup(members, grpMemberNum, groupNum);

    }

    public static void bubbleSort(int[] arr, String[] arrString) {
        int temp;
        String temps;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    temps = arrString[j];
                    arrString[j] = arrString[j - 1];
                    arrString[j - 1] = temps;
                }
            }
        }
    }

    public static void assignedGroup(String[] members, int grpMemberNum, int groupNum) {
        for (int i = 1; i <= groupNum; i++) {
            System.out.print("\nGroup" + i + ": ");
            for (int j = grpMemberNum * (i-1); j < grpMemberNum * i; j++){
                System.out.print(members[j] + ", ");
            }
        }
    }

}
