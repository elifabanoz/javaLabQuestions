package part1;


import java.util.LinkedList;
import java.util.Scanner;

public class EmailApplication {
    private ListOfEmails inbox = new ListOfEmails();
    private ListOfEmails archive = new ListOfEmails();
    private ListOfEmails trash = new ListOfEmails();
    private LinkedList<Email> deletedEmails = new LinkedList<>();

    public void processCommand(String command) {
        char action = command.charAt(0);

        switch (action) {
            case 'N':
                String[] newEmailInfo = command.split("\n");
                if (newEmailInfo.length >= 5) {
                    String subject = newEmailInfo[1];
                    int id = Integer.parseInt(newEmailInfo[2]);
                    String message = newEmailInfo[3];
                    int time = Integer.parseInt(newEmailInfo[4]);
                    Email newEmail = new Email(subject, id, message, time);
                    inbox.add(newEmail);
                } else {
                    System.out.println("Invalid command. Please provide all required fields.");
                }
                break;

            case 'R':
                int emailId = Integer.parseInt(command.substring(2));
                Email emailToRead = inbox.read(emailId);
                if (emailToRead != null) {
                    System.out.println("Email id: " + emailToRead.getId());
                    System.out.println("Subject: " + emailToRead.getSubject());
                    System.out.println("Body: " + emailToRead.getMessage());
                    System.out.println("Time received: " + emailToRead.getTime());
                    System.out.println("Status: " + (emailToRead.isRead() ? "Read" : "Unread"));
                    emailToRead.markAsRead();
                } else {
                    System.out.println("No such email.");
                }
                break;

            case 'A':
                int archiveId = Integer.parseInt(command.substring(2));
                Email emailToArchive = inbox.delete(archiveId);
                if (emailToArchive != null) {
                    archive.add(emailToArchive);
                    System.out.println("Email " + archiveId + " archived.");
                } else {
                    System.out.println("No such email.");
                }
                break;

            case 'D':
                int deleteId = Integer.parseInt(command.substring(2));
                Email emailToDelete = inbox.delete(deleteId);
                if (emailToDelete != null) {
                    deletedEmails.push(emailToDelete);
                    System.out.println("Email " + deleteId + " is deleted.");
                } else {
                    System.out.println("No such email.");
                }
                break;

            case 'S':
                String folder = command.substring(2);
                switch (folder) {
                    case "Inbox":
                        inbox.showAll(true);
                        break;
                    case "Archive":
                        archive.showAll(true);
                        break;
                    case "Trash":
                        trash.showAll(true);
                        break;
                    default:
                        System.out.println("Invalid folder name.");
                }
                break;

            case 'U':
                String unreadFolder = command.substring(2);
                switch (unreadFolder) {
                    case "Inbox":
                        inbox.showAll(false);
                        break;
                    case "Archive":
                        archive.showAll(false);
                        break;
                    case "Trash":
                        trash.showAll(false);
                        break;
                    default:
                        System.out.println("Invalid folder name.");
                }
                break;

            case 'C':
                String clearFolder = command.substring(2);
                switch (clearFolder) {
                    case "Inbox":
                        moveAllToTrash(inbox);
                        break;
                    case "Archive":
                        moveAllToTrash(archive);
                        break;
                    case "Trash":
                        emptyTrash();
                        break;
                    default:
                        System.out.println("Invalid folder name.");
                }
                break;

            default:
                System.out.println("Invalid command.");
        }
    }

    private void moveAllToTrash(ListOfEmails folder) {
        LinkedList<Email> emails = folder.getEmails();
        while (!emails.isEmpty()) {
            Email email = emails.getFirst();
            emails.remove(email);
            trash.add(email);
        }
        System.out.println(folder.getClass().getSimpleName() + " emptied and all emails moved to Trash.");
    }

    private void emptyTrash() {
        deletedEmails.clear();
        System.out.println("Trash emptied.");
    }

    public static void main(String[] args) {
        EmailApplication emailApp = new EmailApplication();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            emailApp.processCommand(command);
        } 

       
        /*
        emailApp.processCommand("N \n eeelifelif\n3\nelif\n3\nelifelif");
        emailApp.processCommand("R33");
       

        emailApp.processCommand("N \nHello from CMPE242\n1234\nWelcome to the course\n2364675");
        emailApp.processCommand("N \nHomework 1 posted\n1237\nThis is your first homework\n2264672");
        emailApp.processCommand("S Inbox");
        
        */
      
        // HERE IS MY OUTPUT EXAMPLE WHEN MY CODE START: 
        
        /* Email id: 3
        Subject:  eeelifelif
        Body: elif
        Time received: 3
        Status: Unread
        Email id: 3, Subject:  eeelifelif, Message: elif, Time: 3, Read: Yes
        Email id: 1234, Subject: Hello from CMPE242, Message: Welcome to the course, Time: 2364675, Read: No
        Email id: 1237, Subject: Homework 1 posted, Message: This is your first homework, Time: 2264672, Read: No 
        */

        
       
    }


}

