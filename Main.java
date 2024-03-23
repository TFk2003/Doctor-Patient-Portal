package com.journaldev.threads;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 */
public enum Main {
    ;

    private static final long MILLIS = 4000L;
    private static final long MILLIS1 = 3000L;
    private static final int INT = 12;
    private static final char CHAR = '*';
    private static final String EMAIL = "Email: ";
    private static final String PHONE_NUMBER = "Phone Number: ";
    private static final String QUALIFICATION = "Qualification: ";
    private static final String ACCOUNT = "Account: ";
    private static final int INT3 = 11;
    private static final int INT1 = INT3;
    private static final int MILLIS2 = 6000;
    private static final int MILLIS3 = 5000;
    private static final char CHAR1 = ':';
    private static final String JANUARY = "January";
    private static final String FEBRUARY = "February";
    private static final String MARCH = "March";
    private static final String APRIL = "April";
    private static final String MAY = "May";
    private static final String JUNE = "June";
    private static final String JULY = "July";
    private static final String OCTOBER = "October";
    private static final String NOVEMBER = "November";
    private static final String SEPTEMBER = "September";
    private static final String AUGUST = "August";
    private static final String DECEMBER = "December";
    private static final char CHAR2 = 'y';
    private static final char CHAR3 = 'Y';
    private static final String HISTORY_TXT = "history.txt";
    private static final char CHAR4 = ',';
    private static final int INT2 = 60;
    private static final String WALLET = "Wallet: ";
    private static final String AWAITING = "Awaiting";
    private static final String LINE_SEPARATOR = "line.separator";
    private static final String HAS_PAID_RS_1000_FOR_APPOINTMENT_ON = " has paid Rs.1000 for appointment on ";
    private static final String ADMINUSER_TXT = "adminuser.txt";
    private static final String DOCTORUSER_TXT = "doctoruser.txt";
    private static final String PATIENTUSER_TXT = "patientuser.txt";
    private static final String ORGAN_TXT = "organ.txt";
    private static final String ORGAN_HISTORY_TXT = "organHistory.txt";
    private static final String GMAIL_COM = "@gmail.com";

    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner obj = new Scanner(System.in);
        dpp();
        Thread.sleep(MILLIS);
        module();
        System.out.print("\t\t\t\t\t\t\t");
        String ch = obj.nextLine();
        choice(ch);
    }

    private static void login() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t    .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.\n");
        System.out.print("\t\t\t\t\t\t\t   / .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                                                    /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /         WELCOME TO DOCTOR PATIENT PORTAL         \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                FOR SIGN IN PRESS 1                 /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /               FOR SIGN UP PRESS 2                \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\.--..--..--..--..--..--..--..--..--..--..--..--..--./\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\n");
        System.out.print("\t\t\t\t\t\t\t    `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\n");

    }

    private static void dpp() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\t\t\t\t\t\t\t$$$$$$$\\   $$$$$$\\   $$$$$$\\ $$$$$$$$\\  $$$$$$\\  $$$$$$$\\          \n");
        System.out.print("\t\t\t\t\t\t\t$$  __$$\\ $$  __$$\\ $$  __$$\\\\__$$  __|$$  __$$\\ $$  __$$\\         \n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ /  $$ |$$ /  \\__|  $$ |   $$ /  $$ |$$ |  $$ |        \n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ |  $$ |$$ |        $$ |   $$ |  $$ |$$$$$$$  |        \n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ |  $$ |$$ |        $$ |   $$ |  $$ |$$  __$$<         \n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ |  $$ |$$ |  $$\\   $$ |   $$ |  $$ |$$ |  $$ |        \n");
        System.out.print("\t\t\t\t\t\t\t$$$$$$$  | $$$$$$  |\\$$$$$$  |  $$ |    $$$$$$  |$$ |  $$ |        \n");
        System.out.print("\t\t\t\t\t\t\t\\_______/  \\______/  \\______/   \\__|    \\______/ \\__|  \\__|        \n");
        System.out.print("\t\t\t\t\t\t\t$$$$$$$\\   $$$$$$\\ $$$$$$$$\\ $$$$$$\\ $$$$$$$$\\ $$\\   $$\\ $$$$$$$$\\ \n");
        System.out.print("\t\t\t\t\t\t\t$$  __$$\\ $$  __$$\\\\__$$  __|\\_$$  _|$$  _____|$$$\\  $$ |\\__$$  __|\n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ /  $$ |  $$ |     $$ |  $$ |      $$$$\\ $$ |   $$ |   \n");
        System.out.print("\t\t\t\t\t\t\t$$$$$$$  |$$$$$$$$ |  $$ |     $$ |  $$$$$\\    $$ $$\\$$ |   $$ |   \n");
        System.out.print("\t\t\t\t\t\t\t$$  ____/ $$  __$$ |  $$ |     $$ |  $$  __|   $$ \\$$$$ |   $$ |   \n");
        System.out.print("\t\t\t\t\t\t\t$$ |      $$ |  $$ |  $$ |     $$ |  $$ |      $$ |\\$$$ |   $$ |   \n");
        System.out.print("\t\t\t\t\t\t\t$$ |      $$ |  $$ |  $$ |   $$$$$$\\ $$$$$$$$\\ $$ | \\$$ |   $$ |   \n");
        System.out.print("\t\t\t\t\t\t\t\\__|      \\__|  \\__|  \\__|   \\______|\\________|\\__|  \\__|   \\__|   \n");
        System.out.print("\t\t\t\t\t\t\t$$$$$$$\\   $$$$$$\\  $$$$$$$\\ $$$$$$$$\\  $$$$$$\\  $$\\               \n");
        System.out.print("\t\t\t\t\t\t\t$$  __$$\\ $$  __$$\\ $$  __$$\\\\__$$  __|$$  __$$\\ $$ |               \n");
        System.out.print("\t\t\t\t\t\t\t$$ |  $$ |$$ /  $$ |$$ |  $$ |  $$ |   $$ /  $$ |$$ |               \n");
        System.out.print("\t\t\t\t\t\t\t$$$$$$$  |$$ |  $$ |$$$$$$$  |  $$ |   $$$$$$$$ |$$ |               \n");
        System.out.print("\t\t\t\t\t\t\t$$  ____/ $$ |  $$ |$$  __$$<   $$ |   $$  __$$ |$$ |               \n");
        System.out.print("\t\t\t\t\t\t\t$$  ____/ $$ |  $$ |$$  __$$<   $$ |   $$  __$$ |$$ |               \n");
        System.out.print("\t\t\t\t\t\t\t$$ |       $$$$$$  |$$ |  $$ |  $$ |   $$ |  $$ |$$$$$$$$\\          \n");
        System.out.print("\t\t\t\t\t\t\t\\__|       \\______/ \\__|  \\__|  \\__|   \\__|  \\__|\\________|         \n");
    }

    private static void module() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\ \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//                                                        \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t \\/                                                          \\/\n");
        System.out.print("\t\t\t\t\t\t\t /\\             WELCOME TO DOCTOR PATIENT PORTAL             /\\\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\                                                        //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//                                                        \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\                                                        //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//                   FOR ADMIN PRESS 1                    \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t \\/                                                          \\/\n");
        System.out.print("\t\t\t\t\t\t\t /\\                                                          /\\\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\                                                        //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//                   FOR DOCTOR PRESS 2                   \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\                                                        //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//                                                        \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t \\/                                                          \\/\n");
        System.out.print("\t\t\t\t\t\t\t /\\                    FOR PATIENT PRESS 3                   /\\\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\                                                        //\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\// /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ \\\\//\n");
        System.out.print("\t\t\t\t\t\t\t//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\\n");
        System.out.print("\t\t\t\t\t\t\t\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\n");
        System.out.print("\t\t\t\t\t\t\t \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/\n");
    }

    private static void Admin() throws IOException, InterruptedException {
        Scanner obj = new Scanner(System.in);
        String ch;
        String id = user("1", 1);
        ADMIN a1 = retrieveAdmin(id);
        Thread.sleep(MILLIS1);
        AdminWork();
        System.out.print("\t\t\t\t\t\t\t");
        ch = obj.nextLine();
        AdminWork2(ch, a1);
    }

    private static void Doctor() throws IOException, InterruptedException {
        Scanner obj = new Scanner(System.in);
        String ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String id = user("1", 2);
        DOCTOR d1 = retrieveDoctor(id);
        Thread.sleep(MILLIS1);
        DoctorWork();
        System.out.print("\t\t\t\t\t\t\t");
        ch = obj.nextLine();
        DoctorWork2(ch, d1);
    }

    private static void Patient() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        login();
        Scanner obj = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t");
        String ch = obj.nextLine();
        start.waitFor();
        String id = user(ch, 3);
        PATIENT p1 = retrievePatient(id);
        Thread.sleep(MILLIS1);
        PatientWork();
        System.out.print("\t\t\t\t\t\t\t");
        ch = obj.nextLine();
        PatientWork2(ch, p1);
    }

    private static String user(String ch, int ch2) throws IOException, InterruptedException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String id = "", sen, cid, cPas, pas = "", pas2, name, email, file, speciality, education, address, gender;
        String phNum = "0";
        boolean g = true;
        String[] timings = new String[7];
        char[] password = new char[8];
        boolean[] paid = new boolean[INT];
        int i, nf = 0, flag, j, expYr = 0, age = 0, salary = 0, account = 0;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                System.out.print("\t\t\t\t\t\t\t");
                id = obj.nextLine();
                while (id.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                }
                while (true) {
                    try {
                        System.out.print("\t\t\t\t\t\t\t");
                        password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas = new String(password);
                    File myfile;
                    if (1 == ch2) {
                        myfile = new File(ADMINUSER_TXT);
                    } else if (2 == ch2) {
                        myfile = new File(DOCTORUSER_TXT);
                    } else {
                        myfile = new File(PATIENTUSER_TXT);
                    }
                    Scanner myReader = new Scanner(myfile);
                    while (true) {
                        boolean b = !myReader.hasNextLine();
                        if (b) break;
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        cPas = sen.substring(j + 1, j + 9);
                        if (cid.equals(id) && cPas.equals(pas)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tSIGN-IN SUCCESSFUL");
                            return id;
                        }
                    }
                    myReader.close();
                    System.out.println("\n\n\t\t\t\t\t\t\tInvalid ID or Password\n\t\t\t\t\t\t\tTryAgain");
                    Thread.sleep(1000);
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                }
            }
            case "2": {
                while (0 == nf) {
                    File myfile;
                    if (1 == ch2) {
                        myfile = new File(ADMINUSER_TXT);
                        if (!myfile.exists()) {
                            myfile.createNewFile();
                        }
                    } else if (2 == ch2) {
                        myfile = new File(DOCTORUSER_TXT);
                        if (!myfile.exists()) {
                            myfile.createNewFile();
                        }
                    } else {
                        myfile = new File(PATIENTUSER_TXT);
                        if (!myfile.exists()) {
                            myfile.createNewFile();
                        }
                    }
                    Scanner myReader = new Scanner(myfile);
                    if (2 == ch2 || 1 == ch2) {
                        System.out.println("\t\t\t\t\t\t\tEnter ID");
                    } else {
                        System.out.println("\t\t\t\t\t\t\tEnter Your ID");
                    }
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                    flag = 0;
                    while (myReader.hasNextLine() && 0 == flag) {
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        if (id.equals(cid)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tID already exist\n\t\t\t\t\t\t\tEnter new ID");
                            flag = 1;
                        }
                        if (0 == flag) {
                            nf = 1;
                        }
                    }
                    myReader.close();
                    if (0 == flag) {
                        nf = 1;
                    }
                }
                flag = 0;
                while ((0 == flag)) {
                    if (2 == ch2 || 1 == ch2) {
                        try {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Password: ");
                            while (null == password) {
                                System.out.print("\t\t\t\t\t\t\t");
                                password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                            }
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    } else {
                        try {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                            while (null == password) {
                                System.out.print("\t\t\t\t\t\t\t");
                                password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                            }
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                    assert null != password;
                    pas = new String(password);
                    if (2 == ch2 || 1 == ch2) {
                        try {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tRe-Enter Password: ");
                            while (null == password) {
                                System.out.print("\t\t\t\t\t\t\t");
                                password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                            }
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    } else {
                        try {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tRE-Enter Your Password: ");
                            while (null == password) {
                                System.out.print("\t\t\t\t\t\t\t");
                                password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                            }
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                    assert null != password;
                    pas2 = new String(password);
                    if (pas2.equals(pas)) {
                        flag = 1;
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t\tPassword not matches\n\t\t\t\t\t\t\tRe-enter password");
                    }
                }
                if (1 == ch2) {
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                    while (name.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                        System.out.print("\t\t\t\t\t\t\t");
                        name = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter contact email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                    while (!email.contains(GMAIL_COM)) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT email");
                        System.out.print("\t\t\t\t\t\t\t");
                        email = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                    while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                        System.out.print("\t\t\t\t\t\t\t");
                        phNum = obj.nextLine();
                    }
                    file = id + "a.txt";
                    FileWriter writer = new FileWriter(file);
                    writer.write("ID: " + id + "\n");
                    writer.write("Name: " + name + "\n");
                    writer.write(EMAIL + email + "\n");
                    writer.write(PHONE_NUMBER + phNum + "\n");
                    writer.close();
                    FileWriter myWriter = new FileWriter(ADMINUSER_TXT, true);
                    myWriter.write(id + "*" + pas + "\n");
                    myWriter.close();
                } else if (2 == ch2) {
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                    while (name.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                        System.out.print("\t\t\t\t\t\t\t");
                        name = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's contact email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                    while (!email.contains(GMAIL_COM)) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT email");
                        System.out.print("\t\t\t\t\t\t\t");
                        email = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                    while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                        System.out.print("\t\t\t\t\t\t\t");
                        phNum = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's speciality");
                    System.out.print("\t\t\t\t\t\t\t");
                    speciality = obj.nextLine();
                    while (speciality.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the speciality");
                        System.out.print("\t\t\t\t\t\t\t");
                        speciality = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's qualification");
                    System.out.print("\t\t\t\t\t\t\t");
                    education = obj.nextLine();
                    while (education.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the qualification");
                        System.out.print("\t\t\t\t\t\t\t");
                        education = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's address");
                    System.out.print("\t\t\t\t\t\t\t");
                    address = obj.nextLine();
                    while (address.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the address");
                        System.out.print("\t\t\t\t\t\t\t");
                        address = obj.nextLine();
                    }
                    g = true;
                    while (g) {
                        try {
                            System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's experience(in years)");
                            System.out.print("\t\t\t\t\t\t\t");
                            expYr = obj.nextInt();
                            g = false;
                        } catch (InputMismatchException e) {
                            System.out.println("\n\n\t\t\t\t\t\t\t" + e);
                            System.out.print("\t\t\t\t\t\t\t");
                            expYr = obj.nextInt();
                        }
                        obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's schedule for a week(e.g. 6pm to 10 pm)(if OFF write off)");
                    for (i = 0; 7 > i; i++) {
                        timings[i] = obj.nextLine();
                        while (timings[i].isEmpty()) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the timings");
                            System.out.print("\t\t\t\t\t\t\t");
                            timings[i] = obj.nextLine();
                        }
                    }
                    g = true;
                    while (g) {
                        try {
                            System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor's salary");
                            System.out.print("\t\t\t\t\t\t\t");
                            salary = obj.nextInt();
                            g = false;
                        } catch (InputMismatchException e) {
                            System.out.println("\n\n\t\t\t\t\t\t\t" + e);
                            System.out.print("\t\t\t\t\t\t\t");
                            salary = obj.nextInt();
                        }
                        obj.nextLine();
                    }
                    for (i = 0; 7 > i; i++) {
                        paid[i] = false;
                    }
                    file = id + "d.txt";
                    FileWriter writer = new FileWriter(file);
                    writer.write("ID: " + id + "\n");
                    writer.write("Name: " + name + "\n");
                    writer.write(EMAIL + email + "\n");
                    writer.write(PHONE_NUMBER + phNum + "\n");
                    writer.write("Speciality: " + speciality + "\n");
                    writer.write(QUALIFICATION + education + "\n");
                    writer.write("Address: " + address + "\n");
                    writer.write("Experience(in years): " + expYr + "\n");
                    writer.write("Timings\n");
                    writer.write("Monday: " + timings[0] + "\n");
                    writer.write("Tuesday: " + timings[1] + "\n");
                    writer.write("Wednesday: " + timings[2] + "\n");
                    writer.write("Thursday: " + timings[3] + "\n");
                    writer.write("Friday: " + timings[4] + "\n");
                    writer.write("Saturday: " + timings[5] + "\n");
                    writer.write("Sunday: " + timings[6] + "\n");
                    writer.write("Salary: " + salary + "\n");
                    writer.write(ACCOUNT + account + "\n");
                    writer.write("Salary Paid\n");
                    writer.write("January: " + paid[0] + "\n");
                    writer.write("February: " + paid[1] + "\n");
                    writer.write("March: " + paid[2] + "\n");
                    writer.write("April: " + paid[3] + "\n");
                    writer.write("May: " + paid[4] + "\n");
                    writer.write("June: " + paid[5] + "\n");
                    writer.write("July: " + paid[6] + "\n");
                    writer.write("August: " + paid[7] + "\n");
                    writer.write("September: " + paid[8] + "\n");
                    writer.write("October: " + paid[9] + "\n");
                    writer.write("November: " + paid[10] + "\n");
                    writer.write("December: " + paid[INT1] + "\n");
                    writer.close();
                    FileWriter myWriter = new FileWriter(DOCTORUSER_TXT, true);
                    myWriter.write(id + "*" + pas + "\n");
                    myWriter.close();
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter your name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                    while (name.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                        System.out.print("\t\t\t\t\t\t\t");
                        name = obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                    while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                        System.out.print("\t\t\t\t\t\t\t");
                        phNum = obj.nextLine();
                    }
                    g = true;
                    while (g) {
                        try {
                            System.out.println("\n\n\t\t\t\t\t\t\tEnter your age");
                            System.out.print("\t\t\t\t\t\t\t");
                            age = obj.nextInt();
                            g = false;
                        } catch (InputMismatchException e) {
                            System.out.println("\n\n\t\t\t\t\t\t\tENTER IN DIGITS " + e);
                            System.out.print("\t\t\t\t\t\t\t");
                            age = obj.nextInt();
                        }
                        obj.nextLine();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter your gender");
                    System.out.print("\t\t\t\t\t\t\t");
                    gender = obj.nextLine();
                    while (gender.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the gender");
                        System.out.print("\t\t\t\t\t\t\t");
                        gender = obj.nextLine();
                    }
                    file = id + "p.txt";
                    FileWriter writer = new FileWriter(file);
                    writer.write("ID: " + id + "\n");
                    writer.write("Name: " + name + "\n");
                    writer.write(PHONE_NUMBER + phNum + "\n");
                    writer.write("Age: " + age + "\n");
                    writer.write("Gender: " + gender + "\n");
                    writer.write("Wallet: 0\n");
                    writer.close();
                    FileWriter myWriter = new FileWriter(PATIENTUSER_TXT, true);
                    myWriter.write(id + "*" + pas + "\n");
                    myWriter.close();
                }
                if (2 == ch2 || 1 == ch2) {
                    System.out.println("\n\n\t\t\t\t\t\t\t\t\tREGISTRATION SUCCESSFUL");
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t\t\t\tSIGN-UP SUCCESSFUL");
                }
                return id;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                start.waitFor();
                login();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                id = user(s, ch2);
                return id;
            }
        }
    }

    private static void choice(String ch) throws InterruptedException, IOException {
        String s = ch;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                Admin();
                break;
            }
            case "2": {
                Doctor();
                break;
            }
            case "3": {
                Patient();
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                module();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                choice(s);
            }
        }
    }

    private static void AdminWork() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         1. Doctor Registration                        ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         2. View Doctor Profile                        ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         3. Edit Profile                               ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         4. Admin Registration                         ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         5. Accounts                                   ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         6. View Feedback                              ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         7. Log Out                                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void DoctorWork() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                  WELCOME TO PORTAL                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Appointment Schedule                        ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Search Patient                              ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Edit Profile                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          4. Accounts                                    ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          5. Log Out                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void PatientWork() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                  WELCOME TO PORTAL                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Appointment Booking                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. View Appointment                            ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Search History                              ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          4. Edit Profile                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          5. Organ System                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          6. Feedback                                    ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          7. Log Out                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void AdminWork2(String ch, ADMIN a1) throws InterruptedException, IOException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        String name, sen, cid, ch2, doctorId, substring;
        DOCTOR doctor;
        int parseInt;
        boolean found = true;
        ArrayList<DOCTOR> d = new ArrayList<>();
        d = doctorReader();
        int i = 0, j;
        switch (s) {
            case "1": {
                user("2", 2);
                Thread.sleep(MILLIS);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "2": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
                    doctor = d.get(i);
                    String doctorName = doctor.getName();
                    if (name.equalsIgnoreCase(doctorName)) {
                        a1.viewDoctor(doctor);
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println("\n\n\t\t\t\t\t\t\tNo record found.\n\t\t\t\t\t\t\tPlease Enter correct name");
                }
                Thread.sleep(MILLIS2);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "3": {
                EditAdmin();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                EditAdmin2(ch2, a1);
                Thread.sleep(MILLIS);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "4": {
                user("2", 1);
                Thread.sleep(MILLIS);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "5": {
                Accounts();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                Accounts2(ch2, a1);
                Thread.sleep(MILLIS);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "6": {
                parseInt = chooseDoctor(d);
                doctor = d.get(parseInt - 1);
                doctorId = doctor.getId();
                File myfile = new File(doctorId + "fb.txt");
                if (myfile.exists()) {
                    Scanner myReader = new Scanner(myfile);
                    if (myReader.hasNextLine()) {
                        while (myReader.hasNextLine()) {
                            sen = myReader.nextLine();
                            j = 0;
                            while (CHAR1 != sen.charAt(j)) {
                                j++;
                            }
                            substring = sen.substring(0, j);
                            j++;
                            String feedback = sen.substring(j);
                            System.out.println("\n\t\t\t\t\t\t\tPatient Name: " + substring + "\n\t\t\t\t\t\t\tFeedback: " + feedback);
                        }
                    } else {
                        System.out.println("\n\t\t\t\t\t\t\tNo feedback available");
                    }
                    myReader.close();
                } else {
                    myfile.createNewFile();
                    System.out.println("\n\t\t\t\t\t\t\tNo feedback available");
                }
                Thread.sleep(MILLIS);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
                break;
            }
            case "7": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                AdminWork2(s, a1);
            }

        }
    }

    private static ArrayList<PATIENT> patientReader() throws IOException {
        File myfile = new File(PATIENTUSER_TXT);
        Scanner myReader = new Scanner(myfile);
        String sen, cid;
        int i = 0, j;
        ArrayList<PATIENT> p = new ArrayList<>();
        ADMIN.setNumberOfPatients(0);
        while (myReader.hasNextLine()) {
            sen = myReader.nextLine();
            j = 0;
            i++;
            while (CHAR != sen.charAt(j)) {
                j++;
            }
            cid = sen.substring(0, j);
            PATIENT e = retrievePatient(cid);
            p.add(e);
        }
        myReader.close();
        return p;
    }

    private static void DoctorWork2(String ch, DOCTOR d1) throws InterruptedException, IOException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        int i = 0, j = 0, k = 0;
        LocalDate currentDate;
        APPOINTMENT app, appointment;
        PATIENT p1 = null;
        boolean found = true;
        File myfile;
        Scanner myReader;
        String lineSeparator = System.lineSeparator();
        String name, sen, cid, ch3, ch2, formattedDate, date, outcome, oldLine, newLine, content;
        ArrayList<APPOINTMENT> a = new ArrayList<>();
        ArrayList<PATIENT> p = new ArrayList<>();
        switch (s) {
            case "1": {
                currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                formattedDate = currentDate.format(formatter);
                String d1Id = d1.getId();
                a = appointmentReader(d1Id);
                for (i = 0; i < a.size(); i++) {
                    j = 0;
                    appointment = a.get(i);
                    String appointmentDate = appointment.getDate();
                    while (CHAR4 != appointmentDate.charAt(j)) {
                        j++;
                    }
                    j++;
                    j++;
                    k = j;
                    while (CHAR4 != appointmentDate.charAt(k)) {
                        k++;
                    }
                    date = appointmentDate.substring(j, k);
                    String appointmentOutcome = appointment.getOutcome();
                    if (date.equalsIgnoreCase(formattedDate) && AWAITING.equalsIgnoreCase(appointmentOutcome)) {
                        found = false;
                        sen = appointmentDate + " " + appointment.getPatientName() + " " + appointment.getDoctorName() + " " + appointment.getProblem();
                        System.out.println("\n\n\n\n\t\t\t\t\t\t\t" + (i + 1) + " " + sen);
                    } else {
                        a.remove(i);
                        i--;
                    }
                }
                if (found) {
                    System.out.println("\n\n\n\n\t\t\t\t\t\t\tNo appointment today");
                } else {
                    System.out.println("\n\n\n\n\t\t\t\t\t\t\tPlease choose the appointment");
                    System.out.print("\t\t\t\t\t\t\t");
                    ch3 = obj.nextLine();
                    while (found) {
                        try {
                            while (ch3.isEmpty() || Integer.parseInt(ch3) > (i + 1)) {
                                System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the appointment");
                                System.out.print("\t\t\t\t\t\t\t");
                                ch3 = obj.nextLine();
                            }
                            found = false;
                        } catch (NumberFormatException e) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                            System.out.print("\t\t\t\t\t\t\t");
                            ch3 = obj.nextLine();
                        }
                    }
                    System.out.println("\n\n\n\n\t\t\t\t\t\t\tWrite the outcome");
                    System.out.print("\t\t\t\t\t\t\t");
                    outcome = obj.nextLine();
                    while (outcome.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the outcome");
                        System.out.print("\t\t\t\t\t\t\t");
                        outcome = obj.nextLine();
                    }
                    int parseInt = Integer.parseInt(ch3);
                    a.get(parseInt - 1).setOutcome(outcome);
                    p = patientReader();
                    for (i = 0; i < ADMIN.getNumberOfPatients(); i++) {
                        PATIENT patient = p.get(i);
                        String name1 = patient.getName();
                        if (a.get(parseInt - 1).getPatientName().equalsIgnoreCase(name1)) {
                            p1 = patient;
                            break;
                        }
                    }
                    String p1Id = p1.getId();
                    myfile = new File(p1Id + HISTORY_TXT);
                    FileWriter myWriter = new FileWriter(myfile, true);
                    sen = a.get(parseInt - 1).getDate() + "*" + a.get(parseInt - 1).getPatientName() + "*" + a.get(parseInt - 1).getDoctorName() + "*" +
                            a.get(parseInt - 1).getProblem() + "*" + a.get(parseInt - 1).getOutcome() + "\n";
                    myWriter.write(sen);
                    myWriter.close();
                    newLine = a.get(parseInt - 1).getDate() + "*" + a.get(parseInt - 1).getPatientName() + "*" + a.get(parseInt - 1).getDoctorName()
                            + "*" + a.get(parseInt - 1).getProblem() + "*" + a.get(parseInt - 1).getOutcome() + "*true";
                    oldLine = a.get(parseInt - 1).getDate() + "*" + a.get(parseInt - 1).getPatientName() + "*" + a.get(parseInt - 1).getDoctorName()
                            + "*" + a.get(parseInt - 1).getProblem() + "*Awaiting*true";
                    myfile = new File(d1Id + "app.txt");
                    File tempFile = new File("temp.tmp");
                    BufferedReader reader = new BufferedReader(new FileReader(myfile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                    String lineToRemove = oldLine;
                    String currentLine;
                    while (null != (currentLine = reader.readLine())) {
                        if (!currentLine.trim().equals(lineToRemove)) {
                            String property = System.getProperty(LINE_SEPARATOR);
                            writer.write(currentLine + property);
                        }
                        if (currentLine.trim().equals(lineToRemove)) {
                            String property = System.getProperty(LINE_SEPARATOR);
                            writer.write(newLine + property);
                        }
                    }
                    reader.close();
                    writer.close();
                    if (myfile.delete()) {
                        tempFile.renameTo(myfile);
                    }
                }
                Thread.sleep(MILLIS);
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorWork2(s, d1);
                break;
            }
            case "2": {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tEnter Patient Complete Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                p = patientReader();
                for (i = 0; i < ADMIN.getNumberOfPatients(); i++) {
                    PATIENT patient = p.get(i);
                    String name1 = patient.getName();
                    if (name.equalsIgnoreCase(name1)) {
                        retrieveHistory(patient);
                        break;
                    }
                }
                Thread.sleep(MILLIS);
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorWork2(s, d1);
                break;
            }
            case "3": {
                EditDoctor();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                EditDoctor2(ch2, d1);
                Thread.sleep(MILLIS);
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorWork2(s, d1);
                break;
            }
            case "4": {
                DoctorAccounts();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                DoctorAccounts2(ch2, d1);
                Thread.sleep(MILLIS);
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorWork2(s, d1);
                break;
            }
            case "5": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorWork2(s, d1);
            }
        }
    }

    private static ArrayList<DOCTOR> doctorReader() throws FileNotFoundException {
        String sen, substring, cid;
        int i = 0, j, k;
        File myfile = new File(DOCTORUSER_TXT);
        Scanner myReader = new Scanner(myfile);
        ArrayList<DOCTOR> d = new ArrayList<>();
        DOCTOR e;
        ADMIN.setNumberOfDoctors(0);
        while (myReader.hasNextLine()) {
            sen = myReader.nextLine();
            j = 0;
            i++;
            while (CHAR != sen.charAt(j)) {
                j++;
            }
            substring = sen.substring(0, j);
            cid = substring;
            e = retrieveDoctor(cid);
            d.add(e);
        }
        myReader.close();
        return d;
    }

    private static int chooseDoctor(ArrayList<? extends DOCTOR> d) {
        int i, k;
        boolean found = true;
        DOCTOR doctor;
        Scanner obj = new Scanner(System.in);
        String ch2;
        int parseInt;
        System.out.println("\n\n\t\t\t\t\t\t\tAvailable Doctors");
        k = 1;
        for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
            doctor = d.get(i);
            String doctorName = doctor.getName();
            System.out.println("\n\t\t\t\t\t\t\t" + k + ": " + doctorName);
            k++;
        }
        System.out.println("\n\n\t\t\t\t\t\t\tPlease choose the doctor");
        System.out.print("\t\t\t\t\t\t\t");
        ch2 = obj.nextLine();
        while (found) {
            try {
                while (ch2.isEmpty() || Integer.parseInt(ch2) > k) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the doctor");
                    System.out.print("\t\t\t\t\t\t\t");
                    ch2 = obj.nextLine();
                }
                found = false;
            } catch (NumberFormatException e) {
                System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
            }
        }
        parseInt = Integer.parseInt(ch2);
        return parseInt;
    }

    private static ArrayList<APPOINTMENT> appointmentReader(String doctorId) throws IOException {
        int i, j;
        APPOINTMENT app;
        ArrayList<APPOINTMENT> a = new ArrayList<>();
        File myfile = new File(doctorId + "app.txt");
        if (myfile.exists()) {
            Scanner myReader = new Scanner(myfile);
            i = 0;
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                i++;
            }
            myReader.close();
            for (j = 0; j < i; j++) {
                app = retrieveAppointment(myfile, j + 1);
                a.add(app);
            }
        } else {
            myfile.createNewFile();
        }
        return a;
    }

    private static void PatientWork2(String ch, PATIENT p1) throws InterruptedException, IOException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        String p1Name = p1.getName();
        String ch2, sen, substring, cid, doctorId, name, feedback;
        ArrayList<APPOINTMENT> a = new ArrayList<>();
        APPOINTMENT app, appointment;
        boolean found = true;
        ArrayList<DOCTOR> d = new ArrayList<>();
        DOCTOR e, doctor;
        int i = 0, j, k = 0, parseInt;
        d = doctorReader();
        switch (s) {
            case "1": {
                appointment();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                appointment2(ch2, p1);
                Thread.sleep(MILLIS3);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            case "3": {
                retrieveHistory(p1);
                Thread.sleep(MILLIS2);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            case "4": {
                EditPatient();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                EditPatient2(ch2, p1);
                Thread.sleep(MILLIS);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            case "5": {
                Organ();
                System.out.print("\t\t\t\t\t\t\t");
                ch2 = obj.nextLine();
                Organ2(ch2, p1);
                Thread.sleep(MILLIS);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            case "6": {
                parseInt = chooseDoctor(d);
                doctor = d.get(parseInt - 1);
                doctorId = doctor.getId();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter the feedback");
                System.out.print("\t\t\t\t\t\t\t");
                feedback = obj.nextLine();
                while (feedback.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the feedback");
                    System.out.print("\t\t\t\t\t\t\t");
                    feedback = obj.nextLine();
                }
                File myfile = new File(doctorId + "fb.txt");
                FileWriter myWriter = new FileWriter(myfile, true);
                myWriter.write(p1Name + ": " + feedback + "\n");
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tFeedback Successfully completed");
                Thread.sleep(MILLIS);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            case "7": {
                System.exit(0);
                break;
            }
            case "2": {
                parseInt = chooseDoctor(d);
                doctor = d.get(parseInt - 1);
                doctorId = doctor.getId();
                a = appointmentReader(doctorId);
                for (i = 0; i < a.size(); i++) {
                    appointment = a.get(i);
                    if (isBoolean2(p1Name, appointment)) {
                        appointment.viewAppointment();
                        found = false;
                    }
                }
                if (found) {
                    System.out.println("\n\n\t\t\t\t\t\t\tNo Appointment Booking is done OR Appointment is completed.");
                }
                Thread.sleep(MILLIS);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                PatientWork2(s, p1);
            }

        }
    }

    private static boolean isBoolean2(String name, APPOINTMENT appointment) {
        String appPatientName = appointment.getPatientName();
        String appointmentOutcome = appointment.getOutcome();
        return ((appPatientName.equalsIgnoreCase(name)) && appointmentOutcome.equalsIgnoreCase(AWAITING));
    }

    private static ADMIN retrieveAdmin(String iD) throws FileNotFoundException {
        File myfile = new File(iD + "a.txt");
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        int j = 0;
        String id, name, email;
        String phNum;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(j + 2);
        id = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        name = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        email = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        phNum = substring;
        myReader.close();
        return new ADMIN(id, name, email, phNum);
    }

    private static void EditAdmin() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                      EDIT MENU                          ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Admin Name                                  ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Admin Email                                 ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Admin Phone Number                          ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          4. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void EditAdmin2(String ch2, ADMIN a1) throws InterruptedException, IOException {
        String s = ch2;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        String phNum = "0";
        boolean g = true;
        String ch, name, content, oldLine, newLine, email;
        String id = a1.getId();
        String str1 = System.lineSeparator();
        switch (s) {
            case "1": {
                oldLine = "Name: " + a1.getName();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                a1.setName(name);
                newLine = "Name: " + a1.getName();
                File myfile = new File(id + "a.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String str = myReader.nextLine();
                    buffer.append(str).append(str1);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditAdmin();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditAdmin2(s, a1);
                break;
            }
            case "2": {
                oldLine = EMAIL + a1.getEmail();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Email");
                System.out.print("\t\t\t\t\t\t\t");
                email = obj.nextLine();
                while (!email.contains(GMAIL_COM)) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                }
                a1.setEmail(email);
                newLine = EMAIL + a1.getEmail();
                File myfile = new File(id + "a.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String str = myReader.nextLine();
                    buffer.append(str).append(str1);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditAdmin();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditAdmin2(s, a1);
                break;
            }
            case "3": {
                oldLine = PHONE_NUMBER + a1.getPhoneNumber();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                System.out.print("\t\t\t\t\t\t\t");
                phNum = obj.nextLine();
                while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                }
                a1.setPhoneNumber(phNum);
                newLine = PHONE_NUMBER + a1.getPhoneNumber();
                File myfile = new File(id + "a.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String str = myReader.nextLine();
                    buffer.append(str).append(str1);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditAdmin();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditAdmin2(s, a1);
                break;
            }
            case "4": {
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                AdminWork2(ch, a1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                EditAdmin();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditAdmin2(s, a1);
            }
        }
    }

    private static void Accounts() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                     ACCOUNTS MENU                       ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Doctor Salary                               ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Patient Fee                                 ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void Accounts2(String ch2, ADMIN a1) throws IOException, InterruptedException {
        String s = ch2;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        int j = 0, i, k = 0;
        String ch;
        boolean paid, match = true, found = true;
        boolean[] p = new boolean[INT];
        boolean a = true;
        for (i = 0; INT > i; i++) {
            p[i] = false;
        }
        char c = 0;
        File myfile;
        Scanner myReader = null;
        String[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
        List<DOCTOR> d = new ArrayList<>();
        String sen = "", cid, name, month, oldLine, newLine, content, oldLine2, newLine2;
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Doctor Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Month Name for which Salary is being Checked");
                System.out.print("\t\t\t\t\t\t\t");
                month = obj.nextLine();
                while (match) {
                    for (i = 0; INT > i; i++) {
                        if ((month).equalsIgnoreCase(months[i])) {
                            match = false;
                            k = i;
                            break;
                        }
                    }
                    if (match) {
                        System.out.println("\n\n\t\t\t\t\t\t\tEnter CORRECT Month Name for which Salary is being Checked");
                        System.out.print("\t\t\t\t\t\t\t");
                        month = obj.nextLine();
                    }
                }
                d = doctorReader();
                while (a) {
                    for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
                        DOCTOR doctor = d.get(i);
                        String doctorName = doctor.getName();
                        String doctorId = doctor.getId();
                        if (name.equalsIgnoreCase(doctorName)) {
                            myfile = new File(doctorId + "d.txt");
                            myReader = new Scanner(myfile);
                            a = false;
                            break;
                        }
                    }
                    if (a) {
                        System.out.println("\n\n\t\t\t\t\t\t\tEnter CORRECT Doctor Name");
                        System.out.print("\t\t\t\t\t\t\t");
                        name = obj.nextLine();
                    }
                }
                while (myReader.hasNextLine()) {
                    j = 0;
                    sen = myReader.nextLine();
                    while (CHAR1 != sen.charAt(j)) {
                        if (j == sen.length() - 1) {
                            break;
                        }
                        j++;
                    }
                    if (sen.substring(0, j).equals(months[k])) {
                        break;
                    }
                }
                myReader.close();
                String substring = sen.substring(j + 2);
                paid = Boolean.parseBoolean(substring);
                if (paid) {
                    System.out.println("\n\n\t\t\t\t\t\t\tSalary for month " + month + " is paid");
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t\tSalary for month " + month + " is not paid");
                    Thread.sleep(MILLIS1);
                    System.out.println("\n\n\t\t\t\t\t\t\tDo you want to pay salary?Press y/Y");
                    while (found) {
                        try {
                            System.out.print("\t\t\t\t\t\t\t");
                            c = obj.next().charAt(0);
                            found = false;
                        } catch (InputMismatchException e) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter one character choice");
                            System.out.print("\t\t\t\t\t\t\t");
                            c = obj.next().charAt(0);
                        }
                    }
                    if (CHAR2 == c || CHAR3 == c) {
                        p[k] = true;
                        for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
                            DOCTOR doctor = d.get(i);
                            String doctorName = doctor.getName();
                            String doctorId = doctor.getId();
                            if (name.equals(doctorName)) {
                                doctor.setSalaryPaid(p);
                                oldLine = months[k] + ": false";
                                newLine = months[k] + ": " + p[k];
                                oldLine2 = ACCOUNT + doctor.getAccount();
                                int doctorSalary = doctor.getSalary();
                                doctor.setAccount(doctorSalary);
                                newLine2 = ACCOUNT + doctor.getAccount();
                                myfile = new File(doctorId + "d.txt");
                                myReader = new Scanner(myfile);
                                StringBuilder buffer = new StringBuilder();
                                while (myReader.hasNextLine()) {
                                    String lineSeparator = System.lineSeparator();
                                    String nextLine = myReader.nextLine();
                                    buffer.append(nextLine).append(lineSeparator);
                                }
                                content = buffer.toString();
                                myReader.close();
                                content = content.replaceAll(oldLine, newLine);
                                content = content.replaceAll(oldLine2, newLine2);
                                FileWriter myWriter = new FileWriter(myfile);
                                myWriter.append(content);
                                myWriter.flush();
                                myWriter.close();
                                break;
                            }
                        }
                    }
                }
                Thread.sleep(MILLIS);
                Accounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Accounts2(s, a1);
                break;
            }
            case "2": {
                myfile = new File("fees.txt");
                myReader = new Scanner(myfile);
                i = 0;
                while (myReader.hasNextLine()) {
                    sen = myReader.nextLine();
                    i++;
                    System.out.println("\n\t\t\t\t\t\t\t" + sen);
                }
                System.out.println("\n\n\t\t\t\t\t\t\tTotal Fees: " + (i * 1000));
                Thread.sleep(MILLIS);
                Accounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Accounts2(s, a1);
                break;
            }
            case "3": {
                AdminWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                AdminWork2(ch, a1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                Accounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Accounts2(s, a1);
            }
        }
    }

    private static void DoctorAccounts() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                     ACCOUNTS MENU                       ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Monthly Salary                              ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Balance                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void DoctorAccounts2(String ch2, DOCTOR d1) throws IOException, InterruptedException {
        String s = ch2;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        int i;
        String[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
        String ch, month;
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Month name for salary check");
                System.out.print("\t\t\t\t\t\t\t");
                month = obj.nextLine();
                while (month.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the month");
                    System.out.print("\t\t\t\t\t\t\t");
                    month = obj.nextLine();
                }
                for (i = 0; INT > i; i++) {
                    if (month.equalsIgnoreCase(months[i])) {
                        break;
                    }
                }
                if (d1.isSalaryPaid(i)) {
                    System.out.println("\n\n\t\t\t\t\t\t\tSalary of " + months[i] + " is paid");
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t\tSalary of " + months[i] + " is not paid");
                }
                Thread.sleep(MILLIS);
                DoctorAccounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorAccounts2(s, d1);
                break;
            }
            case "2": {
                int account = d1.getAccount();
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tYour Current Account Balance is " + account);
                Thread.sleep(MILLIS);
                DoctorAccounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorAccounts2(s, d1);
                break;
            }
            case "3": {
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                DoctorWork2(ch, d1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                DoctorAccounts();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                DoctorAccounts2(s, d1);
            }
        }
    }

    private static void EditDoctor() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                      EDIT MENU                          ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Doctor Name                                 ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Doctor Email                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Doctor Phone Number                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          4. Doctor Qualification                        ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          5. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void EditDoctor2(String ch2, DOCTOR d1) throws InterruptedException, IOException {
        String s = ch2;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        String phNum = "0";
        boolean g = true;
        String ch, name, content, oldLine, newLine, email, education;
        String d1Id = d1.getId();
        String lineSeparator = System.lineSeparator();
        switch (s) {
            case "1": {
                oldLine = "Name: " + d1.getName();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                d1.setName(name);
                newLine = "Name: " + d1.getName();
                File myfile = new File(d1Id + "d.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditDoctor();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditDoctor2(s, d1);
                break;
            }
            case "2": {
                oldLine = EMAIL + d1.getEmail();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Email");
                System.out.print("\t\t\t\t\t\t\t");
                email = obj.nextLine();
                while (!email.contains(GMAIL_COM)) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the email");
                    System.out.print("\t\t\t\t\t\t\t");
                    email = obj.nextLine();
                }
                d1.setEmail(email);
                newLine = EMAIL + d1.getEmail();
                File myfile = new File(d1Id + "d.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditDoctor();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditDoctor2(s, d1);
                break;
            }
            case "3": {
                oldLine = PHONE_NUMBER + d1.getPhoneNumber();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                System.out.print("\t\t\t\t\t\t\t");
                phNum = obj.nextLine();
                while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                }
                d1.setPhoneNumber(phNum);
                newLine = PHONE_NUMBER + d1.getPhoneNumber();
                File myfile = new File(d1Id + "d.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditDoctor();
                obj.nextLine();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditDoctor2(s, d1);
                break;
            }
            case "4": {
                oldLine = QUALIFICATION + d1.getPhoneNumber();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Qualification");
                System.out.print("\t\t\t\t\t\t\t");
                education = obj.nextLine();
                while (education.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the qualification");
                    System.out.print("\t\t\t\t\t\t\t");
                    education = obj.nextLine();
                }
                d1.setEducation(education);
                newLine = QUALIFICATION + d1.getEducation();
                File myfile = new File(d1Id + "d.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditDoctor();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditDoctor2(s, d1);
                break;
            }
            case "5": {
                DoctorWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                DoctorWork2(ch, d1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                EditDoctor();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditDoctor2(s, d1);
            }
        }
    }

    private static DOCTOR retrieveDoctor(String iD) throws FileNotFoundException {
        File myfile = new File(iD + "d.txt");
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        int j = 0, expYr, i, salary, account;
        boolean[] paid = new boolean[INT];
        String[] timings = new String[7];
        String id, name, email, speciality, education, address;
        String phNum;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(j + 2);
        id = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        name = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        email = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        phNum = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        speciality = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        education = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        address = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        expYr = Integer.parseInt(substring);
        sen = myReader.nextLine();
        for (i = 0; 7 > i; i++) {
            sen = myReader.nextLine();
            j = 0;
            while (CHAR1 != sen.charAt(j)) {
                j++;
            }
            substring = sen.substring(j + 2);
            timings[i] = substring;
        }
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        salary = Integer.parseInt(substring);
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        account = Integer.parseInt(substring);
        sen = myReader.nextLine();
        for (i = 0; INT > i; i++) {
            sen = myReader.nextLine();
            j = 0;
            while (CHAR1 != sen.charAt(j)) {
                j++;
            }
            substring = sen.substring(j + 2);
            paid[i] = Boolean.parseBoolean(substring);
        }
        myReader.close();
        return new DOCTOR(id, name, email, speciality, address, education, expYr, phNum, salary, paid, account, timings);
    }

    private static PATIENT retrievePatient(String iD) throws IOException {
        File myfile = new File(iD + "p.txt");
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        HISTORY history = new HISTORY();
        int j = 0, i = 0, k = 0, age, wallet;
        String id, name, gender;
        String phNum;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(j + 2);
        id = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        name = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        phNum = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        age = Integer.parseInt(substring);
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        gender = substring;
        sen = myReader.nextLine();
        j = 0;
        while (CHAR1 != sen.charAt(j)) {
            j++;
        }
        substring = sen.substring(j + 2);
        wallet = Integer.parseInt(substring);
        myReader.close();
        myfile = new File(iD + HISTORY_TXT);
        if (!myfile.exists()) {
            myfile.createNewFile();
        }
        myReader = new Scanner(myfile);
        while (myReader.hasNextLine()) {
            sen = myReader.nextLine();
            i++;
        }
        myReader.close();
        APPOINTMENT[] appointments = new APPOINTMENT[i];
        i = 0;
        myfile = new File(iD + HISTORY_TXT);
        myReader = new Scanner(myfile);
        while (myReader.hasNextLine()) {
            sen = myReader.nextLine();
            j = 0;
            appointments[i] = new APPOINTMENT();
            while (CHAR != sen.charAt(j)) {
                j++;
            }
            String substring1 = sen.substring(0, j);
            appointments[i].setDate(substring1);
            j++;
            k = j;
            while (CHAR != sen.charAt(k)) {
                k++;
            }
            String substring2 = sen.substring(j, k);
            appointments[i].setPatientName(substring2);
            k++;
            j = k;
            while (CHAR != sen.charAt(j)) {
                j++;
            }
            String substring3 = sen.substring(k, j);
            appointments[i].setDoctorName(substring3);
            j++;
            k = j;
            while (CHAR != sen.charAt(k)) {
                k++;
            }
            substring2 = sen.substring(j, k);
            appointments[i].setProblem(substring2);
            k++;
            j = k;
            substring3 = sen.substring(k);
            appointments[i].setOutcome(substring3);
            j++;
            k = j;
            appointments[i].setBooked();
            i++;
        }
        history.setAppointment(appointments);
        return new PATIENT(id, name, gender, history, phNum, wallet, age);
    }

    private static void EditPatient() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                      EDIT MENU                          ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Patient Name                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Patient Age                                 ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Patient Phone Number                        ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          4. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void EditPatient2(String ch2, PATIENT p1) throws InterruptedException, IOException {
        String s = ch2;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        int age = 0;
        String phNum = "0";
        boolean g = true;
        String ch, name, content, oldLine, newLine;
        String p1Id = p1.getId();
        String lineSeparator = System.lineSeparator();
        switch (s) {
            case "1": {
                oldLine = "Name: " + p1.getName();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter New Name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                p1.setName(name);
                newLine = "Name: " + p1.getName();
                File myfile = new File(p1Id + "p.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditPatient();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditPatient2(s, p1);
                break;
            }
            case "2": {
                oldLine = "Age: " + p1.getAge();
                while (g) {
                    try {
                        System.out.println("\n\n\t\t\t\t\t\t\tEnter your age");
                        System.out.print("\t\t\t\t\t\t\t");
                        age = obj.nextInt();
                        g = false;
                    } catch (InputMismatchException e) {
                        System.out.println("\n\n\t\t\t\t\t\t\tENTER IN DIGITS " + e);
                        System.out.print("\t\t\t\t\t\t\t");
                        age = obj.nextInt();
                    }
                    obj.nextLine();
                }
                p1.setAge(age);
                newLine = "Age: " + p1.getAge();
                File myfile = new File(p1Id + "p.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                EditPatient();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditPatient2(s, p1);
                break;
            }
            case "3": {
                oldLine = PHONE_NUMBER + p1.getPhoneNumber();
                System.out.println("\n\n\t\t\t\t\t\t\tEnter phone number(without dashes)");
                System.out.print("\t\t\t\t\t\t\t");
                phNum = obj.nextLine();
                while (INT3 != phNum.length() || !phNum.startsWith("03")) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the CORRECT phone number");
                    System.out.print("\t\t\t\t\t\t\t");
                    phNum = obj.nextLine();
                }
                p1.setPhoneNumber(phNum);
                newLine = PHONE_NUMBER + p1.getPhoneNumber();
                File myfile = new File(p1Id + "p.txt");
                Scanner myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tEdit Successful");
                Thread.sleep(MILLIS);
                obj.nextLine();
                EditPatient();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditPatient2(s, p1);
                break;
            }
            case "4": {
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                PatientWork2(ch, p1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                EditPatient();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                EditPatient2(s, p1);
            }
        }
    }

    private static void retrieveHistory(PATIENT p1) throws InterruptedException, IOException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String p1Id = p1.getId();
        File myfile = new File(p1Id + HISTORY_TXT);
        Scanner myReader = new Scanner(myfile);
        String sen;
        int i = 0, j, k;
        if (myReader.hasNextLine()) {
            System.out.println("\n\n\t\t\t\t\t\tDate & Time       Patient Name    Doctor Name    Problem   OutCome");
            while (myReader.hasNextLine()) {
                sen = myReader.nextLine();
                i++;
            }
            myReader.close();
            APPOINTMENT[] appointments = new APPOINTMENT[i];
            i = 0;
            myfile = new File(p1Id + HISTORY_TXT);
            myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                sen = myReader.nextLine();
                j = 0;
                appointments[i] = new APPOINTMENT();
                while (CHAR != sen.charAt(j)) {
                    j++;
                }
                String substring = sen.substring(0, j);
                appointments[i].setDate(substring);
                j++;
                k = j;
                while (CHAR != sen.charAt(k)) {
                    k++;
                }
                String substring2 = sen.substring(j, k);
                appointments[i].setPatientName(substring2);
                k++;
                j = k;
                while (CHAR != sen.charAt(j)) {
                    j++;
                }
                String substring1 = sen.substring(k, j);
                appointments[i].setDoctorName(substring1);
                j++;
                k = j;
                while (CHAR != sen.charAt(k)) {
                    k++;
                }
                substring2 = sen.substring(j, k);
                appointments[i].setProblem(substring2);
                k++;
                j = k;
                substring1 = sen.substring(k);
                appointments[i].setOutcome(substring1);
                j++;
                k = j;
                appointments[i].setBooked();
                String date = appointments[i].getDate();
                String patientName = appointments[i].getPatientName();
                String doctorName = appointments[i].getDoctorName();
                String problem = appointments[i].getProblem();
                String outcome = appointments[i].getOutcome();
                System.out.println("\n\n\t\t\t\t\t" + date + "  " + patientName + "  " + doctorName + "  " + problem + "  " + outcome);
                i++;
            }
        } else {
            System.out.println("\n\n\t\t\t\t\t\t\tNo History Available");
        }
    }

    private static void appointment() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                     APPOINTMENT MENU                    ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Booking                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Cancellation                                ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void appointment2(String ch2, PATIENT p1) throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Scanner obj = new Scanner(System.in);
        String s = ch2, problem = null, ch, ch3, sen = null, cid, day2, day = null, date, outcome = null, name;
        String s1, oldLine, newLine, content, upperCase, formattedDate;
        String doctorSpeciality, doctor1Speciality, substring = null, p1Id = p1.getId(), lineSeparator = System.lineSeparator();
        int i = 0, j = 0, k = 0, time, sh, hr, min, fee, parseInt;
        boolean c = true, paid = false, delete = true, found = true;
        File myfile;
        Scanner myReader;
        LocalDate userDate, currentDate;
        APPOINTMENT app;
        DOCTOR doctor, doctor1, e;
        ArrayList<DOCTOR> d = new ArrayList<>();
        ArrayList<String> field = new ArrayList<>();
        ArrayList<APPOINTMENT> a = new ArrayList<>();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        d = doctorReader();
        i = 0;
        doctor1 = d.get(0);
        doctor1Speciality = doctor1.getSpeciality();
        doctor = d.get(i);
        String doctorId = doctor.getId();
        doctorSpeciality = doctor.getSpeciality();
        field.add(doctor1Speciality);
        for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
            doctor = d.get(i);
            doctorSpeciality = doctor.getSpeciality();
            for (j = 0; j < i; j++) {
                s1 = field.get(j);
                if (s1.equals(doctorSpeciality)) {
                    break;
                }
            }
            if (j == field.size()) {
                field.add(doctorSpeciality);
            }
        }
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tPlease choose from the following field");
                for (i = 0; i < field.size(); i++) {
                    s1 = field.get(i);
                    System.out.println("\n\n\t\t\t\t\t\t\t" + (i + 1) + ": " + s1);
                }
                System.out.print("\t\t\t\t\t\t\t");
                ch3 = obj.nextLine();
                while (found) {
                    try {
                        while (ch3.isEmpty() || Integer.parseInt(ch3) > (i + 1)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the field");
                            System.out.print("\t\t\t\t\t\t\t");
                            ch3 = obj.nextLine();
                        }
                        found = false;
                    } catch (NumberFormatException f) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                        System.out.print("\t\t\t\t\t\t\t");
                        ch3 = obj.nextLine();
                    }
                }
                System.out.println("\n\n\t\t\t\t\t\t\tAvailable Doctors");
                k = 1;
                for (i = 0; i < ADMIN.getNumberOfDoctors(); i++) {
                    doctor = d.get(i);
                    String speciality = doctor.getSpeciality();
                    parseInt = Integer.parseInt(ch3);
                    s1 = field.get(parseInt - 1);
                    if (s1.equalsIgnoreCase(speciality)) {
                        String doctorName = doctor.getName();
                        System.out.println("\n\t\t\t\t\t\t\t" + k + ": " + doctorName);
                        doctor.viewTiming();
                        k++;
                    } else {
                        d.remove(i);
                        i--;
                        ADMIN.setNumberOfDoctors2();
                    }
                }
                System.out.println("\n\n\t\t\t\t\t\t\tPlease choose the doctor");
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                found = true;
                while (found) {
                    try {
                        while (ch.isEmpty() || Integer.parseInt(ch) > (k - 1)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the doctor");
                            System.out.print("\t\t\t\t\t\t\t");
                            ch = obj.nextLine();
                        }
                        found = false;
                    } catch (NumberFormatException f) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                        System.out.print("\t\t\t\t\t\t\t");
                        ch = obj.nextLine();
                    }
                }
                System.out.println("\n\n\t\t\t\t\t\t\tEnter the day name");
                System.out.print("\t\t\t\t\t\t\t");
                day = obj.nextLine();
                parseInt = Integer.parseInt(ch);
                doctor = d.get(parseInt - 1);
                doctorId = doctor.getId();
                while (c) {
                    for (i = 0; 7 > i; i++) {
                        if (day.equalsIgnoreCase(days[i])) {
                            if (0 == hour(doctor, i)) {
                                System.out.println("\n\n\t\t\t\t\t\t\tDoctor is on OFF on " + days[i] +
                                        "\n\t\t\t\t\t\t\tPlease choose correct day");
                            } else {
                                c = false;
                                break;
                            }
                        }
                    }
                    if (c) {
                        System.out.println("\n\n\t\t\t\t\t\t\tEnter the CORRECT day name");
                        System.out.print("\t\t\t\t\t\t\t");
                        day = obj.nextLine();
                    }
                }
                System.out.println("\n\n\t\t\t\t\t\t\tEnter your problem");
                System.out.print("\t\t\t\t\t\t\t");
                problem = obj.nextLine();
                while (problem.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the problem");
                    System.out.print("\t\t\t\t\t\t\t");
                    problem = obj.nextLine();
                }
                upperCase = day.toUpperCase(Locale.ROOT);
                DayOfWeek userDayOfWeek = DayOfWeek.valueOf(upperCase);
                userDate = LocalDate.now().with(userDayOfWeek);
                currentDate = LocalDate.now();
                if (userDate.isBefore(currentDate)) {
                    userDate = userDate.plusWeeks(1);
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                formattedDate = userDate.format(formatter);
                hour(doctor, i);
                doctor.calculateMaxCount();
                if (doctor.getDoctorAppointmentCounter(i) == doctor.getMaxCount(i)) {
                    System.out.println("\n\n\t\t\t\t\t\t\tSorry to say, Today's slots are full." +
                            "\n\t\t\t\t\t\t\tPlease Change Doctor or Appointment Day");
                } else {
                    if (1000 <= p1.getWallet()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tFees collected through wallet");
                        paid = true;
                        oldLine = WALLET + p1.getWallet();
                        fee = p1.setWallet2();
                        newLine = WALLET + p1.getWallet();
                        myfile = new File(p1Id + "p.txt");
                        myReader = new Scanner(myfile);
                        StringBuilder buffer = new StringBuilder();
                        while (myReader.hasNextLine()) {
                            String nextLine = myReader.nextLine();
                            buffer.append(nextLine).append(lineSeparator);
                        }
                        content = buffer.toString();
                        myReader.close();
                        content = content.replaceAll(oldLine, newLine);
                        FileWriter myWriter = new FileWriter(myfile);
                        myWriter.append(content);
                        myWriter.flush();
                        myWriter.close();
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease enter paid(Rs.1000) fees amount");
                        System.out.print("\t\t\t\t\t\t\t");
                        fee = obj.nextInt();
                        while (1000 > fee) {
                            System.out.println("\n\n\t\t\t\t\t\t\tEnter correct paid(Rs.1000) fees amount");
                            System.out.print("\t\t\t\t\t\t\t");
                            fee = obj.nextInt();
                        }
                        paid = true;
                        if (1000 < fee) {
                            oldLine = WALLET + p1.getWallet();
                            p1.setWallet(fee - 1000);
                            newLine = WALLET + p1.getWallet();
                            myfile = new File(p1Id + "p.txt");
                            myReader = new Scanner(myfile);
                            StringBuilder buffer = new StringBuilder();
                            while (myReader.hasNextLine()) {
                                String nextLine = myReader.nextLine();
                                buffer.append(nextLine).append(lineSeparator);
                            }
                            content = buffer.toString();
                            myReader.close();
                            content = content.replaceAll(oldLine, newLine);
                            FileWriter myWriter = new FileWriter(myfile);
                            myWriter.append(content);
                            myWriter.flush();
                            myWriter.close();
                        }
                    }
                    myfile = new File("fee.txt");
                    FileWriter myWriter2 = new FileWriter(myfile);
                    String p1Name1 = p1.getName();
                    myWriter2.write(p1Name1 + HAS_PAID_RS_1000_FOR_APPOINTMENT_ON + formattedDate + "\n");
                    myWriter2.close();
                    myfile = new File(doctorId + "app.txt");
                    if (!myfile.exists()) {
                        myfile.createNewFile();
                    }
                    myReader = new Scanner(myfile);
                    while ((myReader.hasNextLine())) {
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR4 != sen.charAt(j)) {
                            j++;
                        }
                        substring = sen.substring(0, j);
                        if (day.equalsIgnoreCase(substring)) {
                            doctor.setDoctorAppointmentCounter(i);
                        }
                    }
                    myReader.close();
                    time = 10 * doctor.getDoctorAppointmentCounter(i);
                    hr = time / INT2;
                    min = time % INT2;
                    sen = doctor.getTiming(i);
                    String substring1 = sen.substring(0, 1);
                    sh = Integer.parseInt(substring1);
                    time = sh + hr;
                    if (0 == min) {
                        date = days[i] + ", " + formattedDate + ", " + time + ": 00";
                    } else {
                        date = days[i] + ", " + formattedDate + ", " + time + ": " + min;
                    }
                    outcome = AWAITING;
                    String p1Name = p1.getName();
                    String doctorName = doctor.getName();
                    APPOINTMENT a1 = new APPOINTMENT(date, p1Name, doctorName, problem, outcome, true);
                    myfile = new File(doctorId + "app.txt");
                    FileWriter myWriter = new FileWriter(myfile, true);
                    String str = date + "*" + p1Name + "*" + doctorName + "*" + problem + "*" + outcome + "*" + paid + "\n";
                    myWriter.write(str);
                    myWriter.close();
                    a1.viewAppointment();
                }
                break;
            }
            case "2": {
                parseInt = chooseDoctor(d);
                doctor = d.get(parseInt - 1);
                doctorId = doctor.getId();
                a = appointmentReader(doctorId);
                System.out.println("\n\n\t\t\t\t\t\t\tEnter your name");
                System.out.print("\t\t\t\t\t\t\t");
                name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = obj.nextLine();
                }
                System.out.println("\n\n\t\t\t\t\t\t\tEnter the day name");
                System.out.print("\t\t\t\t\t\t\t");
                day = obj.nextLine();
                while (c) {
                    for (i = 0; 7 > i; i++) {
                        if (day.equalsIgnoreCase(days[i])) {
                            c = false;
                            break;
                        }
                    }
                    if (c) {
                        System.out.println("\n\n\t\t\t\t\t\t\tEnter the CORRECT day name");
                        System.out.print("\t\t\t\t\t\t\t");
                        day = obj.nextLine();
                    }
                }
                upperCase = day.toUpperCase(Locale.ROOT);
                DayOfWeek userDayOfWeek = DayOfWeek.valueOf(upperCase);
                userDate = LocalDate.now().with(userDayOfWeek);
                currentDate = LocalDate.now();
                if (userDate.isBefore(currentDate)) {
                    userDate = userDate.plusWeeks(1);
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                formattedDate = userDate.format(formatter);
                for (i = 0; i < a.size(); i++) {
                    j = 0;
                    APPOINTMENT appointment = a.get(i);
                    String appointmentDate = appointment.getDate();
                    while (CHAR4 != appointmentDate.charAt(j)) {
                        j++;
                    }
                    day2 = appointmentDate.substring(0, j);
                    j++;
                    j++;
                    k = j;
                    while (CHAR4 != appointmentDate.charAt(k)) {
                        k++;
                    }
                    date = appointmentDate.substring(j, k);
                    if (isBoolean(day2, day, date, name, formattedDate, appointment)) {
                        System.out.println("\n\n\t\t\t\t\t\t\tAppointment Cancelled");
                        delete = false;
                        oldLine = WALLET + p1.getWallet();
                        p1.setWallet(1000);
                        newLine = WALLET + p1.getWallet();
                        myfile = new File(p1Id + "p.txt");
                        myReader = new Scanner(myfile);
                        StringBuilder buffer = new StringBuilder();
                        while (myReader.hasNextLine()) {
                            String nextLine = myReader.nextLine();
                            buffer.append(nextLine).append(lineSeparator);
                        }
                        content = buffer.toString();
                        myReader.close();
                        content = content.replaceAll(oldLine, newLine);
                        FileWriter myWriter = new FileWriter(myfile);
                        myWriter.append(content);
                        myWriter.flush();
                        myWriter.close();
                        File inputFile = new File(doctorId + "app.txt");
                        File tempFile = new File("temp.tmp");
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                        String lineToRemove = appointment.getDate() + "*" + p1.getName() + "*" + doctor.getName()
                                + "*" + appointment.getProblem() + "*" + appointment.getOutcome() + "*" + appointment.isBooked();
                        String currentLine;
                        while (null != (currentLine = reader.readLine())) {
                            if (!currentLine.trim().equals(lineToRemove)) {
                                String property = System.getProperty(LINE_SEPARATOR);
                                writer.write(currentLine + property);
                            }
                        }
                        reader.close();
                        writer.close();
                        if (inputFile.delete()) {
                            tempFile.renameTo(inputFile);
                        }
                        inputFile = new File("fee.txt");
                        tempFile = new File("temp.tmp");
                        reader = new BufferedReader(new FileReader(inputFile));
                        writer = new BufferedWriter(new FileWriter(tempFile));
                        lineToRemove = p1.getName() + HAS_PAID_RS_1000_FOR_APPOINTMENT_ON + formattedDate;
                        while (null != (currentLine = reader.readLine())) {
                            if (!currentLine.trim().equals(lineToRemove)) {
                                String property = System.getProperty(LINE_SEPARATOR);
                                writer.write(currentLine + property);
                            }
                        }
                        reader.close();
                        writer.close();
                        if (inputFile.delete()) {
                            tempFile.renameTo(inputFile);
                        }
                    }
                }
                if (delete) {
                    System.out.println("\n\n\t\t\t\t\t\t\tNo Appointment is Booked. OR Appointment is Completed.");
                }
                break;
            }
            case "3": {
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                PatientWork2(ch, p1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                appointment();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                appointment2(s, p1);
            }
        }
    }

    private static boolean isBoolean(String day2, String day, String date, String name, String formattedDate, APPOINTMENT appointment) {
        String appPatientName = appointment.getPatientName();
        String appointmentOutcome = appointment.getOutcome();
        return (day.equalsIgnoreCase(day2)) && (appPatientName.equalsIgnoreCase(name)) && (date.equalsIgnoreCase(formattedDate))
                && appointmentOutcome.equalsIgnoreCase(AWAITING);
    }

    static int hour(DOCTOR d1, int a) {
        String sen = d1.getTiming(a);
        if ("off".equalsIgnoreCase(sen)) {
            return 0;
        }
        int sh, fh;
        String substring1 = sen.substring(0, 1);
        sh = Integer.parseInt(substring1);
        String substring = sen.substring(7, 8);
        fh = Integer.parseInt(substring);
        return fh - sh;
    }

    private static APPOINTMENT retrieveAppointment(File a, int line) throws FileNotFoundException {
        String sen = null;
        int j, i, k;
        Scanner myReader = new Scanner(a);
        for (i = 0; i < line; i++) {
            sen = myReader.nextLine();
        }
        j = 0;
        APPOINTMENT appointments = new APPOINTMENT();
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(0, j);
        appointments.setDate(substring);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        String substring2 = sen.substring(j, k);
        appointments.setPatientName(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring1 = sen.substring(k, j);
        appointments.setDoctorName(substring1);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        substring2 = sen.substring(j, k);
        appointments.setProblem(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        substring1 = sen.substring(k, j);
        appointments.setOutcome(substring1);
        appointments.setBooked();
        myReader.close();
        return appointments;
    }

    private static void Organ() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO PORTAL                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                     Organ System                        ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          1. Donation                                    ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          2. Acceptance                                  ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (          3. Go Back                                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void Organ2(String ch2, PATIENT p1) throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String ch, s = ch2, sen, organ, quantity, oldLine, newLine, content, lineSeparator = System.lineSeparator();
        int i = 0, j = 0;
        boolean found = true;
        ArrayList<String> organs = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        File myfile = new File(ORGAN_TXT);
        Scanner myReader = new Scanner(myfile);
        if ("1".equals(ch2) || "2".equals(ch2)) {
            System.out.println("\n\n\t\t\t\t\t\t\tAvailable Organs");
            while (myReader.hasNextLine()) {
                sen = myReader.nextLine();
                j = 0;
                while (CHAR1 != sen.charAt(j)) {
                    j++;
                }
                organ = sen.substring(0, j);
                organs.add(organ);
                String substring = sen.substring((j + 2));
                Integer valueOf = Integer.parseInt(substring);
                count.add(valueOf);
                System.out.println("\n\n\t\t\t\t\t\t\t" + (i + 1) + ": " + organ);
                i++;
            }
            myReader.close();
        }
        int parseInt;
        switch (ch2) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tChoose the organ from the list");
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                while (found) {
                    try {
                        while (ch.isEmpty() || Integer.parseInt(ch) > (i + 1)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the organ");
                            System.out.print("\t\t\t\t\t\t\t");
                            ch = obj.nextLine();
                        }
                        found = false;
                    } catch (NumberFormatException e) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                        System.out.print("\t\t\t\t\t\t\t");
                        ch = obj.nextLine();
                    }
                }
                parseInt = Integer.parseInt(ch);
                System.out.println("\n\n\t\t\t\t\t\t\tEnter the quantity");
                System.out.print("\t\t\t\t\t\t\t");
                quantity = obj.nextLine();
                while (quantity.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the quantity");
                    System.out.print("\t\t\t\t\t\t\t");
                    quantity = obj.nextLine();
                }
                oldLine = organs.get(parseInt - 1) + ": " + count.get(parseInt - 1);
                newLine = organs.get(parseInt - 1) + ": " + (count.get(parseInt - 1) + Integer.parseInt(quantity));
                myfile = new File(ORGAN_TXT);
                myReader = new Scanner(myfile);
                StringBuilder buffer = new StringBuilder();
                while (myReader.hasNextLine()) {
                    String nextLine = myReader.nextLine();
                    buffer.append(nextLine).append(lineSeparator);
                }
                content = buffer.toString();
                myReader.close();
                content = content.replaceAll(oldLine, newLine);
                FileWriter myWriter = new FileWriter(myfile);
                myWriter.append(content);
                myWriter.flush();
                myWriter.close();
                myfile = new File(ORGAN_HISTORY_TXT);
                myWriter = new FileWriter(myfile, true);
                sen = p1.getName() + " donates " + quantity + " " + organs.get(parseInt - 1) + "\n";
                myWriter.write(sen);
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\tDonation Successful");
                break;
            }
            case "2": {
                System.out.println("\n\n\t\t\t\t\t\t\tChoose the organ from the list");
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                while (found) {
                    try {
                        while (ch.isEmpty() || Integer.parseInt(ch) > (i + 1)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease CHOOSE the organ");
                            System.out.print("\t\t\t\t\t\t\t");
                            ch = obj.nextLine();
                        }
                        found = false;
                    } catch (NumberFormatException e) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease Enter correct choice");
                        System.out.print("\t\t\t\t\t\t\t");
                        ch = obj.nextLine();
                    }
                }
                parseInt = Integer.parseInt(ch);
                if (0 == count.get(parseInt - 1)) {
                    System.out.println("\n\n\t\t\t\t\t\t\tThis organ is not available at the moment.\n\t\t\t\t\t\t\tPlease try again later");
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter the quantity");
                    System.out.print("\t\t\t\t\t\t\t");
                    quantity = obj.nextLine();
                    if (Integer.parseInt(quantity) > count.get(parseInt - 1)) {
                        System.out.println("\n\n\t\t\t\t\t\t\tThe quantity is greater then available amount.\n\t\t\t\t\t\t\tEnter new quantity");
                        System.out.print("\t\t\t\t\t\t\t");
                        quantity = obj.nextLine();
                    }
                    while (quantity.isEmpty() || Integer.parseInt(quantity) > count.get(parseInt - 1)) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the quantity");
                        System.out.print("\t\t\t\t\t\t\t");
                        quantity = obj.nextLine();
                    }
                    oldLine = organs.get(parseInt - 1) + ": " + count.get(parseInt - 1);
                    newLine = organs.get(parseInt - 1) + ": " + (count.get(parseInt - 1) - Integer.parseInt(quantity));
                    myfile = new File(ORGAN_TXT);
                    myReader = new Scanner(myfile);
                    StringBuilder buffer = new StringBuilder();
                    while (myReader.hasNextLine()) {
                        String nextLine = myReader.nextLine();
                        buffer.append(nextLine).append(lineSeparator);
                    }
                    content = buffer.toString();
                    myReader.close();
                    content = content.replaceAll(oldLine, newLine);
                    FileWriter myWriter = new FileWriter(myfile);
                    myWriter.append(content);
                    myWriter.flush();
                    myWriter.close();
                    myfile = new File(ORGAN_HISTORY_TXT);
                    myWriter = new FileWriter(myfile, true);
                    sen = p1.getName() + " receives " + quantity + " " + organs.get(parseInt - 1) + "\n";
                    myWriter.write(sen);
                    myWriter.close();
                    System.out.println("\n\n\t\t\t\t\t\t\tAcceptance Successful");
                }
                break;
            }
            case "3": {
                PatientWork();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                PatientWork2(ch, p1);
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(MILLIS1);
                Organ();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                Organ2(s, p1);
            }
        }
    }
}

@SuppressWarnings("ALL")
class ADMIN {
    public static final String EMAIL = ", email='";
    public static final String PHONE_NUMBER = ", phoneNumber=";
    private static int NumberOfDoctors;

    static int getNumberOfDoctors() {
        return NumberOfDoctors;
    }

    static void setNumberOfDoctors() {
        NumberOfDoctors++;
    }

    static void setNumberOfDoctors(int a) {
        NumberOfDoctors = 0;
    }
    static void setNumberOfDoctors2() { NumberOfDoctors--; }

    static int getNumberOfPatients() {
        return NumberOfPatients;
    }

    static void setNumberOfPatients() {
        NumberOfPatients++;
    }

    static void setNumberOfPatients(int a) {
        NumberOfPatients = 0;
    }

    private static int NumberOfPatients;
    private String id, name, email;
    private String phoneNumber;

    ADMIN(String id, String name, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void viewDoctor(DOCTOR doctor) {
        doctor.viewDetails();
    }

    @Override
    public String toString() {
        return "ADMIN{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                EMAIL + email + '\'' +
                PHONE_NUMBER + phoneNumber +
                '}';
    }
}

class DOCTOR {
    private static final int INT = 12;
    private static final char CHAR = '\'';
    private static final char CHAR1 = '}';
    private final int[] maxCount = new int[7];
    private final String id;
    private String name;
    private String email;
    private final String speciality;
    private String education;
    private final String address;
    private String[] timing = new String[7];
    private String phoneNumber;
    private final int experienceYears;
    private final int Salary;
    private int account;
    private final int[] DoctorAppointmentCounter = {0, 0, 0, 0, 0, 0, 0};

    int getDoctorAppointmentCounter(int a) {
        return this.DoctorAppointmentCounter[a];
    }

    void setDoctorAppointmentCounter(int a) {
        this.DoctorAppointmentCounter[a] += 1;
    }

    String getTiming(int a) {
        return this.timing[a];
    }

    int getAccount() {
        return this.account;
    }

    void setAccount(int accounts) {
        this.account += accounts;
    }

    private boolean[] SalaryPaid = new boolean[INT];

    boolean isSalaryPaid(int i) {
        return this.SalaryPaid[i];
    }

    void setSalaryPaid(boolean[] salaryPaid) {
        this.SalaryPaid = salaryPaid.clone();
    }

    int getSalary() {
        return this.Salary;
    }

    String getId() {
        return this.id;
    }

    DOCTOR(String iD, String names, String emails, String specialities, String addresses,
           String educations, int experiences, String phoneNumbers, int salary, boolean[] paid, int accounts, String[] timings) {
        this.name = names;
        this.id = iD;
        this.email = emails;
        this.phoneNumber = phoneNumbers;
        this.speciality = specialities;
        this.education = educations;
        this.timing = timings.clone();
        this.address = addresses;
        this.experienceYears = experiences;
        ADMIN.setNumberOfDoctors();
        this.Salary = salary;
        this.SalaryPaid = paid.clone();
        this.account = accounts;
    }

    int getMaxCount(int a) {
        return this.maxCount[a];
    }

    void viewTiming() {
        System.out.println("\n\t\t\t\t\t\t\tMonday: " + this.timing[0]);
        System.out.println("\t\t\t\t\t\t\tTuesday: " + this.timing[1]);
        System.out.println("\t\t\t\t\t\t\tWednesday: " + this.timing[2]);
        System.out.println("\t\t\t\t\t\t\tThursday: " + this.timing[3]);
        System.out.println("\t\t\t\t\t\t\tFriday: " + this.timing[4]);
        System.out.println("\t\t\t\t\t\t\tSaturday: " + this.timing[5]);
        System.out.println("\t\t\t\t\t\t\tSunday: " + this.timing[6]);
    }

    void calculateMaxCount() {
        for (int i = 0; 7 > i; i++) {
            this.maxCount[i] = Main.hour(this, i) * 6;
        }
    }

    String getSpeciality() {
        return this.speciality;
    }

    String getEducation() {
        return this.education;
    }

    void setEducation(String educations) {
        this.education = educations;
    }

    String getName() {
        return this.name;
    }

    void setName(String names) {
        this.name = names;
    }

    String getEmail() {
        return this.email;
    }

    void setEmail(String emails) {
        this.email = emails;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    void setPhoneNumber(String phoneNumbers) {
        this.phoneNumber = phoneNumbers;
    }

    void viewDetails() {
        System.out.println("\t\t\t\t\t\t\tName: " + this.name);
        System.out.println("\t\t\t\t\t\t\tEmail: " + this.email);
        System.out.println("\t\t\t\t\t\t\tPhone Number: " + this.phoneNumber);
        System.out.println("\t\t\t\t\t\t\t" + this.speciality + " Specialist");
        System.out.println("\t\t\t\t\t\t\tEducation: " + this.education);
        System.out.println("\t\t\t\t\t\t\tAddress: " + this.address);
        System.out.println("\t\t\t\t\t\t\t" + this.experienceYears + " years of experience");
        System.out.println("\t\t\t\t\t\t\tSalary: " + this.Salary);
        System.out.println("\n\t\t\t\t\t\t\tTimings");
        System.out.println("\t\t\t\t\t\t\tMonday: " + this.timing[0]);
        System.out.println("\t\t\t\t\t\t\tTuesday: " + this.timing[1]);
        System.out.println("\t\t\t\t\t\t\tWednesday: " + this.timing[2]);
        System.out.println("\t\t\t\t\t\t\tThursday: " + this.timing[3]);
        System.out.println("\t\t\t\t\t\t\tFriday: " + this.timing[4]);
        System.out.println("\t\t\t\t\t\t\tSaturday: " + this.timing[5]);
        System.out.println("\t\t\t\t\t\t\tSunday: " + this.timing[6]);
    }

    @Override
    public String toString() {
        return "DOCTOR{" +
                "maxCount=" + Arrays.toString(this.maxCount) +
                ", id='" + this.id + CHAR +
                ", name='" + this.name + CHAR +
                ADMIN.EMAIL + this.email + CHAR +
                ", speciality='" + this.speciality + CHAR +
                ", education='" + this.education + CHAR +
                ", address='" + this.address + CHAR +
                ", timing=" + Arrays.toString(this.timing) +
                ADMIN.PHONE_NUMBER + this.phoneNumber +
                ", experienceYears=" + this.experienceYears +
                ", Salary=" + this.Salary +
                ", account=" + this.account +
                ", DoctorAppointmentCounter=" + Arrays.toString(this.DoctorAppointmentCounter) +
                ", SalaryPaid=" + Arrays.toString(this.SalaryPaid) +
                CHAR1;
    }
}

class PATIENT {
    private static final char CHAR = '}';
    private static final char CHAR1 = '\'';
    private final String id;
    private String name;
    private final String gender;
    private final HISTORY history;
    private String phoneNumber;
    private int age, wallet;

    String getId() {
        return this.id;
    }

    int getWallet() {
        return this.wallet;
    }

    void setWallet(int wallets) {
        this.wallet += wallets;
    }

    int setWallet2() {
        this.wallet -= 1000;
        return 1000;
    }

    String getName() {
        return this.name;
    }

    void setName(String names) {
        this.name = names;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    void setPhoneNumber(String phoneNumbers) {
        this.phoneNumber = phoneNumbers;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int ages) {
        this.age = ages;
    }

    PATIENT(String ids, String names, String genders, HISTORY histories, String phoneNumbers, int wallets, int ages) {
        this.name = names;
        this.id = ids;
        this.phoneNumber = phoneNumbers;
        this.age = ages;
        this.gender = genders;
        this.history = histories;
        this.wallet = wallets;
        ADMIN.setNumberOfPatients();
    }

    @Override
    public String toString() {
        return "PATIENT{" +
                "id='" + this.id + CHAR1 +
                ", name='" + this.name + CHAR1 +
                ", gender='" + this.gender + CHAR1 +
                ", history=" + this.history +
                ADMIN.PHONE_NUMBER + this.phoneNumber +
                ", age=" + this.age +
                ", wallet=" + this.wallet +
                CHAR;
    }
}

class APPOINTMENT {
    private static final char CHAR = '\'';
    private static final char CHAR1 = '}';
    private String date;
    private String patientName;
    private String doctorName;
    private String Problem;
    private String Outcome;
    private boolean booked;

    APPOINTMENT(String dates, String patientNames, String doctorNames, String problems, String outcomes, boolean books) {
        this.date = dates;
        this.patientName = patientNames;
        this.doctorName = doctorNames;
        this.Problem = problems;
        this.Outcome = outcomes;
        this.booked = books;
    }

    void viewAppointment() {
        System.out.println("\t\t\t\t\t\t\tDate & Time: " + this.date + "\n\t\t\t\t\t\t\tPatient Name: " + this.patientName +
                "\n\t\t\t\t\t\t\tDoctor Name: " + this.doctorName + "\n\t\t\t\t\t\t\tProblem: " +
                this.Problem + "\n\t\t\t\t\t\t\tOutcome: " + this.Outcome + "\n\t\t\t\t\t\t\tBooking:  " + this.booked);
    }

    boolean isBooked() {
        return this.booked;
    }

    void setBooked() {
        this.booked = true;
    }

    String getDate() {
        return this.date;
    }

    void setDate(String dates) {
        this.date = dates;
    }

    String getPatientName() {
        return this.patientName;
    }

    void setPatientName(String patientNames) {
        this.patientName = patientNames;
    }

    String getDoctorName() {
        return this.doctorName;
    }

    void setDoctorName(String doctorNames) {
        this.doctorName = doctorNames;
    }

    String getProblem() {
        return this.Problem;
    }

    void setProblem(String problem) {
        this.Problem = problem;
    }

    String getOutcome() {
        return this.Outcome;
    }

    void setOutcome(String outcome) {
        this.Outcome = outcome;
    }

    APPOINTMENT() {
    }

    @Override
    public String toString() {
        return "APPOINTMENT{" +
                "date='" + this.date + CHAR +
                ", patientName='" + this.patientName + CHAR +
                ", doctorName='" + this.doctorName + CHAR +
                ", Problem='" + this.Problem + CHAR +
                ", Outcome='" + this.Outcome + CHAR +
                ", booked=" + this.booked +
                CHAR1;
    }
}

class HISTORY {
    private static final char CHAR = '}';
    private APPOINTMENT[] appointment;

    HISTORY() {
    }

    void setAppointment(APPOINTMENT[] appointments) {
        this.appointment = appointments.clone();
    }

    @Override
    public String toString() {
        return "HISTORY{" +
                "appointment=" + Arrays.toString(this.appointment) +
                CHAR;
    }
}

enum PasswordApp {
    ;

    public static void main(String[] argv) {
        char[] password = null;
        try {
            password = PasswordField.getPassword("Enter your password: ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (null == password) {
            System.out.println("No password entered");
        } else {
            String valueOf = String.valueOf(password);
            System.out.println("The password entered is: " + valueOf);
        }
    }
}

enum PasswordField {
    ;
    private static final int INT = 128;
    private static final char VAL = ' ';
    private static final char CHAR = '\n';
    private static final char CHAR1 = '\r';

    static char[] getPassword(String prompt) throws IOException {
        InputStream inputStream = System.in;
        MaskingThread maskingthread = new MaskingThread(prompt);
        Thread thread = new Thread(maskingthread);
        thread.start();

        char[] lineBuffer;
        char[] buf;
        buf = lineBuffer = new char[INT];
        int room = buf.length;
        int offset = 0;
        int c;
        loop:
        while (true) {
            switch (c = inputStream.read()) {
                case -1:
                case CHAR:
                    break loop;
                case CHAR1:
                    int c2 = inputStream.read();
                    if ((CHAR != c2) && (-1 != c2)) {
                        if (!(inputStream instanceof PushbackInputStream)) {
                            inputStream = new PushbackInputStream(inputStream);
                        }
                        ((PushbackInputStream) inputStream).unread(c2);
                    } else {
                        break loop;
                    }
                default:
                    --room;
                    if (0 > room) {
                        buf = new char[offset + INT];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        Arrays.fill(lineBuffer, VAL);
                        lineBuffer = buf;
                    }
                    buf[offset] = (char) c;
                    offset++;
                    break;
            }
        }
        maskingthread.stopMasking();
        if (0 == offset) {
            return null;
        }
        char[] ret = new char[offset];
        System.arraycopy(buf, 0, ret, 0, offset);
        Arrays.fill(buf, VAL);
        return ret;
    }
}

class MaskingThread extends Thread {
    private static final char ECHO_CHAR = '*';
    private static final char CHAR = '}';
    private volatile boolean stop;

    MaskingThread(String prompt) {
        System.out.print(prompt);
    }

    public void run() {
        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        try {
            this.stop = true;
            while (this.stop) {
                char echoChar = ECHO_CHAR;
                System.out.print("\010" + echoChar);
                try {
                    sleep(1);
                } catch (InterruptedException iex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } finally {
            Thread.currentThread().setPriority(priority);
        }
    }

    void stopMasking() {
        this.stop = false;
    }

    @Override
    public String toString() {
        return "MaskingThread{" +
                "stop=" + this.stop +
                CHAR;
    }
}